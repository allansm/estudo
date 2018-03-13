package br.com.allan.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.com.allan.metodos.Calculos;

public class Calculadora extends JFrame{
	JButton div,multi,menos,mais,ponto,igual,raiz,clean,back,elev;
	JButton[] n = new JButton[10] ;
	JTextField texto;
	public Calculadora(){
		Container grid = new JPanel();
		Container pane = getContentPane();
		for(int i = 0; i < 10; i++){
			n[i] = new JButton(""+i);
		}
		for(int i = 0;i<10; i++){
			n[i].addActionListener(new BotaoListener(""+i));
		}
		div = new JButton("/");
		multi = new JButton("*");
		menos = new JButton("-");
		mais = new JButton("+");
		ponto = new JButton(".");
		igual = new JButton("=");
		raiz = new JButton("R");
		clean = new JButton("C");
		back = new JButton ("<-");
		elev = new JButton("x²");
		texto = new JTextField();
		texto.setEditable(false);
		texto.setFont(new Font("serif",Font.PLAIN,26));
		mais.addActionListener(new OperadorListener("+"));
		menos.addActionListener(new OperadorListener("-"));
		multi.addActionListener(new OperadorListener("*"));
		div.addActionListener(new OperadorListener("/"));
		ponto.addActionListener(new OperadorListener("."));
		igual.addActionListener(new OperadorListener("="));
		raiz.addActionListener(new OperadorListener("R"));
		clean.addActionListener(new OperadorListener("C"));
		back.addActionListener(new OperadorListener("<-"));
		elev.addActionListener(new OperadorListener("x²"));
		grid.setLayout(new GridLayout(4,4,5,5));
		grid.add(n[7]);
		grid.add(n[8]);
		grid.add(n[9]);
		grid.add(div);
		grid.add(raiz);
		grid.add(n[4]);
		grid.add(n[5]);
		grid.add(n[6]);
		grid.add(multi);
		grid.add(clean);
		grid.add(n[1]);
		grid.add(n[2]);
		grid.add(n[3]);
		grid.add(menos);
		grid.add(back);
		grid.add(n[0]);
		grid.add(ponto);
		grid.add(igual);
		grid.add(mais);
		grid.add(elev);
		Container display = new JPanel();
		display.setLayout(new BorderLayout());
		display.add(texto);
		texto.setBackground(Color.WHITE);
		display.setBackground(Color.WHITE);
		pane.add(BorderLayout.NORTH,display);
		pane.add(grid);
		setTitle("Calculadora");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
	}
	class BotaoListener implements ActionListener{
		public String valor;
		public String calculo = "";
		public String getCalculo() {
			return calculo;
		}
		public BotaoListener(String valor){
			this.valor = valor;
		}
		public void actionPerformed(ActionEvent e){
			calculo = texto.getText() + valor;
			texto.setText(calculo);
		}
	}
	class OperadorListener implements ActionListener{
		String operador;
		public OperadorListener(String operador){
			this.operador = operador;
		}
		public void actionPerformed(ActionEvent e){
			Calculos c = new Calculos();
			if(operador == "+" &&  !texto.getText().isEmpty() && c.proximoValor(texto.getText(), texto.getText().length()-1) == "numero"){
				texto.setText(texto.getText()+"+");
			}else if(operador == "-" &&  !texto.getText().isEmpty() && c.proximoValor(texto.getText(), texto.getText().length()-1) == "numero"){
				texto.setText(texto.getText()+"-");
			}else if(operador == "*" &&  !texto.getText().isEmpty() && c.proximoValor(texto.getText(), texto.getText().length()-1) == "numero"){
				texto.setText(texto.getText()+"*");
			}else if(operador == "/" &&  !texto.getText().isEmpty() && c.proximoValor(texto.getText(), texto.getText().length()-1) == "numero"){
				texto.setText(texto.getText()+"/");
			}else if(operador == "." &&  !texto.getText().isEmpty() && c.proximoValor(texto.getText(), texto.getText().length()-1) == "numero"){
				texto.setText(texto.getText()+".");
			}else if(operador == "=" && !texto.getText().isEmpty() && c.proximoValor(texto.getText(), texto.getText().length()-1) == "numero"){
				Calculos calc = new Calculos();
				double result = calc.calculo(texto.getText());
				texto.setText(""+result);
			}else if(operador == "C"){
				texto.setText("");
			}
			else if(operador == "<-"){
				String text = "";
				for(int i = 0;i<texto.getText().length()-1;i++){
					text = text + texto.getText().charAt(i);
				}
				texto.setText(text);
			}else if(operador == "R" && !texto.getText().isEmpty()){
				try{
					texto.setText(""+Math.sqrt(Double.parseDouble(texto.getText())));
				}catch(Exception a){
					texto.setText("Erro!!!");
				}
			}else if(operador == "x²" && !texto.getText().isEmpty()){
				try{
					texto.setText(""+Math.pow(Double.parseDouble(texto.getText()),2));
				}catch(Exception a){
					texto.setText("Erro!!!");
				}
			}
		}
	}
	public static void main(String[] args){
		new Calculadora();
	}
}
