package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.Conexao;
import entity.Compra;

public class CompraDao {
	private Connection con;
	
	public CompraDao() throws Exception{
		con = new Conexao().getConnection();
	}
	
	public void insert(Compra c) throws Exception{
		String sql = "insert into compra(idConta,produto,valor,data) values(?,?,?,?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setInt(1, c.getIdConta());
		stmt.setString(2, c.getProduto());
		stmt.setDouble(3, c.getValor());
		stmt.setString(4, c.getData());
		stmt.execute();
		stmt.close();
	}
	
	public List<Compra> select() throws Exception{
		String sql = "select * from compra";
		PreparedStatement stmt = con.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		Compra c;
		List<Compra> lista = new ArrayList();
		while(rs.next()) {
			c = new Compra();
			c.setId(rs.getInt("id"));
			c.setIdConta(rs.getInt("idConta"));
			c.setProduto(rs.getString("produto"));
			c.setValor(rs.getDouble("valor"));
			c.setData(rs.getString("data"));
			lista.add(c);
		}
		return lista;
	}
	public void delete(Compra c) throws Exception{
		String sql = "delete  from compra where id=?";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setInt(1, c.getId());
		stmt.execute();
		stmt.close();
	}
}
