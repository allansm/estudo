package persistencia;

import conexao.Conexao;
import entidade.Cliente;
import entidade.Produto;
import entidade.Servico;
import entidade.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;


public class ClienteDao {
    private Connection con = Conexao.getConnection();
    public void cadastrar(Cliente c)throws Exception{
        String sql = "insert into clientes(nome,email,senha,telefone,endereco) values(?,?,md5(?),?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, c.getNome());
        stmt.setString(2, c.getEmail());
        stmt.setString(3, c.getSenha());
        stmt.setString(4, c.getTelefone());
        stmt.setString(5,c.getEndereco());
        stmt.execute();
        stmt.close();
    }
    public List<Cliente> consultar()throws Exception{
        List<Cliente> lista = new ArrayList<>();
        String sql = "select * from clientes";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            Cliente c = new Cliente();
            c.setNome(rs.getString("nome"));
            c.setEmail(rs.getString("email"));
            c.setSenha(rs.getString("senha"));
            c.setTelefone(rs.getString("telefone"));
            c.setEndereco(rs.getString("endereco"));
            c.setId(rs.getInt("id"));
            lista.add(c);
        }
        return lista;
    }
    public Cliente consultar(int id)throws Exception{
        List<Cliente> lista = new ClienteDao().consultar();
        for(Cliente c:lista){
            if(c.getId() == id){
                return c;
            }
        }
        return null;
    }
    public void logar(HttpSession session,Cliente c)throws Exception{
        String sql = "select * from clientes where email=? and senha=md5(?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, c.getEmail());
        stmt.setString(2, c.getSenha());
        ResultSet rs = stmt.executeQuery();
        Cliente cli = null;
        if(rs.next()){
            cli = new Cliente();
            cli.setId(rs.getInt("id"));
            cli.setNome(rs.getString("nome"));
            cli.setEmail(rs.getString("email"));
            cli.setEndereco(rs.getString("endereco"));
            cli.setTelefone(rs.getString("telefone"));
            cli.setSenha(rs.getString("senha"));
        }
        session.setAttribute("id", cli.getId());
        session.setAttribute("email", cli.getEmail());
        session.setAttribute("nome", cli.getNome());
    }
    public void deslogar(HttpSession session){
        session.invalidate();
    }
    public List<Venda> historicoCompra(HttpSession session){
        try{
            List<Venda> lista = new VendaDao().buscar();
            List<Venda> res = new ArrayList<>();
            for(Venda v:lista){
                if(v.getCliente() == Integer.parseInt(session.getAttribute("id").toString())){
                    res.add(v);
                }
            }
            return res;
        }catch(Exception e){
            return null;
        }
        
    }
    public List<Produto> historicoProduto(List<Venda> comprados){
        try{
            
            List<Produto> lista = new ProdutoDao().buscar();
            List<Produto> res = new ArrayList<>();
            for(Venda v:comprados){
                for(Produto p :lista){
                    if(v.getProduto() == p.getId()){
                        p.setQuantidade(v.getQuantProduto());
                        res.add(p);
                    }
                }
            }
            return res;
        }catch(Exception e){
            return null;
        }
        
    }
    public List<Servico> historicoServico(List<Venda> comprados){
        try{
            
            List<Servico> lista = new ServicoDao().buscar();
            List<Servico> res = new ArrayList<>();
            for(Venda v:comprados){
                for(Servico s:lista){
                    if(v.getServico() == s.getId()){
                        res.add(s);
                    }
                }
            }
            return res;
        }catch(Exception e){
            return null;
        }
        
    }
    public void update(HttpSession session,Cliente c)throws Exception{
        String sql = "update clientes set nome=? , email=? , telefone=? , endereco=? , senha=md5(?) where id=?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1,c.getNome());
        stmt.setString(2, c.getEmail());
        stmt.setString(3, c.getTelefone());
        stmt.setString(4, c.getEndereco());
        stmt.setString(5,c.getSenha());
        stmt.setInt(6, (int) session.getAttribute("id"));
        stmt.execute();
        stmt.close();
        session.setAttribute("email", c.getEmail());
        session.setAttribute("nome", c.getNome());
        
    }
}
