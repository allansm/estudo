package controle;

import entidade.Produto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import persistencia.ProdutoDao;


public class BuscaProduto extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String res="";
            try{
                
                List<Produto> lista = new ProdutoDao().buscar();
                for(Produto p:lista){
                    res += "id:"+p.getId()+"<br/><br/>nome:"+p.getNome()+"<br/><br/>quantidade:"+p.getQuantidade()+"<br/><br/>preço unitario:"+p.getPrecoUnitario()+"<br/><br/>";
                }
            }catch(Exception e){}
            res = (res.equals(""))?"nenhum resultado encontrado":res;
            response.setHeader("res", res);
            RequestDispatcher dispatcher = request.getRequestDispatcher("RsProduto.jsp");
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
