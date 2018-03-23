@extends('adminlte::page')

@section('title', 'AdminLTE')

@section('content_header')
    <h2>Fazer Saque</h2>
    <ol class="breadcrumb">
        <li><a href="">Dashboard</a></li>
        <li><a href="">Saldo</a></li>
        <li><a href="">Sacar</a></li>
    </ol>
@stop

@section('content')
    <div class="box">
        <div class"box-header">
             <h3>Fazer Saque</h3>
        </div>
        <div class="box-body">
            @include("includes.alerts")
            <form method='POST' action='{{route('deposit.widraw')}}'>
                {!! csrf_field() !!}
                <div class="form-group">
                    <input type="text" name="value" placeholder="Valor Saque" class='form-control'>
                </div>
                <div class="form-group">
                    <button type="submit" class='btn btn-success'>Sacar</button>
                </div>
            </form>
        </div>
    </div>
@stop