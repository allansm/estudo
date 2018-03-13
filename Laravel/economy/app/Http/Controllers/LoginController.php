<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;
use App\Usuario;
use App\Pessoa;
use App\Conta;
use Illuminate\Support\Facades\Auth;
use Illuminate\Contracts\Auth\Authenticatable;
use Illuminate\Support\Facades\Hash;
use App\Http\Requests\UsuarioAutenticationRequest;

class LoginController extends Controller
{
    public function __construct() {
        $this->middleware("guest:web",["except"=>["logout","update"]]);
    }
    public function login(){
        return view("login");
    }
    public function cadastro(){
        return view("cadastro");
    }
    public function autenticate(Request $request,Usuario $usuario){
        $usuario = $usuario->where("login","=",$request->u)
                ->first();
        if($usuario){
            if(Hash::check($request->s,$usuario->senha)){
               auth()->login($usuario);
               return redirect()->route("home");
            }else{
                print("nao foi");
            }
        }else{
            print("usuario nao encontrado");
        }
    }
    public function logout(){
        auth()->logout();
        return redirect()->route("home");
    }
    public function create(Request $request,Usuario $usuario,Pessoa $pessoa,Conta $conta){
        DB::beginTransaction();
        try{
            if($request->s == $request->cs){
                $request->s = bcrypt($request->s);
                $usuario->login = $request->u;
                $usuario->senha = $request->s;
                $pessoa->nome = $request->nome;
                $pessoa->sobrenome = $request->sobrenome;
                $pessoa->telefone = $request->telefone;
                $pessoa->email = $request->email;
                $pessoa->save();
                $usuario->save();
                $pessoa = $pessoa->where("email","=",$pessoa->email)->first();
                $usuario = $usuario->where("login","=",$usuario->login)->where("senha","=",$usuario->senha)->first();
                $conta->usuario = $usuario->id;
                $conta->pessoa = $pessoa->id;
                $conta->saldo = 0;
                $conta->save();
                DB::commit();
                auth()->login($usuario);
                return redirect()->route("home");
                //return view("home");
            }
        }catch(Exception $e){
            DB::rollback();
            print("erro ao cadastrar");
        }
    }
    public function update(Request $request){
        if($request->senha != null && $request->senha != ""){
            try{
                DB::beginTransaction();
                auth()->user()->conta->dados->nome = $request->nome;
                auth()->user()->senha = bcrypt($request->senha);
                auth()->user()->save();
                auth()->user()->conta->dados->save();
                DB::commit();
            }catch(Exception $e){
                DB::rollback();
            }
        }
        return redirect()->back();
    }
}
