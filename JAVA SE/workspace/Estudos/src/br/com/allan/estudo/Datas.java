package br.com.allan.estudo;

import java.util.Date;

public class Datas {
	public static void main(String[] args){
		System.out.println(System.currentTimeMillis());
		Date agora = new Date();
		System.out.println(agora);
		Date data = new Date(1456100000000l);
		System.out.println(data);
	}
}
