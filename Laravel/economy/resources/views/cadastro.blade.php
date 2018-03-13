@extends("layouts.app")

@section("content")
<form method="post" action="{{route("cadastro")}}" class="">
    {!! csrf_field() !!}
    <table class="t2 bdarkb">
        <tr>
            <td>Nome:</td>
            <td><input type="text" name="nome" class="form-control"></td>
        </tr>
        <tr>
            <td>Sobrenome:</td>
            <td><input type="text" name="sobrenome" class="form-control"></td>
        </tr>
        <tr>
            <td>Email:</td>
            <td><input type="text" name="email" class="form-control"></td>
        </tr>
        <tr>
            <td>Telefone:</td>
            <td><input type="text" name="telefone" class="form-control"></td>
        </tr>
        <tr>
            <td>Usuario:</td>
            <td><input type="text" name="u" class="form-control"></td>
        </tr>
        <tr>
            <td>Senha:</td>
            <td><input type="password" name="s" class="form-control"></td>
        </tr>
        <tr>
            <td>Confirmar Senha:</td>
            <td><input type="password" name="cs" class="form-control"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Cadastrar" class="btn bt"></td>
        </tr>
    </table>
</form>
@endsection

