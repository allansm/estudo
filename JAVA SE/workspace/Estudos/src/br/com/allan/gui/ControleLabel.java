package br.com.allan.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleLabel extends JFrame {
	
	public ControleLabel(){
		super("ControleLabel");
		JLabel simples = new JLabel("Label simples");
		simples.setToolTipText("ToolTip");
		Font fonte = new Font("serif",Font.BOLD | Font.ITALIC,28);
		JLabel label = new JLabel("Label simples");
		label.setFont(fonte);
		label.setForeground(Color.BLUE);
		ImageIcon icon = new ImageIcon(getClass().getResource("img/mob8.gif"));
		//ImageIcon icon = new ImageIcon("gui.img\\mob8.gif");
		JLabel imagem = new JLabel(icon);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(simples);
		c.add(label);
		c.add(imagem);
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args){
		new ControleLabel();
	}
}
