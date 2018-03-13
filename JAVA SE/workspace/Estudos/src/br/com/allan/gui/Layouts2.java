package br.com.allan.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouts2 extends JFrame {
	public Layouts2(){
		setTitle("fuck yeah");
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		Container c2 = new JPanel();
		c2.setLayout(new GridLayout(4,1));
		c2.add(new JButton("ok"));
		c2.add(new JButton("cancel"));
		c2.add(new JButton("setup"));
		c2.add(new JButton("help"));
		c.add(BorderLayout.CENTER,new JButton("centro"));
		c.add(BorderLayout.EAST,c2);
		/*c.setLayout(new BorderLayout(15,15));
		c.add(BorderLayout.NORTH,new JButton("n"));
		c.add(BorderLayout.SOUTH,new JButton("s"));
		c.add(BorderLayout.CENTER,new JButton("c"));
		c.add(BorderLayout.EAST,new JButton("e"));
		c.add(BorderLayout.WEST,new JButton("w"));*/
		setSize(300,300);
		/*c.setLayout(new GridLayout(2,3));
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("4"));
		c.add(new JButton("5"));
		c.add(new JButton("6"));*/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args){
		new Layouts2();
	}
}
