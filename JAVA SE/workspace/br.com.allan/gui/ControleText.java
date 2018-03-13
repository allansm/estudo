package gui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ControleText extends JFrame{
	JButton ok;
	JButton cancel;
	JTextField login;
	JPasswordField senha;
	
	public ControleText(){
		super("Textos e Senhas");
		ok = new JButton("ok");
		ok.addActionListener(new BotaoOkListener());
		cancel = new JButton("cancel");
		cancel.addActionListener(new BotaoCancelListener());
		login = new JTextField();
		senha = new JPasswordField();
		Container c = getContentPane();
		c.setLayout(new GridLayout(3,2));
		c.add(new JLabel("login:"));
		c.add(login);
		c.add(new JLabel("senha:"));
		c.add(senha);
		c.add(ok);
		c.add(cancel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		setVisible(true);
	}
	class BotaoOkListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String s = "login : "+login.getText() + "\nsenha : "+ new String(senha.getPassword());
			JOptionPane.showMessageDialog(null, s);
			
		}
	}
	class BotaoCancelListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			login.setText("");
			senha.setText("");
		}
	}
	
	public static void main(String[] args){
		new ControleText();
	}
}
