package controle;

import entidade.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import persistencia.ClienteDao;


public class BuscaCliente extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String res = "";
            try{
                List<Cliente> lista = new ClienteDao().consultar();
                for(Cliente c :lista){
                    res += "id:"+c.getId()+"<br/><br/>nome:"+c.getNome()+"<br/><br/>email:"+c.getEmail()+"<br/><br/>telefone:"+c.getTelefone()+"<br/><br/>endereco:"+c.getEndereco()+"<br/><br/>";
                }
            }catch(Exception e){
            
            }
            res = (res.equals(""))?"nenhum resultado encontrado":res;
            response.setHeader("res", res);
            RequestDispatcher dispatcher = request.getRequestDispatcher("RsCliente.jsp");
            dispatcher.forward(request, response);
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
