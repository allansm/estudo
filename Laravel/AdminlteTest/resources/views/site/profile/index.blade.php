@extends("site.layouts.app")

@section("title","admin/profile")

@section("content")
    <h2>Meu Perfil</h2>
    @include("includes.alerts")
    <form class="form" method="post" action="{{route("profile.update")}}" enctype="multipart/form-data">
        {!! csrf_field() !!}
        <div class="form-group"><label>Nome</label><input type="text" name="name" value="{{auth()->user()->name}}" class="form-control"></div>
        <div class="form-group"><label>E-mail</label><input type="text" name="email" value="{{auth()->user()->email}}" class="form-control"></div>
        <div class="form-group"><label>senha</label><input type="password" name="password" class="form-control"></div>
        <div class="form-group"><label>Imagem:</label>
        @if(auth()->user()->image != null)
            <img src="{{url("storage/users/".auth()->user()->image)}}" height='30px' width="30px">
        @endif
        <input type="file"  class="form-control" name="image"></div>
        <input type="submit" value="Atualizar Dados" class="btn btn-primary"> <a href="{{route("home")}}"><input type="button" class="btn btn-default" value="voltar"></a>
    </form>
@endsection