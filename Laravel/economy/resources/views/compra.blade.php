@extends("layouts.app")
@section("title","hiro-pc")
@section("content")
    <form method="post" action="{{route("compra.cad")}}" class="">
        {!! csrf_field() !!}
        <table class="t1 bdarkb">
            <tr>
                <td>Produto:</td>
                <td><input type="text" name="produto" class="form-control"></td>
            </tr>
            <tr>
                <td>Valor:</td>
                <td><input type="number" name="valor" class="form-control"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Cadastrar" class="btn bt"></td>
            </tr>
        </table>
    </form>
@endsection
