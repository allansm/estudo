package persistencia;

import entidade.Funcionario;
import entidade.Usuario;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.http.HttpSession;


public class UsuarioDao {
    private Connection con = Conexao.getConnection();
    public void add(Usuario u,Funcionario f)throws Exception{
        try{
        String sql = "select id from funcionario where nome=?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1,f.getNome());
        ResultSet rs = stmt.executeQuery();
        int id = 0;
        while(rs.next()){
            id = rs.getInt("id");
        }
        sql = "insert into usuario (codFunc,usuario,senha) values(?,?,md5(?))";
        stmt = con.prepareStatement(sql);
        if(id != 0){
            stmt.setInt(1, id);
            stmt.setString(2, u.getUsuario());
            stmt.setString(3, u.getSenha());
            stmt.execute();
            stmt.close();
        }
        }catch(Exception e){
            String sql = "delete from funcionario where nome=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, f.getNome());
            stmt.execute();
            stmt.close();
            sql = "delete from usuario where usuario=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, u.getUsuario());
            stmt.execute();
            stmt.close();
        }
    }
    public void logar(HttpSession session,Usuario u)throws Exception{
        String sql = "select * from usuario where usuario=? and senha=md5(?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, u.getUsuario());
        stmt.setString(2, u.getSenha());
        ResultSet rs = stmt.executeQuery();
        Usuario usuario = null;
        while(rs.next()){
            usuario = new Usuario();
            usuario.setUsuario(rs.getString("usuario"));
            usuario.setSenha(rs.getString("senha"));
        }
        session.setAttribute("usuario", usuario);
        session.setAttribute("username", usuario.getUsuario());
    }
    public void deslogar(HttpSession session){
        session.invalidate();
    }
}
