<?php

namespace App;

use Illuminate\Notifications\Notifiable;
use Illuminate\Foundation\Auth\User as Authenticatable;
use App\Models\Balance;
use App\Models\Historic;
use Illuminate\Support\Facades\DB;

class User extends Authenticatable
{
    use Notifiable;

    /**
     * The attributes that are mass assignable.
     *
     * @var array
     */
    protected $fillable = [
        'name', 'email', 'password','image'
    ];

    /**
     * The attributes that should be hidden for arrays.
     *
     * @var array
     */
    protected $hidden = [
        'password', 'remember_token',
    ];
    public function balance(){
        return $this->hasOne(Balance::class);
    }
    public function historic(){
        return $this->hasMany(Historic::class);
    }
    public function getSender($sender){
        return $this->where("email",$sender)->get()->first();
    }
    public function userUpdate($request){
        DB::beginTransaction();
        $this->name = $request->name;
        $this->email = $request->email;
        $problem = ($request->password == null)?true:false;
        if($problem){
            $request->password = $this->password;
        }
        $this->password = bcrypt($request->password);
        if($request->hasFile("image") && $request->file("image")->isValid()){
            $name = $this->id.kebab_case($this->name);
            $extension = $request->image->extension();
            $fileName = "{$name}.{$extension}";
            $this->image = $fileName;
            $upload = $request->image->storeAs("users",$fileName);
        }else{
            $upload = true;
        }
        $saved = $this->save();
        if($saved && $upload){
            DB::commit();
            return true;
        }else{
            DB::rollback();
            return false;
        }
    }
}
