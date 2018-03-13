package br.com.allan.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleCombo extends JFrame{
	JComboBox<String> combo;
	JLabel label;
	ImageIcon[] imagens = {
			new ImageIcon(getClass().getResource("fotos/01.jpg")),
			new ImageIcon(getClass().getResource("fotos/02.jpg")),
			new ImageIcon(getClass().getResource("fotos/03.jpg")),
			new ImageIcon(getClass().getResource("fotos/04.jpg"))
	};
	public ControleCombo(){
		setTitle("Album de fotos");
		Container c = getContentPane();
		combo = new JComboBox<String>();
		combo.setFont(new Font("Serif",Font.PLAIN,26));
		combo.addItem("katana 1");
		combo.addItem("katana 2");
		combo.addItem("katana 3");
		combo.addItem("katana 4");
		label = new JLabel(imagens[0]);
		c.add(BorderLayout.NORTH,combo);
		c.add(BorderLayout.CENTER,label);
		combo.addItemListener(new ItemsListener());
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	public class ItemsListener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			label.setIcon(imagens[combo.getSelectedIndex()]);
		}
		
	}
	public static void main(String[] args){
		new ControleCombo();
	}
}
