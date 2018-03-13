package persistencia;

import conexao.Conexao;
import entidade.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class UsuarioDao {
    private Connection con = Conexao.getConnection();
    public boolean autenticar(Usuario l) throws Exception{
        String sql = "select * from tbl_login where login=? and senha=md5(?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, l.getLogin());
        stmt.setString(2, l.getSenha());
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            return true;
        }
        rs.close();
        return false;
    }
}
