package persistencia;

import conexao.Conexao;
import entidade.Servico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class ServicoDao{
    private Connection con = Conexao.getConnection();
    public void cadastrar(Servico s)throws Exception{
        String sql = "insert into servicos (tipo,preco,url,dica) values(?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, s.getTipo());
        stmt.setDouble(2, s.getPreco());
        stmt.setString(3, s.getImage());
        stmt.setString(4, s.getDica());
        stmt.execute();
        stmt.close();
    }
    public List<Servico> buscar()throws Exception{
        List<Servico> lista = new ArrayList<>();
        String sql = "select * from servicos";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            Servico s = new Servico();
            s.setId(rs.getInt("id"));
            s.setPreco(rs.getDouble("preco"));
            s.setTipo(rs.getString("tipo"));
            s.setImage(rs.getString("url"));
            s.setDica(rs.getString("dica"));
            lista.add(s);
        }
        return lista;
    }
}
