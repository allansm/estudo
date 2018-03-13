package br.com.allan.chat;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Chat extends JFrame {
	String nome;
	JTextField chat ;
	JButton enviar;
	JTextArea textoRecebido;
	JScrollPane scroll;
	Font fonte = new Font("serif",Font.PLAIN,20);
	Container pane;
	Socket socket;
	PrintWriter escritor;
	Scanner leitor;
	public Chat(String nome){
		this.nome = nome;
		chat = new JTextField();
		enviar = new JButton("Enviar");
		textoRecebido = new JTextArea();
		textoRecebido.setEditable(false);
		scroll = new JScrollPane(textoRecebido);
		chat.setFont(fonte);
		enviar.setFont(fonte);
		textoRecebido.setFont(fonte);
		pane = new JPanel();
		pane.setLayout(new BorderLayout());
		pane.add(BorderLayout.CENTER,chat);
		pane.add(BorderLayout.EAST,enviar);
		getContentPane().add(BorderLayout.CENTER,scroll);
		getContentPane().add(BorderLayout.SOUTH,pane);
		setTitle("Chat "+this.nome);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		configurarRede();
		enviar.addActionListener(new EnviarListener());
	}
	private class EnviarListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			escritor.println(nome+":"+chat.getText());
			escritor.flush();
			chat.setText("");
			chat.requestFocus();
		}
	}
	public void configurarRede(){
		try{
			socket = new Socket("192.168.1.5",5000);
			escritor = new PrintWriter(socket.getOutputStream());
			leitor = new Scanner(socket.getInputStream());
			new Thread(new EscutaServidor()).start();
		}catch(Exception x){
			System.out.println("deu merda");
		}
	}
	private class EscutaServidor implements Runnable{
		
		public void run(){
			try{
				String texto;
				while((texto = leitor.nextLine())!=null){
					textoRecebido.setText(textoRecebido.getText()+texto+"\n");
				}
			}catch(Exception e){
				System.out.println("deu merda");
			}
		}
	}
	public static void main(String[] args){
		String name = JOptionPane.showInputDialog("digite seu nome : ");
		new Chat(name);
	}
}
