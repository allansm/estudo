@extends("layouts.app")
@section("title","hiro-pc")
@section("content")
    <form method="post" action="{{route("depositar")}}" class="">
        {!! csrf_field() !!}
        <table class="t1 bdarkb">
            <tr>
                <td>Saldo Depositado:</td>
                <td>R$ {{auth()->user()->conta->saldo}}</td>
            </tr>
            <tr>
                <td>Valor:</td>
                <td><input type="number" name="valor" class="form-control"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Depositar" class="btn bt"></td>
            </tr>
        </table>
    </form><br/>
    <div class="col-md-12">
        @foreach($depositos as $deposito)
            <div class='col-md-4' style='padding:40px'>
                <div style="background:#111;padding:10px;text-align:center" class="col-md-12">
                    N° Deposito : {{$deposito->id}}<br/><br/>
                    Valor : R$ {{$deposito->valor}}<br/><br/>
                    DATA : {{$deposito->created_at}}<br/><br/>
                    <form method="post" action="{{route("deletar.deposito")}}">
                        {!! csrf_field() !!}
                        <input type="text" name="pid" value="{{$deposito->id}}" style="display:none">
                        <input type="submit" value="Deletar" class="bt btn"><br/><br/>
                    </form>
                </div>
            </div>
        @endforeach
    </div>
@endsection