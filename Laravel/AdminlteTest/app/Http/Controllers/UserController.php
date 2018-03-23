<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Http\Requests\UserValidationFormRequest;

class UserController extends Controller
{
    public function profile(){
        return view("site.profile.index");
    }
    public function update(UserValidationFormRequest $request){
        if(auth()->user()->userUpdate($request)){
            return redirect()->back()->with("msg","Dados atualizados com sucesso");
        }
        return redirect()->back()->with("error","Erro ao Atualizar dados");
    }
}
