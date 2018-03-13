<?php

namespace App;

use Illuminate\Database\Eloquent\Model;
use App\Usuario;
use App\Pessoa;
use App\Compra;
use App\deposito;
class Conta extends Model
{
    protected $fillable = ["pessoa","usuario","saldo"];
    
    public function usuario(){
        return $this->belongsTo(Usuario::class,"usuario");
    }
    public function dados(){
        return $this->belongsTo(Pessoa::class,"pessoa");
    }
    public function compra(){
        return $this->hasMany(Compra::class,"conta");
    }
    public function deposito(){
        return $this->hasMany(Deposito::class,"conta");
    }
}
