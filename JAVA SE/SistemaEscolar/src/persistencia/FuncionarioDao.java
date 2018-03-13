

package persistencia;

import conexao.Conexao;
import entidade.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class FuncionarioDao {
    private Connection con = Conexao.getConnection();
    public void add(Funcionario f)throws Exception{
        String sql = "insert into tbl_funcionarios(nome,cargo,turno,salario,dtadmissao) values(?,?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1,f.getNome());
        stmt.setString(2,f.getCargo());
        stmt.setString(3,f.getTurno());
        stmt.setDouble(4,f.getSalario());
        stmt.setString(5,f.getDtadmissao());
        stmt.execute();
        stmt.close();
    }
    public void delete(int id)throws Exception{
        String sql = "delete from tbl_funcionarios where id=?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.execute();
        stmt.close();
    }
    public List<Funcionario> search()throws Exception{
        String sql = "select * from tbl_funcionarios";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        Funcionario f;
        List<Funcionario> lista = new ArrayList<>();
        while(rs.next()){
            f = new Funcionario();
            f.setId(rs.getInt("id"));
            f.setNome(rs.getString("nome"));
            f.setSalario(rs.getDouble("salario"));
            f.setCargo(rs.getString("cargo"));
            f.setTurno(rs.getString("turno"));
            f.setDtadmissao(rs.getString("dtadmissao"));
            lista.add(f);
        }
        rs.close();
        stmt.close();
        return lista;
    }
    public void update(int id ,Funcionario f)throws Exception{
        String sql = "update tbl_funcionarios set nome=?,cargo=?,turno=?,salario=?,dtadmissao=? where id=?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1,f.getNome());
        stmt.setString(2,f.getCargo());
        stmt.setString(3,f.getTurno());
        stmt.setDouble(4,f.getSalario());
        stmt.setString(5,f.getDtadmissao());
        stmt.setInt(6, id);
        stmt.execute();
        stmt.close();
    }
}
