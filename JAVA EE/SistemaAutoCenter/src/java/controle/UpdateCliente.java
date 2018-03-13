/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import entidade.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import persistencia.ClienteDao;

/**
 *
 * @author hiro
 */
public class UpdateCliente extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            
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
       
        String res = "";
        if(!request.getParameter("pass").equals("")  && request.getParameter("pass") != null && !request.getParameter("nome").equals("") && !request.getParameter("endereco").equals("")){
            if(verificaEmail(request.getParameter("email"))){
                if(verificaTelefone(request.getParameter("telefone"))){
                    Cliente c = new Cliente();
                    c.setNome(request.getParameter("nome"));
                    c.setEmail(request.getParameter("email"));
                    c.setEndereco(request.getParameter("endereco"));
                    c.setTelefone(request.getParameter("telefone"));
                    c.setSenha(request.getParameter("pass"));
                    try{
                        new ClienteDao().update(request.getSession(),c);
                        res = "Dados atualizados com sucesso";
                    }catch(Exception e){
                        res = "erro ao atualizar tente outro email!!!";
                    }
                }else{
                    res = "telefone invalido";
                }
            }else{
                res = "email invalido";
            }
        }else{
            res = "erro ao atualizar existem campos em branco";
        }
        response.setHeader("res", res);
        //RequestDispatcher dispatcher = request.getRequestDispatcher("Resultado.jsp");
        //dispatcher.forward(request, response);
        getServletContext().getRequestDispatcher("/index.jsp?p=Resultado.jsp").forward(request, response);
    }
    public boolean verificaEmail(String email){
        return email.matches("\\w+@\\w+\\.\\w{2,3}\\.\\w{0,4}") || email.matches("\\w+@\\w+\\.\\w{2,3}") ;
    }
    public boolean verificaTelefone(String telefone){
        return telefone.matches("\\d{4,5}-\\d{4}");
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
