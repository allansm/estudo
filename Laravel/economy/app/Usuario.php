<?php

namespace App;


use Illuminate\Foundation\Auth\User as Authenticable;
use App\Conta;
class Usuario extends User
{
    
    protected $guard = "web";
    protected $fillable = ['login','senha'];
    protected $hidden = ['senha','remember_token'];
    
    public function conta(){
        return $this->hasOne(Conta::class,"usuario");
    }
}
