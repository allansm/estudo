package controle;

import entidade.Servico;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import persistencia.ServicoDao;


public class CadServico extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            
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
        String res = "";
        Servico s = new Servico();
        s.setTipo(request.getParameter("servico"));
        s.setPreco(Double.parseDouble(request.getParameter("custo")));
        s.setDica(request.getParameter("link"));
        if(request.getParameter("url") != null && !request.getParameter("url").equals("")){
            s.setImage("img/"+request.getParameter("url"));
        }
        try{
            new ServicoDao().cadastrar(s);
            res = "cadastro efetuado com sucesso";
        }catch(Exception e){
            res = "erro ao cadastrar!!!";
        }
        response.setHeader("res", res);
        RequestDispatcher dispatcher = request.getRequestDispatcher("Res.jsp");
        dispatcher.forward(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
