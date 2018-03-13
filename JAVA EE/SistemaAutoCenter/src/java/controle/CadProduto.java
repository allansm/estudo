package controle;

import entidade.Produto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import persistencia.ProdutoDao;

public class CadProduto extends HttpServlet {

    
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
        Produto p = new Produto();
        p.setNome(request.getParameter("nome"));
        p.setPrecoUnitario(Double.parseDouble(request.getParameter("precoUnitario")));
        p.setQuantidade(Integer.parseInt(request.getParameter("quantidade")));
        if(request.getParameter("url") != null && !request.getParameter("url").equals("")){
            p.setImage("img/"+request.getParameter("url"));
        }
        try{
            new ProdutoDao().cadastrar(p);
            res = "cadastro efetuado com sucesso";
        }catch(Exception e){res = "erro ao cadastrar!!!";}
        response.setHeader("res", res);
        RequestDispatcher dispatcher = request.getRequestDispatcher("Res.jsp");
        dispatcher.forward(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
