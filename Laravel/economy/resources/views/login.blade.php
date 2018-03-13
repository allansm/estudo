@extends("layouts.app")

@section("content")
<form method="post" action="{{route("autenticar")}}" class="">
    {!! csrf_field() !!}
    <table class="t1 bdarkb">
        <tr>
            <td>Usuario:</td>
            <td><input type="text" name="u" class="form-control"></td>
        </tr>
        <tr>
            <td>Senha:</td>
            <td><input type="password" name="s" class="form-control"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Autenticar" class="btn bt"></td>
            <td><a href="{{route("cadastro")}}">Cadastre-se aqui</a></td>
        </tr>
    </table>
</form>
@endsection

