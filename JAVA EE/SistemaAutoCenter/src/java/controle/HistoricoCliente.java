/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import entidade.Produto;
import entidade.Servico;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import persistencia.ClienteDao;

/**
 *
 * @author hiro
 */
public class HistoricoCliente extends HttpServlet {

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
            String s = "<table><tr><th>produto</th><th>quantidade</th><th>unidade</th><th>data</th></tr>";
            HttpSession session = request.getSession();
            List<Produto> lista = new ClienteDao().historicoProduto(new ClienteDao().historicoCompra(session));
            for(Produto p:lista){
                s += "<tr><td>"+p.getNome()+"</td><td>"+p.getQuantidade()+"</td><td>R$"+p.getPrecoUnitario()+"</td><td>"+new ClienteDao().historicoCompra(session).get(lista.indexOf(p)).getData()+"</td></tr>";
            }
            s+="</table><br/><table><th>Servico</th><th>Custo</th><th>data</th>";
            List<Servico> lista2 = new ClienteDao().historicoServico(new ClienteDao().historicoCompra(session));
            for(Servico ser:lista2){
                s+="<tr><td>"+ser.getTipo()+"</td><td>R$"+ser.getPreco()+"</td><td>"+new ClienteDao().historicoCompra(session).get(lista2.indexOf(ser)).getData()+"</td></tr>";
            }
            s+="</table>";
            response.setHeader("res",s);
            getServletContext().getRequestDispatcher("/index.jsp?p=RsHistorico.jsp").forward(request, response);
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
