<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\Auth;
use App\Compra;
use Illuminate\Support\Facades\DB;
class CompraController extends Controller
{
    public function index(){
        $compras = auth()->user()->conta->compra->all();
        return view("compra")->with("compras",$compras);
    }
    public function create(Request $request,Compra $compra){
        DB::beginTransaction();
        try{
            $compra->produto = $request->produto;
            $compra->valor = $request->valor;
            $compra->conta = auth()->user()->conta->id;
            $compra->save();
            DB::commit();
            return redirect()->back();
        }catch(Exception $e){
            DB::rollback();
        }
    }
    public function historico(){
        $compras = auth()->user()->conta->compra->all();
        $gasto = 0;
        foreach($compras as $compra){
            $gasto+= $compra->valor;
        }
        $saldoAtual = auth()->user()->conta->saldo - $gasto;
        return view("historico")->with("compras",$compras)->with("saldoAtual",$saldoAtual);
    }
    public function deletar(Request $request ,Compra $compra){
        $compra->where("id","=",$request->pid)->delete();
        return redirect()->back();
    }
}
