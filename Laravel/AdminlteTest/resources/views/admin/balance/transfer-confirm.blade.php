@extends('adminlte::page')

@section('title', 'AdminLTE')

@section('content_header')
    <h2>Fazer Transferencia</h2>
    <ol class="breadcrumb">
        <li><a href="">Dashboard</a></li>
        <li><a href="">Saldo</a></li>
        <li><a href="">transferir</a></li>
        <li><a href="">confirmar</a></li>
    </ol>
@stop

@section('content')
    <div class="box">
        <div class"box-header">
             <h3>Fazer Transferencia</h3>
        </div>
        <div class="box-body">
            @include("includes.alerts")
            <form method='POST' action='{{route('deposit.transfer.execute')}}'>
                {!! csrf_field() !!}
                <input type="hidden" name="user_id" value="{{$usuario->id}}">
                <p><strong>Seu Saldo:</strong> R$ {{auth()->user()->balance->amount}} </p>
                <p><strong>Receptor:</strong> {{$usuario->name}} </p>
                <div class="form-group">
                    <input type="text" name="value" placeholder="valor" class='form-control'>
                </div>
                <div class="form-group">
                    <button type="submit" class='btn btn-success'>transferir</button>
                </div>
            </form>
        </div>
    </div>
@stop
