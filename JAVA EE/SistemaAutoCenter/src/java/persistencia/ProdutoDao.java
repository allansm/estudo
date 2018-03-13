package persistencia;

import conexao.Conexao;
import entidade.Cliente;
import entidade.Produto;
import entidade.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDao {
    private Connection con = Conexao.getConnection();
    public void cadastrar(Produto p)throws Exception{
        String sql = "insert into produtos (nome,quantidade,precoUnitario,url) values(?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, p.getNome());
        stmt.setInt(2, p.getQuantidade());
        stmt.setDouble(3, p.getPrecoUnitario());
        stmt.setString(4, p.getImage());
        stmt.execute();
        stmt.close();
    }
    public List<Produto> buscar()throws Exception{
        List<Produto> lista = new ArrayList<>();
        String sql = "select * from produtos";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            Produto p = new Produto();
            p.setId(rs.getInt("id"));
            p.setNome(rs.getString("nome"));
            p.setPrecoUnitario(rs.getDouble("precoUnitario"));
            p.setQuantidade(rs.getInt("quantidade"));
            p.setImage(rs.getString("url"));
            lista.add(p);
        }
        return lista;
    }
    public void efetuarCompra(Produto p,Cliente cli)throws Exception{
        String sql = "select * from produtos where id=?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, p.getId());
        ResultSet rs = stmt.executeQuery();
        Produto pro = null;
        while(rs.next()){
            pro = new Produto();
            pro.setId(rs.getInt("id"));
            pro.setNome(rs.getString("nome"));
            pro.setPrecoUnitario(rs.getDouble("precoUnitario"));
            pro.setQuantidade(rs.getInt("quantidade"));
        }
        pro.setQuantidade(pro.getQuantidade()-p.getQuantidade());
        Venda v = new Venda();
        v.setProduto(pro.getId());
        v.setQuantProduto(p.getQuantidade());
        v.setCliente(cli.getId());
        try{
           new VendaDao().cadastrarProduto(v);
        }catch(Exception e){throw new Exception();}
        sql = "update produtos set quantidade=? where id=?";
        stmt = con.prepareStatement(sql);
        stmt.setInt(1, pro.getQuantidade());
        stmt.setInt(2, pro.getId());
        stmt.execute();
        stmt.close();
    }
}
