package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Conta;
import entity.Pessoa;
import entity.Usuario;
import persistence.ContaDao;
import persistence.PessoaDao;
import persistence.UsuarioDao;

@WebServlet("/Cadastrar")
public class CadastroController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Pessoa p = new Pessoa();
		Usuario u = new Usuario();
		Conta c = new Conta();
		
		p.setNome(request.getParameter("nome"));
		p.setSobrenome(request.getParameter("sobrenome"));
		p.setTelefone(request.getParameter("telefone"));
		p.setEmail(request.getParameter("email"));
		
		u.setLogin(request.getParameter("login"));
		u.setSenha(request.getParameter("senha"));
		
		c.setPessoa(0);
		c.setUsuario(0);
		if(u.getSenha().equals(request.getParameter("csenha"))) {
			try {
				new PessoaDao().insert(p);
				new UsuarioDao().insert(u);
				
				List<Pessoa> pessoas = new PessoaDao().select();
				List<Usuario> usuarios = new UsuarioDao().select();
				
				for(Pessoa i: pessoas) {
					if(i.getNome().equals(p.getNome())) {
						c.setPessoa(i.getId());
					}
				}
				int iterator = 0;
				for(Usuario i: usuarios) {
					iterator++;
					if(i.getLogin().equals(u.getLogin()) && iterator == usuarios.size()) {
						c.setUsuario(i.getId());
					}
				}
				c.setSaldo(0);
				if( c.getPessoa() != 0 && c.getUsuario() != 0) {
					new ContaDao().insert(c);
					response.getWriter().write("cadastro efetuado com sucesso");
					request.getRequestDispatcher("index.jsp").forward(request, response);
				}else {
					response.getWriter().write("error!!!!");
				}
				
			}catch(Exception e) {
				try {
					List<Pessoa> pessoas = new PessoaDao().select();
					List<Usuario> usuarios = new UsuarioDao().select();
					
					for(Pessoa i: pessoas) {
						if(i.getNome().equals(p.getNome()) && i.getId() == pessoas.size()) {
							p.setId(i.getId());
						}
					}
					
					for(Usuario i: usuarios) {
						if(i.getLogin().equals(u.getLogin())) {
							u.setId(i.getId());
						}
					}
					new PessoaDao().delete(p);
					new UsuarioDao().delete(u);
				}catch(Exception e2) {
					response.getWriter().write("total error!!");
				}
				e.printStackTrace(response.getWriter());
			}
		}else {
			response.getWriter().write("confirmação de senha invalida");
		}
	}
}
