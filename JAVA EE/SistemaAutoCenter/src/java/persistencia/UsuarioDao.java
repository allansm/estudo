package persistencia;

import conexao.Conexao;
import entidade.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;


public class UsuarioDao {
    private Connection con = Conexao.getConnection();
    
    public void cadastrar(Usuario u)throws Exception{
        String sql = "insert into usuario(login,senha) values(?,md5(?))";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, u.getUsuario());
        stmt.setString(2, u.getSenha());
        stmt.execute();
        stmt.close();
    }
    public List<Usuario> buscar()throws Exception{
        List<Usuario> lista = new ArrayList<>();
        String sql = "select * from usuario";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            Usuario u = new Usuario();
            u.setId(rs.getInt("id"));
            u.setUsuario(rs.getString("login"));
            u.setSenha(rs.getString("senha"));
            lista.add(u);
        }
        return lista;
    }
    public void logar(HttpSession session,Usuario u)throws Exception{
        String sql = "select * from usuario where login=? and senha=md5(?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, u.getUsuario());
        stmt.setString(2, u.getSenha());
        ResultSet rs = stmt.executeQuery();
        Usuario usu = null;
        if(rs.next()){
            usu = new Usuario();
            usu.setId(rs.getInt("id"));
            usu.setUsuario(rs.getString("login"));
            usu.setSenha(rs.getString("senha"));
        }
        session.setAttribute("id_usuario", usu.getId());
        session.setAttribute("login_usuario", usu.getUsuario());
    }
    public void deslogar(HttpSession session){
        session.invalidate();
    }
}
