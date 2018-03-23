<?php

$this->group(['middleware' =>['auth'],'prefix' => "/admin"],function(){
    $this->get('/', 'AdminController@index')->name('admin');
    $this->get("/balance","BalanceController@index")->name('admin.balance');
    $this->get("/balance/deposit","BalanceController@deposit")->name("balance.deposit");
    $this->post("/balance/deposit/store","BalanceController@depositStore")->name("deposit.store");
    $this->get("/balance/widraw","BalanceController@widraw")->name("balance.widraw");
    $this->post("/balance/deposit/widraw","BalanceController@depositWidraw")->name("deposit.widraw");
    $this->get("/balance/transfer","BalanceController@transfer")->name("balance.transfer");
    $this->post("/balance/confirm/transfer","BalanceController@confirmTransfer")->name("deposit.transfer");
    $this->post("/balance/deposit/transfer","BalanceController@executeTransfer")->name("deposit.transfer.execute");
    $this->get("/historic","HistoricController@index")->name("admin.historic");
    $this->any("/historic/search","HistoricController@searchHistory")->name("admin.historic.search");
    
});
$this->get("/profile","UserController@profile")->middleware("auth")->name("profile");
$this->post("/profile/update","UserController@update")->middleware("auth")->name("profile.update");
$this->get('/', 'SiteController@index')->name('home');

Auth::routes();


