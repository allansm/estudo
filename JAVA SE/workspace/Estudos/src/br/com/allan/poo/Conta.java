package br.com.allan.poo;

public class Conta implements java.io.Serializable{
	private String cliente;
	private double saldo;
	public Conta(){
		
	}
	public Conta(String cliente,double saldo){
		this.cliente = cliente;
		this.saldo = saldo;
	}
	public void exibeSaldo(){
		System.out.println(this.cliente +" seu saldo é : R$"+this.saldo);
	}
	public void saca(double valor){
		this.saldo = this.saldo - valor;
	}
	public void deposita(double valor){
		this.saldo = this.saldo + valor;
	}
	public void transferePara(Conta destino,double valor){
		this.saldo = this.saldo - valor;
		destino.saldo = destino.saldo + valor;
	}
	public String getCliente(){
		return this.cliente;
	}
	public double getSaldo(){
		return this.saldo;
	}
}
