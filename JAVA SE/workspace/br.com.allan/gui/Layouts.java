package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layouts extends JFrame {
	
	public Layouts(){
		setTitle("fodase");
		Container c = getContentPane();
		/*BorderLayout border = new BorderLayout();
		c.setLayout(border);
		c.add(BorderLayout.NORTH,new JButton("1"));
		c.add(BorderLayout.SOUTH,new JButton("2"));
		c.add(BorderLayout.CENTER,new JButton("3"));
		c.add(BorderLayout.EAST,new JButton("4"));
		c.add(BorderLayout.WEST,new JButton("5"));*/
		c.setLayout(new FlowLayout());
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args){
		
		new Layouts();
	}
}