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
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aluno
 */
//@WebServlet(urlPatterns = {"/RelCliente"}) 
public class ConsCliente extends HttpServlet {

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
            /*out.println("<!DOCTYPE html>");
            out.println("<html>");
            request.getRequestDispatcher("head.jsp").include(request, response);
            out.println("<body>");
            
            out.println("<div class='container'>");
            request.getRequestDispatcher("menu.jsp").include(request, response);
            out.println("<fieldset style='width:50%'>");
            out.println("<legend style=''>Relatorio de Clientes</legend>");
            */
            String result = "";
            ClienteDao cd = new ClienteDao();
            try{
                List<Cliente> lista = cd.search();
                String hr = "";
                for(Cliente c:lista){
                    result+=hr+"<div style=''><br/>nome:"+c.getNome()+"<br/><br/>email:"+c.getEmail()+"<br/><br/>telefone:"+c.getTelefone()+"<br/><br/><br/></div>";
                    hr = "<hr>";
                }
            }catch(Exception e){

            }
            if(result.equals(""))result = "Nenhum resultado encontrado";
            response.setHeader("result", result);
            request.getRequestDispatcher("ResConsCliente.jsp").forward(request, response);
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
