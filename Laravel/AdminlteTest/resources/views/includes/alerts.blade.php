@if ($errors->any())
    <div class="alert alert-warning">
    @foreach($errors->all() as $error)
        <p>{{$error}}</p>

    @endforeach
    </div>
@endif

@if(session("msg"))
    <div class="alert alert-success">
        <p>{{session("msg")}}</p>
    </div>
@endif

@if(session("error"))
    <div class="alert alert-danger">
        <p>{{session("error")}}</p>
    </div>
@endif



