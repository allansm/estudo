package br.com.pratica.jdbc.test;

import java.sql.Connection;

import br.com.pratica.jdbc.entidade.Pessoa;
import br.com.pratica.jdbc.persistencia.Conexao;
import br.com.pratica.jdbc.persistencia.PessoaDao;

public class Test { 
	public static void main(String[] args){
		//testSalvar();
		//testConexao();
		testConsultar();
	}
	public static void testSalvar(){
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("allan");
		pessoa.setAnoNascimento(1994);
		PessoaDao dao = new PessoaDao();
		dao.salvar(pessoa);
		
	}
	public static void testConexao(){
		Connection con = new Conexao().getConnection();
		
	}
	public static void testConsultar(){
		Pessoa pessoa = new Pessoa();
		byte[] bit = "'or'1'='1".getBytes();
		pessoa.setNome("'or1='1");
		pessoa.setAnoNascimento(1994);
		PessoaDao dao = new PessoaDao();
		dao.consultar(pessoa);
		
	}
}
