package br.com.allan.refinado;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Aninhamento extends JFrame {
	JButton botao;
	public Aninhamento(){
		Container c = getContentPane();
		setTitle("Aninhamento");
		botao = new JButton("ok");
		botao.addActionListener(new ListenerAninhado());
		botao.addActionListener(new ActionListener(){//class anonima
			public void actionPerformed(ActionEvent e){
				System.out.println("classe anonima executa "+botao.getText());
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		c.add(botao);
	}
	public class ListenerAninhado implements ActionListener{//class aninhada a class principal
		public void actionPerformed(ActionEvent e){
			System.out.println("classe aninhada executa "+botao.getText());
		}
	}
	public static void main(String[] args){
		Aninhamento janela = new Aninhamento();
		Aninhamento.ListenerAninhado listener = janela.new ListenerAninhado();//class envolvente
	}
}
