<?php

namespace App;

use Illuminate\Database\Eloquent\Model;
use App\Conta;
class Compra extends Model
{
    protected $fillable = ["conta","produto","valor"];
    public function conta(){
        return $this->belongsTo(Conta::class,"conta");
    }
}
