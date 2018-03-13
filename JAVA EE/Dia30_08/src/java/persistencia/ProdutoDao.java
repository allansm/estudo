package persistencia;

import entidade.Produto;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class ProdutoDao {
    private Connection con;
    public ProdutoDao(){
        con = Conexao.getConnection();
    }
    public void add(Produto p)throws Exception{
        
        String sql = "insert into produto(descricao,preco_unitario,preco_venda,quant_estoque) values(?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1,p.getDescricao());
        stmt.setDouble(2,p.getPreco_unitario());
        stmt.setDouble(3,p.getPreco_venda());
        stmt.setInt(4,p.getQuant_estoque());
        stmt.execute();
    }
}
