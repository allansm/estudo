/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controle;

import entidade.Produto;
import persistencia.ProdutoDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aluno
 */
public class CadProdutos extends HttpServlet {

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
            String msg = "";
            Produto p = new Produto();
            p.setDescricao(request.getParameter("descricao"));
            try{
                p.setQuant_estoque(Integer.parseInt(request.getParameter("quant")));
                p.setPreco_unitario(Double.parseDouble(request.getParameter("precoUnitario")));
                p.setPreco_venda(Double.parseDouble(request.getParameter("precoVenda")));
            }catch(Exception e){msg = "erro o valor em quantidade e preço deve ser um numero";}
            /*out.println("<!DOCTYPE html>");
            out.println("<html>");
            request.getRequestDispatcher("head.jsp").include(request, response);
            out.println("<body>");
            
            out.println("<div class='container'>");
            request.getRequestDispatcher("menu.jsp").include(request, response);
            out.println("<fieldset style='width:50%'>");
            out.println("<legend style=''>Produto</legend>");
            out.println("<h2>Descricao:"+p.getDescricao()+"<br/><br/>Quantidade em estoque:"+p.getQuant_estoque()+"<br/><br/>Preço Unitario:"+p.getPreco_unitario()+"<br/><br/>Preço de venda:"+p.getPreco_venda()+"<br/><br/></h2>");
            */
            if(msg.equals("")){
                try{
                    new ProdutoDao().add(p);
                    msg = "cadastro efetuado com sucesso";
                }catch(Exception e){msg = "erro ao cadastrar";}
            }
            response.setHeader("msg", msg);
            request.getRequestDispatcher("ConfCadProduto.jsp").forward(request, response);
            /*out.println("cadastro efetuado com sucesso");    
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
