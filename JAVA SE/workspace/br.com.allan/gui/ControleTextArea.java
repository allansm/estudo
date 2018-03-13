package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ControleTextArea extends JFrame {
	JTextArea texto;
	JScrollPane barra;
	JButton botao;
	public ControleTextArea(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		texto = new JTextArea();
		texto.setFont(new Font("serif",Font.PLAIN,26));
		barra = new JScrollPane(texto);
		botao = new JButton("Abrir Arquivo");
		botao.setFont(new Font("serif",Font.PLAIN,26));
		Container c = getContentPane();
		botao.addActionListener(new BotaoListener());
		c.add(BorderLayout.CENTER,barra);
		c.add(BorderLayout.NORTH,botao);
	
		setTitle("Editor de textos");
		setSize(500,300);
		setVisible(true);
	}
	public class BotaoListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			JFileChooser c = new JFileChooser();
			c.showOpenDialog(botao);
			File file = c.getSelectedFile();
			try{
				/*Path path = Paths.get(file.getPath());
				BufferedReader leitura = Files.newBufferedReader(path);
				String txt = "";
				while(leitura.ready()){
					txt = txt + leitura.readLine()+"\n";
				}
				texto.setText(txt);
				leitura.close();*/ //feito por minha mente maligna '-'
				Path path = Paths.get(file.getAbsolutePath());
				String retorno = new String(Files.readAllBytes(path));
				texto.setText(retorno);
			}catch(Exception a){
				JOptionPane.showMessageDialog(null, "não foi possivel carregar o arquivo");
			}
			
		}
	}
	public static void main(String[] args){
		new ControleTextArea();
	}
}
