package controle;

import entidade.Servico;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import persistencia.ServicoDao;


public class BuscaServico extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String res = "";
            try{
                List<Servico> lista = new ServicoDao().buscar();
                for(Servico s:lista){
                    res+= "Servico:"+s.getTipo()+"<br/><br/>custo:R$"+s.getPreco()+"<br/><br/>";
                }
            }catch(Exception e){}
            res = (res.equals(""))?"nenhum resultado encontrado":res;
            response.setHeader("res", res);
            RequestDispatcher dispatcher = request.getRequestDispatcher("RsServico.jsp");
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
