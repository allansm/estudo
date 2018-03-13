package persistencia;

import conexao.Conexao;
import entidade.Quarto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class QuartoDao {
    private Connection con = Conexao.getConnection();
    public void add(Quarto q)throws Exception{
        String sql = "insert into tbl_quartos(numeros,andar,descricao,caracteristicas,preco_diaria,estado,tipo_quarto) values(?,?,?,?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, q.getNumeros());
        stmt.setString(2, q.getAndar());
        stmt.setString(3, q.getDescricao());
        stmt.setString(4, q.getCaracteristicas());
        stmt.setDouble(5, q.getPrecoDiaria());
        stmt.setString(6,q.getEstado());
        stmt.setString(7, q.getTipoQuarto());
        stmt.execute();
        stmt.close();
        System.out.println("executou");
    }
    public void delete(int id)throws Exception{
        String sql = "delete from tbl_quartos where id=?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.execute();
        stmt.close();
    }
    public List<Quarto> search()throws Exception{
        String sql = "select * from tbl_quartos";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        List<Quarto> lista = new ArrayList<>();
        while(rs.next()){
            Quarto q = new Quarto();
            q.setId(rs.getInt("id"));
            q.setNumeros(rs.getString("numeros"));
            q.setAndar(rs.getString("andar"));
            q.setCaracteristicas(rs.getString("caracteristicas"));
            q.setDescricao(rs.getString("descricao"));
            q.setPrecoDiaria(rs.getDouble("preco_diaria"));
            q.setTipoQuarto(rs.getString("tipo_quarto"));
            q.setEstado(rs.getString("estado"));
            lista.add(q);
        }
        return lista;
    }
    public void update(Quarto q)throws Exception{
        String sql = "update tbl_quartos set numeros=?,andar=?,descricao=?,caracteristicas=?,preco_diaria=?,estado=?,tipo_quarto=? where id=?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, q.getNumeros());
        stmt.setString(2, q.getAndar());
        stmt.setString(3, q.getDescricao());
        stmt.setString(4, q.getCaracteristicas());
        stmt.setDouble(5, q.getPrecoDiaria());
        stmt.setString(6,q.getEstado());
        stmt.setString(7, q.getTipoQuarto());
        stmt.setInt(8,q.getId());
        stmt.execute();
        stmt.close();
    }
}
