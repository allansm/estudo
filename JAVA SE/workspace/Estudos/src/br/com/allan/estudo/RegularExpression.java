package br.com.allan.estudo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class RegularExpression {
	
	public static void main(String[] args){
		
		String padrao = "(www).(\\w.*)\\.(\\w{3})";
		String palavra = JOptionPane.showInputDialog("digite um site que tenha www.nomedosite.com.br");
		boolean sn = palavra.matches(padrao);
		String http = palavra.replaceAll(padrao, "http://$1.$2.$3/index.html");
		if(sn == true){
			System.out.println(http);	
		}else{
			System.out.println("endereço invalido");
		}
	}
}
