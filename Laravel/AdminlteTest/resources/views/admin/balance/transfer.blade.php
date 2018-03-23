@extends('adminlte::page')

@section('title', 'AdminLTE')

@section('content_header')
    <h2>Fazer Transferencia</h2>
    <ol class="breadcrumb">
        <li><a href="">Dashboard</a></li>
        <li><a href="">Saldo</a></li>
        <li><a href="">transferir</a></li>
    </ol>
@stop

@section('content')
    <div class="box">
        <div class"box-header">
             <h3>Fazer Transferencia</h3>
        </div>
        <div class="box-body">
            @include("includes.alerts")
            <form method='POST' action='{{route('deposit.transfer')}}'>
                {!! csrf_field() !!}
                <div class="form-group">
                    <input type="text" name="value" placeholder="Email do Cliente a receber a tranferencia" class='form-control'>
                </div>
                <div class="form-group">
                    <button type="submit" class='btn btn-success'>proximo</button>
                </div>
            </form>
        </div>
    </div>
@stop
