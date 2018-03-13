package br.com.allan.colecao;

import java.util.ArrayList;

public class Generico <E>{
	E generico;
	public void setGenerico(E generico){
		this.generico = generico;
	}
	public E getGenerico(){
		return generico;
	}
	public double soma(ArrayList<? extends Number> lista){
		double total = 0;
		for(Number number : lista){
			total = total + number.doubleValue();
		}
		return total;
	}
	public static void main(String[] args){
		Generico<String> g = new Generico();
		g.setGenerico("Allan");
		System.out.println(g.getGenerico());
		System.out.println(g.getGenerico().toUpperCase());
		//g.setGenerico(21);
		
		System.out.println(g.getGenerico().toLowerCase());
		//g.setGenerico(22.1);
		
		
	}
}
