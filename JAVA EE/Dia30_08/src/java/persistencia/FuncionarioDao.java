package persistencia;

import entidade.Funcionario;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class FuncionarioDao {
    private Connection con = Conexao.getConnection();
    public void add(Funcionario f) throws Exception{
        String sql = "insert into funcionario (nome,endereco,bairro,cidade,uf) values (?,?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, f.getNome());
        stmt.setString(2, f.getEndereco());
        stmt.setString(3, f.getBairro());
        stmt.setString(4, f.getCidade());
        stmt.setString(5, f.getUf());
        stmt.execute();
        stmt.close();
    }
}
