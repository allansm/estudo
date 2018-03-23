<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Model;
use Illuminate\Support\Facades\DB;

class Balance extends Model
{
    public $timestamps = false;
    
    public function deposit(float $value) : array{
        DB::beginTransaction();
        $before = ($this->amount != null)?$this->amount:0;
        $this->amount += $value;
        $deposit = $this->save();
        $historic = auth()->user()->historic()->create([
            'type' => 'I',
            'amount' => $value,
            'total_before' => $before,
            'total_after' => $this->amount,
            'date' => date("Ymd")
        ]);
        if($deposit && $historic){
            DB::commit();
            $arr = [
                "msg" => "deposito efetuado com sucesso",
                "sucess" => true
            ];
            return $arr;
        }else{
            DB::rollback();
            $arr = [
                "msg" => "erro ao depositar",
                "sucess" => false
            ];
            return $arr;
        }
    }
    public function widraw(float $value){
        if($this->amount < $value){
            $arr = [
              "msg" => "saldo insuficiente",
              "sucess" => false
            ];
            return $arr;
        }
        DB::beginTransaction();
        $before = ($this->amount != null)?$this->amount:0;
        $this->amount -= $value;
        $deposit = $this->save();
        $historic = auth()->user()->historic()->create([
            'type' => 'O',
            'amount' => $value,
            'total_before' => $before,
            'total_after' => $this->amount,
            'date' => date("Ymd")
        ]);
        if($deposit && $historic){
            DB::commit();
            $arr = [
                "msg" => "saque efetuado com sucesso",
                "sucess" => true
            ];
            return $arr;
        }else{
            DB::rollback();
            $arr = [
                "msg" => "erro ao sacar",
                "sucess" => false
            ];
            return $arr;
        }
    }
    public function transfer($user_id,float $value){
        DB::beginTransaction();
        //$usuario = auth()->user()->where("id",$user_id)->get()->first();
        $user = auth()->user();
        $usuario = $user->find($user_id);
        $tb = $usuario->balance()->firstOrCreate([]);
        $before = ($this->amount != null)?$this->amount:0;
        $this->amount -= $value;
        $t1 = $this->save();
        $before2 = ($tb->amount != null)?$tb->amount:0;
        $tb->amount += $value;
        $t2 = $tb->save();
        $historic1 = auth()->user()->historic()->create([
            'type' => 'T',
            'amount' => $value,
            'total_before' => $before,
            'total_after' => $this->amount,
            'date' => date("Ymd"),
            'user_id_transaction' => $user_id
        ]);
        $historic2 = $usuario->historic()->create([
            'type' => 'I',
            'amount' => $value,
            'total_before' => $before2,
            'total_after' => $tb->amount,
            'date' => date("Ymd"),
            'user_id_transaction' => auth()->user()->id
        ]);
        if($t1 && $t2 && $historic1 && $historic2){
            DB::commit();
            return $arr = [
              "msg" => "transferencia concluida",
              "sucess" => true
            ];
        }else{
            DB::rollback();
            return $arr = [
              "msg" => "erro ao transferir",
              "sucess" => false
            ];
        }
    }
}
