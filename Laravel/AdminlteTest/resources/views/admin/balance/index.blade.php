@extends('adminlte::page')

@section('title', 'AdminLTE')

@section('content_header')
    <h2>Saldo</h2>
    <ol class="breadcrumb">
        <li><a href="">Dashboard</a></li>
        <li><a href="">Saldo</a></li>
    </ol>
@stop

@section('content')
    <div class="box">
      <div class="box-header">
          <a href="{{route("balance.deposit")}}" class="btn btn-primary fa fa-cart-plus"> depositar</a>
          @if($amount > 0)
            <a href="{{route("balance.widraw")}}" class="btn btn-danger fa fa-cart-arrow-down"> sacar</a>
            <a href="{{route("balance.transfer")}}" class="btn btn-warning fa fa-exchange"> transferir</a>
          @endif
      </div>
      <br/>
       @include("includes.alerts")
      <!-- small box -->
      <div class="small-box bg-green">
        <div class="inner">
            <h3>R$ {{number_format($amount,2,'.','')}}</h3>
        </div>
        <div class="icon">
          <i class="ion ion-cash"></i>
        </div>
        <a href="{{route("admin.historic")}}" class="small-box-footer">historico <i class="fa fa-arrow-circle-right"></i></a>
      </div>
    </div>
@stop


