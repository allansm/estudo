/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controle;

import entidade.Funcionario;
import entidade.Usuario;
import persistencia.FuncionarioDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import persistencia.UsuarioDao;

/**
 *
 * @author Aluno
 */
public class CadFunc extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String msg = "cadastro efetuado com sucesso";
            /* TODO output your page here. You may use following sample code. */
            Funcionario f = new Funcionario();
            f.setNome(request.getParameter("nome"));
            f.setEndereco(request.getParameter("endereco"));
            f.setBairro(request.getParameter("bairro"));
            f.setCidade(request.getParameter("cidade"));
            f.setUf(request.getParameter("uf"));
            
            Usuario u = new Usuario();
            u.setUsuario(request.getParameter("usuario"));
            u.setSenha(request.getParameter("senha"));
            if(u.getSenha().equals(request.getParameter("confsenha"))){
                try{
                    new FuncionarioDao().add(f);
                    new UsuarioDao().add(u,f);
                }catch(Exception e){
                    
                }
            }else{
                msg = "a senha e a confirmação devem ser iguais";
            }
            
            response.setHeader("msg", msg);
            request.getRequestDispatcher("ConfCadFunc.jsp").forward(request, response);
            /*out.println("<!DOCTYPE html>");
            out.println("<html>");
            request.getRequestDispatcher("head.jsp").include(request, response);
            out.println("<body>");
            
            out.println("<div class='container'>");
            request.getRequestDispatcher("menu.jsp").include(request, response);
            out.println("<fieldset style='width:50%'>");
            out.println("<legend style=''>Dados do funcionario</legend>");
            if(u.getSenha().equals(request.getParameter("confsenha")) && !u.getSenha().equals(""))
            out.println("<h2>nome:"+f.getNome()+"<br/><br/>endereco:"+f.getEndereco()+"<br/><br/>bairro"+f.getBairro()+"<br/><br/>cidade:"+f.getCidade()+"<br/><br/>uf:"+f.getUf()+"<br/><br/>usuario:"+u.getUsuario()+"<br/><br/>Cadastro efetuado com sucesso</h2>");else out.println("falha no cadastro");
            //out.println("<h1>Servlet CadFunc at " + request.getContextPath() + "</h1>");
            out.println("</fieldset>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");*/
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
