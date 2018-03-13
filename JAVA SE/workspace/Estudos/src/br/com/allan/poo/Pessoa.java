package br.com.allan.poo;

public class Pessoa implements java.io.Serializable{
	public String getNome() {
		return nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public Integer getIdade() {
		return idade;
	}
	public Double getPeso() {
		return peso;
	}
	public Double getAltura() {
		return altura;
	}
	public Double getSalario() {
		return salario;
	}
	public Boolean getFuma() {
		return fuma;
	}
	private String nome;
	private String sobrenome;
	private Integer idade;
	private Double peso;
	private Double altura;
	private Double salario;
	private Boolean fuma;
	public Pessoa(){
		
	}
	public Pessoa(String nome,String sobrenome,Integer idade,Double peso,Double altura,Double salario,Boolean fuma){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
		this.salario = salario;
		this.fuma = fuma;
	}
	public Pessoa(String nome,String sobrenome,Integer idade){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
	}
	public Pessoa(String nome,Integer idade,Double peso,Double altura){
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}
	public Pessoa(String nome,Integer idade,Double salario){
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}
}
