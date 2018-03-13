package estudo;

import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args){
		boolean n;
		do{
			try{
				int numero = Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
				System.out.println(numero);
				n = true;
			}catch(Exception e){
				n = false;
			}
		}while(n == false);
	}
}
