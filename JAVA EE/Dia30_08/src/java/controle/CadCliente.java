/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controle;

import entidade.Cliente;
import persistencia.ClienteDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aluno
 */
public class CadCliente extends HttpServlet {

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
            
            Cliente cli = new Cliente();
            //ClienteDao clidao = new ClienteDao();
            cli.setNome(request.getParameter("nome"));
            cli.setEmail(request.getParameter("email"));
            cli.setTelefone(request.getParameter("telefone"));
            
            /*out.println("<!DOCTYPE html>");
            out.println("<html>");
            request.getRequestDispatcher("head.jsp").include(request, response);
            out.println("<body>");
            
            out.println("<div class='container'>");
            request.getRequestDispatcher("menu.jsp").include(request, response);
            out.println("<fieldset style='width:50%'>");
            out.println("<legend style=''>Dados do Cliente</legend>");
            out.println("<h2>nome:"+cli.getNome()+"<br/><br/>email:"+cli.getEmail()+"<br/><br/>telefone:"+cli.getTelefone()+"<br/><br/></h2>");*/
            String msg = "";
            try{
                //clidao.add(cli);
                new ClienteDao().add(cli);
                msg = "cadastro efetuado com sucesso";
            }catch(Exception e){
                msg = "erro ao cadastrar";
            }
            RequestDispatcher rd = request.getRequestDispatcher("ConfCadCliente.jsp");
            response.setHeader("msg", msg);
            rd.forward(request,response);
            
            /*out.println("</fieldset>");
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
