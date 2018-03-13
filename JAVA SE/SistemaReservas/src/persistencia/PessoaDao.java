package persistencia;

import conexao.Conexao;
import entidade.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class PessoaDao {
    private Connection con = Conexao.getConnection();
    public void add(Pessoa p)throws Exception{
        String sql = "insert into tbl_pessoas (nome_pessoa,nome_pai,nome_mae,tipo_documento,numero_documento,endereco,telefone,email)values(?,?,?,?,?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1,p.getNome());
        stmt.setString(2, p.getNomePai());
        stmt.setString(3,p.getNomeMae());
        stmt.setString(4, p.getTipoDocumento());
        stmt.setString(5, p.getNumeroDocumento());
        stmt.setString(6, p.getEndereco());
        stmt.setString(7, p.getTelefone());
        stmt.setString(8, p.getEmail());
        stmt.execute();
        stmt.close();
    }
    public void delete(String nd)throws Exception{
        String sql = "delete from tbl_pessoas where numero_documento=?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, nd);
        stmt.execute();
        stmt.close(); 
    }
    public List<Pessoa> search()throws Exception{
        String sql = "select * from tbl_pessoas";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        List<Pessoa> lista = new ArrayList<>();
        while(rs.next()){
            Pessoa p = new Pessoa();
            p.setNome(rs.getString("nome_pessoa"));
            p.setNomePai(rs.getString("nome_pai"));
            p.setNomeMae(rs.getString("nome_mae"));
            p.setTipoDocumento(rs.getString("tipo_documento"));
            p.setNumeroDocumento(rs.getString("numero_documento"));
            p.setTelefone(rs.getString("telefone"));
            p.setEndereco(rs.getString("endereco"));
            p.setEmail(rs.getString("email"));
            p.setId(rs.getInt("id"));
            lista.add(p);
        }
        return lista;
    }
    public void update(Pessoa p)throws Exception{
        String sql = "update tbl_pessoas set nome_pessoa=?,nome_pai=?,nome_mae=?,tipo_documento=?,numero_documento=?,endereco=?,telefone=?,email=? where id=?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1,p.getNome());
        stmt.setString(2, p.getNomePai());
        stmt.setString(3,p.getNomeMae());
        stmt.setString(4, p.getTipoDocumento());
        stmt.setString(5, p.getNumeroDocumento());
        stmt.setString(6, p.getEndereco());
        stmt.setString(7, p.getTelefone());
        stmt.setString(8, p.getEmail());
        stmt.setInt(9, p.getId());
        stmt.execute();
        stmt.close();       
    }
}
