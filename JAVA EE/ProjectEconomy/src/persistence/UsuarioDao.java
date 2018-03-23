package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import connection.Conexao;
import entity.Usuario;

public class UsuarioDao {
	private Connection con;
	
	public UsuarioDao() throws Exception{
		con = new Conexao().getConnection();
	}
	
	public void insert(Usuario u) throws Exception{
		String sql = "insert into usuario (login,senha) values(?,md5(?))";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, u.getLogin());
		stmt.setString(2, u.getSenha());
		stmt.execute();
		stmt.close();
	}
	
	public List<Usuario> select() throws Exception{
		String sql = "select * from usuario";
		PreparedStatement stmt = con.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		Usuario u;
		List<Usuario> lista = new ArrayList();
		while(rs.next()) {
			u = new Usuario();
			u.setId(rs.getInt("id"));
			u.setLogin(rs.getString("login"));
			u.setSenha(rs.getString("senha"));
			lista.add(u);
		}
		return lista;
	}
	public void delete(Usuario u) throws Exception{
		String sql = "delete from usuario where id=?";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setInt(1, u.getId());
		stmt.execute();
		stmt.close();
	}
	public void session(Usuario u ,HttpSession session) throws Exception {
		String sql = "select * from usuario where login=? and senha=md5(?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, u.getLogin());
		stmt.setString(2, u.getSenha());
		ResultSet rs = stmt.executeQuery();
		if(rs.next()) {
			session.setAttribute("id", rs.getInt("id"));
			session.setAttribute("login", rs.getString("login"));
			session.setAttribute("senha", rs.getString("senha"));
		}
	}
}
