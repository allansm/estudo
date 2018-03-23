<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\Balance;
use App\Http\Requests\MoneyValidationFormRequest;
use App\User;

class BalanceController extends Controller
{
    public function index(){
        $balance = auth()->user()->balance;
        $amount = ($balance != null) ? $balance->amount:0;
        return view("admin.balance.index",compact('amount'));
    }
    public function deposit(){
        return view("admin.balance.deposit");
    }
    public function widraw(){
        return view("admin.balance.widraw");
    }
    public function depositStore(MoneyValidationFormRequest $request){
        $balance = auth()->user()->balance()->firstOrCreate([]);
        $msg = $balance->deposit($request->value);
        if($msg["sucess"]){
            return redirect()->route("admin.balance")->with('msg',$msg["msg"]);
        }else{
            return redirect()->route("admin.balance")->with('error',$msg["msg"]);
        }
    }
    public function depositWidraw(MoneyValidationFormRequest $request){
       $balance = auth()->user()->balance;
       $amount = ($balance != null) ? $balance->amount:0;
       $msg = $balance->widraw($request->value);
       if($msg["sucess"]){
            return redirect()->route("admin.balance")->with("msg",$msg["msg"]);
       }else{
           return redirect()->route("admin.balance")->with("error",$msg["msg"]);
       }
    }
    public function transfer(){
        return view("admin.balance.transfer");
    }
    public function confirmTransfer(Request $request,User $user){
        $usuario = $user->getSender($request->value);
        if(!$usuario){
            return redirect()->back()->with("error","usuario não encontrado");
        }
        if($usuario->id == auth()->user()->id){
            return redirect()->back()->with("error","impossivel transferir para você mesmo");
        }
        return view("admin.balance.transfer-confirm",compact("usuario"));
    }
    public function executeTransfer(MoneyValidationFormRequest $request){
        //$sender = $user->find($user_id);
        $balance = auth()->user()->balance;
        $msg = $balance->transfer($request->user_id,$request->value);
        if($msg["sucess"]){
            return redirect()->route("admin.balance")->with("msg",$msg["msg"]);
        }else{
            return redirect()->route("admin.balance")->with("error",$msg["msg"]);
        }
    }
}
