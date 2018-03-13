package gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ControleCheck extends JFrame {
	JTextField texto;
	JCheckBox bold;
	JCheckBox italic;
	public ControleCheck(){
		Container c = getContentPane();	
		c.setLayout(new FlowLayout());
		texto = new JTextField("Veja a fonte mudar",12);
		texto.setFont(new Font("serif",Font.PLAIN,26));
		bold = new JCheckBox("Bold");
		italic = new JCheckBox("Italic");
		bold.addItemListener(new CheckBoxListener());
		italic.addItemListener(new CheckBoxListener());
		c.add(texto);
		c.add(bold);
		c.add(italic);
		setTitle("ControleCheck");
		setSize(300,120);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	class CheckBoxListener implements ItemListener{

		
		public void itemStateChanged(ItemEvent e) {
			if(bold.isSelected() && italic.isSelected()){
			texto.setFont(new Font("serif",Font.BOLD |Font.ITALIC,26));
			}else if(bold.isSelected()){
				texto.setFont(new Font("serif",Font.BOLD,26));
			}else if(italic.isSelected()){
				texto.setFont(new Font("serif",Font.ITALIC,26));
			}else{
				texto.setFont(new Font("serif",Font.PLAIN,26));
			}
			
		}
		
	}
	
	public static void main(String[] args){
		new ControleCheck();
	}
}
