package br.com.allan.chat;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Servidor {
	List<PrintWriter> escritores = new ArrayList<>();
	ServerSocket server;
	Socket socket;
	Scanner w;
	public Servidor(){
		try{
			server = new ServerSocket(5000);
			while(true){
				socket = server.accept();
				new Thread(new EscutaCliente(socket)).start();
				PrintWriter p = new PrintWriter(socket.getOutputStream());
				escritores.add(p);
				
			}
		}catch(Exception e){
			System.out.println("deu merda");
		}
		
	}
	public void encaminhaParaTodos(String texto){
		for(PrintWriter w : escritores){
			try{
				w.println(texto);
				w.flush();
			}catch(Exception e){
				System.out.println("deu merda");
			}
		}
	}
	private class EscutaCliente implements Runnable{
		Scanner leitor;
		public EscutaCliente(Socket socket){
			try{
				leitor = new Scanner(socket.getInputStream());
			}catch(Exception e){
				System.out.println("deu merda");
			}
		}
		public void run(){
			try{
				String texto;
				while((texto = leitor.nextLine())!= null){
					System.out.println(texto);
					encaminhaParaTodos(texto);
				}
			}catch(Exception e){
				
			}
		}
	}
	public static void main(String[] args){
		new Servidor();
	}
}
