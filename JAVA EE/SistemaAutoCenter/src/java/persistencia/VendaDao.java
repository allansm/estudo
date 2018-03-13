package persistencia;

import conexao.Conexao;
import entidade.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class VendaDao {
    private Connection con = Conexao.getConnection();
    
    public void cadastrar(Venda v)throws Exception{
        String sql = "insert into vendas (cliente,produto,servico,quant_produto,data_compra) values(?,?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, v.getCliente());
        stmt.setInt(2, v.getProduto());
        stmt.setInt(3, v.getServico());
        stmt.setInt(4, v.getQuantProduto());
        DateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        stmt.setString(5, f.format(new Date()));
        stmt.execute();
        stmt.close();
    }
    public void cadastrarProduto(Venda v)throws Exception{
        String sql = "insert into vendas (cliente,produto,quant_produto,data_compra) values(?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, v.getCliente());
        stmt.setInt(2, v.getProduto());
        stmt.setInt(3, v.getQuantProduto());
        DateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        stmt.setString(4, f.format(new Date()));
        stmt.execute();
        stmt.close();
    }
    public void cadastrarServico(Venda v)throws Exception{
        String sql = "insert into vendas (cliente,servico,data_compra) values(?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, v.getCliente());
        stmt.setInt(2, v.getServico());
        DateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        stmt.setString(3, f.format(new Date()));
        stmt.execute();
        stmt.close();
    }
    public List<Venda> buscar()throws Exception{
        List<Venda> lista = new ArrayList<>();
        String sql = "select * from vendas";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            Venda v = new Venda();
            v.setId(rs.getInt("id"));
            v.setCliente(rs.getInt("cliente"));
            v.setProduto(rs.getInt("produto"));
            v.setServico(rs.getInt("servico"));
            v.setQuantProduto(rs.getInt("quant_produto"));
            v.setData(rs.getString("data_compra"));
            lista.add(v);
        }
        return lista;
    }
}
