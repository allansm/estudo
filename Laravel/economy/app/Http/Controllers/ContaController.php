<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\Auth;
use Illuminate\Support\Facades\DB;
use App\deposito;

class ContaController extends Controller
{
    public function deposito(){
        $depositos = auth()->user()->conta->deposito->all();
        return view("deposito")->with("depositos",$depositos);
    }
    public function depositar(Request $request,Deposito $deposito){
        try{
            DB::beginTransaction();
            $deposito->valor = $request->valor;
            $deposito->conta = auth()->user()->conta->id;
            auth()->user()->conta->saldo += $request->valor;
            auth()->user()->conta->save();
            $deposito->save();
            DB::commit();
            return redirect()->back();
        }catch(Exception $e){
            DB::rollback();
            return redirect()->back();
        }
    }
    public function deletar(Request $request,Deposito $deposito){
        try{
            $deposito = $deposito->where("id","=",$request->pid)->first();
            if($deposito->conta == auth()->user()->conta->id){
                DB::beginTransaction();
                auth()->user()->conta->saldo -= $deposito->valor;
                auth()->user()->conta->save();
                $deposito->delete();
                DB::commit();
            }else{
                return "impossivel deletar o deposito de outro usuario";
            }
        }catch(Exception $e){
            DB::rollback();
        }
        return redirect()->back();
    }
}
