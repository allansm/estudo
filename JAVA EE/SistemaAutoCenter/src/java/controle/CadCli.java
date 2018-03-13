package controle;

import entidade.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import persistencia.ClienteDao;


public class CadCli extends HttpServlet {

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
        if(request.getParameter("pass").equals(request.getParameter("cpass")) && !request.getParameter("pass").equals("")  && request.getParameter("pass") != null && !request.getParameter("nome").equals("") && !request.getParameter("endereco").equals("")){
            if(verificaEmail(request.getParameter("email"))){
                if(verificaTelefone(request.getParameter("telefone"))){
                    Cliente c = new Cliente();
                    c.setNome(request.getParameter("nome"));
                    c.setEmail(request.getParameter("email"));
                    c.setEndereco(request.getParameter("endereco"));
                    c.setTelefone(request.getParameter("telefone"));
                    c.setSenha(request.getParameter("pass"));
                    try{
                        new ClienteDao().cadastrar(c);
                        res = "cadastro efetuado com sucesso";
                    }catch(Exception e){
                        res = "erro ao cadastrar tente outro email!!!";
                    }
                }else{
                    res = "telefone invalido";
                }
            }else{
                res = "email invalido";
            }
        }else{
            res = "senha e comfirmação de senha imcompativeis ou campos em branco";
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
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
