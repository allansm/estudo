package br.com.pratica.jdbc.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.pratica.jdbc.entidade.Pessoa;

public class PessoaDao {
	public void salvar(Pessoa pessoa){
		Connection con = new Conexao().getConnection();
		try{
		String sql = "INSERT INTO pessoa (nome,anoNascimento) VALUES(?,?)";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, pessoa.getNome());
		statement.setInt(2, pessoa.getAnoNascimento());
		statement.execute();
		System.out.println("cadastro efetuado com sucesso");
		}catch(Exception e){
			System.out.println("error!!");
		}
	}
	public void consultar(Pessoa pessoa){
		Connection con = new Conexao().getConnection();
		try{
			String sql = "SELECT * FROM pessoa WHERE nome=? AND anonascimento=?";
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, pessoa.getNome());
			statement.setInt(2, pessoa.getAnoNascimento());
			System.out.println(statement);
			ResultSet rs = statement.executeQuery();
			if(rs.next()){
				System.out.println(rs.getString("nome")+" "+rs.getInt("anonascimento"));
			}
			
		}catch(Exception e){
			System.out.println("deu merda");
		}
	}
}
