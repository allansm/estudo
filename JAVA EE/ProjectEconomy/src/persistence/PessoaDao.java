package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.Conexao;
import entity.Pessoa;

public class PessoaDao {
	private Connection con;
	
	public PessoaDao() throws Exception{
		con = new Conexao().getConnection();
	}
	
	public void insert(Pessoa p) throws Exception{
		String sql = "insert into pessoa(nome,sobrenome,email,telefone) values (?,?,?,?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, p.getNome());
		stmt.setString(2, p.getSobrenome());
		stmt.setString(3, p.getEmail());
		stmt.setString(4, p.getTelefone());
		stmt.execute();
		stmt.close();
	}
	public List<Pessoa> select() throws Exception{
		String sql = "select * from pessoa";
		PreparedStatement stmt = con.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		Pessoa p;
		List<Pessoa> lista = new ArrayList();
		while(rs.next()) {
			p = new Pessoa();
			p.setId(rs.getInt("id"));
			p.setNome(rs.getString("nome"));
			p.setSobrenome(rs.getString("sobrenome"));
			p.setEmail(rs.getString("email"));
			p.setTelefone(rs.getString("telefone"));
			lista.add(p);
		}
		return lista;
	}
	public void delete(Pessoa p) throws Exception{
		String sql = "delete  from pessoa where id=?";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setInt(1, p.getId());
		stmt.execute();
		stmt.close();
	}
}
