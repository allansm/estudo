package persistencia;

import conexao.Conexao;
import entidade.Aluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class AlunoDao {
    private Connection con = Conexao.getConnection();
    public  void add(Aluno a) throws Exception{
        String sql = "insert into tbl_alunos(matricula,aluno,turma,turno,mensalidade,pai,mae,telefone,email) values (?,?,?,?,?,?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, a.getMatricula());
        stmt.setString(2,a.getAluno());
        stmt.setString(3,a.getTurma());
        stmt.setString(4,a.getTurno());
        stmt.setDouble(5,a.getMensalidade());
        stmt.setString(6, a.getPai());
        stmt.setString(7, a.getMae());
        stmt.setString(8,a.getTelefone());
        stmt.setString(9, a.getEmail());
        stmt.execute();
        stmt.close();
    }
    public List<Aluno> search() throws SQLException {
        List<Aluno> lista = new ArrayList<>();
        String sql = "select * from tbl_alunos";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            lista.add(new Aluno(rs.getInt("id"),rs.getString("matricula"), rs.getString("aluno"), rs.getString("turma"), rs.getString("turno"),rs.getDouble("mensalidade"),rs.getString("pai"), rs.getString("mae"), rs.getString("telefone"), rs.getString("email")));
        }
        rs.close();
        stmt.close();
        return lista;
    }
    public void delete(String matricula) throws Exception{
        String sql = "delete from tbl_alunos where matricula=?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, matricula);
        stmt.execute();
        stmt.close();
    }
    public void update(Aluno a,String matricula)throws Exception{
        String sql = "update tbl_alunos set matricula=?,aluno=?,turma=?,turno=?,mensalidade=?,pai=?,mae=?,telefone=?,email=? where matricula = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, a.getMatricula());
        stmt.setString(2,a.getAluno());
        stmt.setString(3,a.getTurma());
        stmt.setString(4,a.getTurno());
        stmt.setDouble(5,a.getMensalidade());
        stmt.setString(6, a.getPai());
        stmt.setString(7, a.getMae());
        stmt.setString(8,a.getTelefone());
        stmt.setString(9, a.getEmail());
        stmt.setString(10,matricula);
        stmt.execute();
        stmt.close();
    }
}
