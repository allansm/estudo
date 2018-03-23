<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\User;
use App\Models\Historic;
class HistoricController extends Controller
{
    private $total_res = 3;
    public function index(Historic $histo){
        $historics = auth()->user()->historic()->with("userTransaction")->paginate($this->total_res);
        $types = $histo->type();
        return view("admin.historic.index", compact("historics","types"));
    }
    public function searchHistory(Request $request,Historic $historic){
        //$arr = ["id" => $request->id,"date" => $request->date,"type" => $request->type];
        $arr = $request->all();
        $historics = $historic->search($arr,auth()->user()->id)->paginate($this->total_res);
        $types = $historic->type();
        return view("admin.historic.index", compact("historics","types","arr"));
        /*$historics = auth()->user()->historic()->get();
        $h = null;
        $i = 0;
        foreach($historics as $historic){
            if($historic->id == $request->id || $historic->date == $request->date || $historic->type == $request->type){
               $h[$i++] = $historic; 
            }
        }
        if($h == null){
            $historics = auth()->user()->historic()->with("userTransaction")->paginate($this->total_res);
            return view("admin.historic.index", compact("historics"));
        }
        $historics = $h;
        return view("admin.historic.result", compact("historics"));*/
        //dd($request->date);
    }
}
