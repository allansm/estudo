package br.com.allan.testes;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Invasao2 {
	Socket socket;
	PrintWriter texto;
	public Invasao2(){
			try{
				socket = new Socket("192.168.1.5",5000);
				Scanner s = new Scanner(socket.getInputStream());
				texto = new PrintWriter(socket.getOutputStream());
				texto.println(JOptionPane.showInputDialog("digite algo"));
				texto.flush();
			}catch(Exception e){
				System.out.println("deu merda");
			}
	}
	public static void main(String[] args){
		new Invasao2();
	}
}
