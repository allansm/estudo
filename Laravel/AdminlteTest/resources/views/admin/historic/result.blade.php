@extends('adminlte::page')

@section('title', 'AdminLTE')

@section('content_header')
    <h2>Historico</h2>
    <ol class="breadcrumb">
        <li><a href="">Dashboard</a></li>
        <li><a href="">Historico</a></li>
    </ol>
@stop

@section('content')
    <div class="box">
        <div class"box-header">
             <h3>Historico</h3>
        </div>
       
        <br/>
        <div class="box-body" style="min-height:500px">
            <table class="table table-bordered table-hover">
                    @forelse($historics as $historic)
                        <tr style="background:#466;color:#eee;border:2px outset #333">
                            <td>#</td>
                            <td>Tipo</td>
                            <td>Saldo</td>
                            <td>Data</td>
                            <td>Usuario</td>
                        </tr>
                        <tr>
                            <td>{{$historic->id}}</td>
                            <td>{{$historic->type($historic->type)}}</td>
                            <td>R$ {{$historic->amount}}</td>
                            <td>{{$historic->date}}</td>
                            @if($historic->user_id_transaction)
                                <td>{{$historic->userTransaction->name}}</td>
                            @else
                                <td> - </td>
                            @endif
                        </tr>
                        @empty
                    @endforelse
            </table>
            <form method="get" action="{{route("admin.historic")}}"><input type="submit" value="voltar" class="btn btn-primary"></form>
        </div>
    </div>
@stop

