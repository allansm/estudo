<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class CreateContasTable extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('contas', function (Blueprint $table) {
            $table->increments('id');
            $table->integer("pessoa")->unsigned();
            $table->foreign("pessoa")->references("id")->on("pessoas")->onDelete("cascade");
            $table->integer("usuario")->unsigned();
            $table->foreign("usuario")->references("id")->on("usuarios")->onDelete("cascade");
            $table->double("saldo");
            $table->timestamps();
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::dropIfExists('contas');
    }
}
