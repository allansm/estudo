package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Conversor extends JFrame {

	private JPanel contentPane;
	private JTextField valor;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor frame = new Conversor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Conversor() {
		setTitle("Conversor de temperatura");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 149);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnConverter = new JButton("Converter");
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double fahreheit = Double.parseDouble(valor.getText());
				Double celsius = (fahreheit - 32)/1.8;
				resultado.setText(Math.round(celsius)+" °C");
			}
		});
		btnConverter.setFont(new Font("Tahoma", Font.PLAIN, 26));
		contentPane.add(btnConverter, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 2, 5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("Fahreheit:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(lblNewLabel_1);
		
		valor = new JTextField();
		valor.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(valor);
		valor.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Celsius:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(lblNewLabel);
		
		resultado = new JTextField();
		resultado.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(resultado);
		resultado.setColumns(10);
	}

}
