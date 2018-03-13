package br.com.allan.redes;

import java.net.Socket;
import java.util.Scanner;

public class ConselhoCliente {
	public static void main(String[] args)throws Exception{
		//0 - 1023 portas conhecidas nao devem ser usadas
		Socket socket = new Socket("192.168.1.5",5000);
		Scanner s = new Scanner(socket.getInputStream());
		System.out.println("mensagem : "+ s.nextLine());
		s.close();
	}
}
