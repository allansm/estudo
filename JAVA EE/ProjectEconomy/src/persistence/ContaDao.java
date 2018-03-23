package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.Conexao;
import entity.Conta;

public class ContaDao {
	private Connection con;
	
	public ContaDao() throws Exception{
		con = new Conexao().getConnection();
	}
	
	public void insert(Conta c) throws Exception{
		String sql = "insert into conta (pessoa,usuario,saldo) values (?,?,?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setInt(1, c.getPessoa());
		stmt.setInt(2, c.getUsuario());
		stmt.setDouble(3, c.getSaldo());
		stmt.execute();
		stmt.close();
	}
	public List<Conta> select() throws Exception{
		String sql = "select * from conta";
		PreparedStatement stmt = con.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		Conta c;
		List<Conta> lista = new ArrayList();
		while(rs.next()) {
			c = new Conta();
			c.setId(rs.getInt("id"));
			c.setPessoa(rs.getInt("pessoa"));
			c.setUsuario(rs.getInt("usuario"));
			c.setSaldo(rs.getDouble("saldo"));
			lista.add(c);
		}
		return lista;
	}
	public Conta select(Conta c) throws Exception{
		String sql = "select * from conta where id=?";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setInt(1, c.getId());
		ResultSet rs = stmt.executeQuery();
		if(rs.next()) {
			c.setId(rs.getInt("id"));
			c.setPessoa(rs.getInt("pessoa"));
			c.setSaldo(rs.getDouble("saldo"));
			c.setUsuario(rs.getInt("usuario"));
			return c;
		}
		return null;
	}
	public void deposit(Conta c) throws Exception{
		String sql = "update conta set saldo=? where id=?";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setDouble(1,c.getSaldo());
		stmt.setInt(2,c.getId());
		stmt.execute();
		stmt.close();
	}
}
