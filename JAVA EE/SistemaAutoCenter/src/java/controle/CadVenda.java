package controle;

import entidade.Cliente;
import entidade.Produto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import persistencia.ClienteDao;
import persistencia.ProdutoDao;


public class CadVenda extends HttpServlet {

    
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
        HttpSession session = request.getSession();

        if(session.getAttribute("id") == null){
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp?p=FrmLoginCliente.jsp"); 
            dispatcher.forward(request, response);
        }else{
            String res = "";
            Produto p = new Produto();
            p.setId(Integer.parseInt(request.getParameter("produto")));
            p.setQuantidade(Integer.parseInt(request.getParameter("quantidade")));
            try{
                Cliente cli = new Cliente();
                cli.setId((int) session.getAttribute("id"));
                new ProdutoDao().efetuarCompra(p, cli);
                res = "compra efetuada com sucesso";
            }catch(Exception e){res = "erro ao efetuar a compra!!";}
            response.setHeader("res", res);
            //RequestDispatcher dispatcher = request.getRequestDispatcher("Resultado.jsp");
            //dispatcher.forward(request, response);
            getServletContext().getRequestDispatcher("/index.jsp?p=Resultado.jsp").forward(request, response);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
