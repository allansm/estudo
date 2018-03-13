

package persistencia;

import conexao.Conexao;
import entidade.Professor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class ProfessorDao {
    private Connection con = Conexao.getConnection();
    public void add(Professor p) throws Exception {
        String sql = "insert into tbl_professores(professor,disciplina,disponibilidade,hora_aula) values (?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, p.getProfessor());
        stmt.setString(2, p.getDisciplina());
        stmt.setString(3, p.getDisponibilidade());
        stmt.setDouble(4, p.getHora_aula());
        stmt.execute();
        stmt.close();
    }
    public List<Professor> search() throws Exception{
        String sql = "select * from tbl_professores";
        List<Professor> lista = new ArrayList<>();
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        Professor p ;
        while(rs.next()){
            p = new Professor();
            p.setId(rs.getInt("id"));
            p.setProfessor(rs.getString("professor"));
            p.setDisciplina(rs.getString("disciplina"));
            p.setDisponibilidade(rs.getString("disponibilidade"));
            p.setHora_aula(rs.getDouble("hora_aula"));
            lista.add(p);
        }
        rs.close();
        stmt.close();
        return lista;
    }
    public void delete(int id)throws Exception{
        String sql = "delete from tbl_professores where id=?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.execute();
        stmt.close();
    }
    public void update(int id ,Professor p)throws Exception{
        String sql = "update tbl_professores set professor=?,disciplina=?,disponibilidade=?,hora_aula=? where id= ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, p.getProfessor());
        stmt.setString(2, p.getDisciplina());
        stmt.setString(3, p.getDisponibilidade());
        stmt.setDouble(4, p.getHora_aula());
        stmt.setInt(5, id);
        stmt.execute();
        stmt.close();
    }
}
