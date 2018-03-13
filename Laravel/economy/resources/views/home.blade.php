@extends("layouts.app")
@section("title","hiro-pc")
@section("content")
@auth
    <form method="post" action="{{route("usuario.update")}}">
        {!! csrf_field() !!}
        <table class="t1 bdarkb" style="padding:10px">
            <tr>
                <td>conta:</td>
                <td>{{auth()->user()->conta->id}}</td>
            </tr>
            <tr>
                <td>nome:</td>
                <td><input type="text" class="form-control" name="nome" value="{{auth()->user()->conta->dados->nome}}"></td>
            </tr>
            <tr>
                <td>numero usuario:</td>
                <td>{{auth()->user()->id}}</td>
            </tr>
            <tr>
                <td>login:</td>
                <td>{{auth()->user()->login}}</td>
            </tr>
            <tr>
                <td>senha:</td>
                <td><input type="password" class="form-control" name="senha"></td>
            </tr>
            <tr>
                <td>total de deposito:</td>
                <td>R$ {{auth()->user()->conta->saldo}}</td>
            </tr>
            <tr>
                <td><input type="submit" value="Update" class="bt btn"></td>
            </tr>
        </table>
    </form>
@endauth

@endsection

