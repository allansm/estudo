package controle;

import entidade.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import persistencia.UsuarioDao;


public class CadUsuario extends HttpServlet {


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
        if(request.getParameter("pass").equals(request.getParameter("cpass"))){
            Usuario u = new Usuario();
            u.setUsuario(request.getParameter("usuario"));
            u.setSenha(request.getParameter("pass"));
            try{
                new UsuarioDao().cadastrar(u);
                res = "cadastro efetuado com sucesso";
            }catch(Exception e){res = "erro ao cadastrar tente outro usuario!!!";}
        }else{
            res = "senha e comfirmação de senha imcompativeis";
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
