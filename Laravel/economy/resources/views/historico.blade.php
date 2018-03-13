@extends("layouts.app")
@section("title","hiro-pc")
@section("content")
    <table class="t1 bdarkb ">
        <tr>
            <td>#:</td>
            <td>Usuario:</td>
            <td>Nome:</td>
            <td>Saldo Atual:</td>
        </tr>
        <tr>
            <td>{{auth()->user()->id}}</td>
            <td>{{auth()->user()->login}}</td>
            <td>{{auth()->user()->conta->dados->nome}}</td>
            <td style="color:{{($saldoAtual >= 0)?"green":"red"}}">R${{$saldoAtual}}</td>
        </tr>
    </table><br/>
    <div class="col-md-12">
        @foreach($compras as $compra)
            <div class='col-md-4' style='padding:40px'>
            <div style="background:#111;padding:10px;text-align:center" class="col-md-12">
                PRODUTO : {{$compra->produto}}<br/><br/>
                CUSTO : R$ {{$compra->valor}}<br/><br/>
                DATA : {{$compra->created_at}}<br/><br/>
                <form method="post" action="{{route("deletar")}}">
                    {!! csrf_field() !!}
                    <input type="text" name="pid" value="{{$compra->id}}" style="display:none">
                    <input type="submit" value="Deletar" class="bt btn"><br/><br/>
                </form>
            </div>
            </div>
        @endforeach
    </div>
@endsection


