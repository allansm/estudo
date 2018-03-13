package persistencia;

import entidade.Cliente;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ClienteDao {
    private Connection con;
    public ClienteDao(){
        con = Conexao.getConnection();
    }
    public void add(Cliente cli) throws Exception{
        String sql = "insert into cliente (nome,telefone,email) values(?,?,?);";
        PreparedStatement stmt = con.prepareStatement(sql); //new Conexao().getConnection().prepareStatement(sql);
        stmt.setString(1, cli.getNome());
        stmt.setString(2, cli.getTelefone());
        stmt.setString(3, cli.getEmail());
        stmt.execute();
        stmt.close();
    }
    public List<Cliente> search() throws Exception{
        String sql = "select * from cliente;";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        List<Cliente> c = new ArrayList<>();
        Cliente cli ;//= new Cliente();
        while(rs.next()){
            cli = new Cliente();
            cli.setNome(rs.getString("nome"));
            cli.setEmail(rs.getString("email"));
            cli.setTelefone(rs.getString("telefone"));
            c.add(cli);
        }
        rs.close();
        stmt.close();
        return c;
    }
}
