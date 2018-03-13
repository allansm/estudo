package br.com.allan.testes;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Invasao {
	private Socket socket;
	private ServerSocket s = new ServerSocket(5000);
	private PrintWriter sc;
	private Scanner leitura;
	private List<PrintWriter> lista = new ArrayList<>();
	public Invasao()throws Exception{
		while(true){
			socket = s.accept();
			new Thread(new EscutaCliente(socket)).start();
			PrintWriter p = new PrintWriter(socket.getOutputStream());
			lista.add(p);
			
		}
		
	}
	public class EscutaCliente implements Runnable{
		public EscutaCliente(Socket socket){
			try{
				leitura = new Scanner(socket.getInputStream());
			}catch(Exception e){
				
			}
		}
		public void run(){
			try{
				String texto;
				while((texto = leitura.nextLine())!= null){
					System.out.println(texto);
					for(PrintWriter a:lista){
						a.println(texto);
						a.flush();
					}
				}
			}catch(Exception e){
				
			}
		}
	}
	public static void main(String[] args)throws Exception{
		new Invasao();
	}
}
