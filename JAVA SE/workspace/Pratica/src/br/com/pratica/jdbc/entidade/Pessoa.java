package br.com.pratica.jdbc.entidade;

public class Pessoa {
	private String nome;
	private  Integer anoNascimento;
	private  Integer id;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(Integer anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

}
