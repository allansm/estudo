package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Conta;
import persistence.ContaDao;

@WebServlet("/Depositar")
public class DepositoController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Conta conta = new Conta();
		conta.setId((int)request.getSession().getAttribute("conta"));
		double saldo = Double.parseDouble(request.getParameter("valor"))+(double) request.getSession().getAttribute("saldo");
		conta.setSaldo(saldo);
		try {
			new ContaDao().deposit(conta);
			conta = new ContaDao().select(conta);
			request.getSession().setAttribute("saldo", conta.getSaldo());
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}catch(Exception e) {
			e.printStackTrace(response.getWriter());
		}
	}
}
