package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Compra;
import persistence.CompraDao;

@WebServlet("/CadastrarCompra")
public class ProdutoController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Compra c = new Compra();
		c.setId(Integer.parseInt(request.getParameter("pid")));
		try {
			new CompraDao().delete(c);
			refresh(request);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}catch(Exception e) {
			e.printStackTrace(response.getWriter());
		}
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Compra c = new Compra();
		c.setProduto(request.getParameter("produto"));
		c.setValor(Double.parseDouble(request.getParameter("valorProduto")));
		c.setIdConta((int)request.getSession().getAttribute("conta"));
		c.setData(request.getParameter("data"));
		try {
			new CompraDao().insert(c);
			refresh(request);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}catch(Exception e) {
			e.printStackTrace(response.getWriter());
		}
	}
	private void refresh(HttpServletRequest request) throws Exception{
		double saldoTotal  = (double)request.getSession().getAttribute("saldo");
		double saldoAtual = 0;
		List<Compra> lista = new CompraDao().select();
		int id = (int)request.getSession().getAttribute("conta");
		String s = "";
		String style =  "float:left;padding:10px;border:1px dashed #333;margin:5px;width:30%;text-align:center";
		for(Compra l:lista) {
			if(l.getIdConta() == id) {
				saldoAtual += l.getValor();
				s += "<form method='get' action='./CadastrarCompra'><div style='"+style+"'><input style='display:none' type='text' name='pid' value='"+l.getId()+"'>produto: "+l.getProduto()+"<br/><br/>custo: "+l.getValor()+"<br/><br/>data: "+l.getData()+"<br/><br/><input type='submit' value='deletar' style='width:100%'></div></form>";
			}
		}
		saldoAtual = saldoTotal-saldoAtual;
		request.getSession().setAttribute("saldoAtual", saldoAtual);
		request.getSession().setAttribute("compras", s);
	}
}
