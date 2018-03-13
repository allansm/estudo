<?php

namespace App;

use Illuminate\Database\Eloquent\Model;
use App\Conta;
class deposito extends Model
{
    protected $fillable = ["conta","valor"];
    
    public function conta(){
        return $this->belongsTo(Conta::class,"conta");
    }
}
