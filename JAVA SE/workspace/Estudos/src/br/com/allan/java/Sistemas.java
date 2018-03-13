package br.com.allan.java;

import java.util.Properties;
import java.util.Set;

public class Sistemas {
	public static void main(String[] args){
		Properties p = 	System.getProperties();
		System.out.println(p.getProperty("java.version"));
		p.setProperty("allan.curso.java.version","1.0.0");
		Set<Object> pk = p.keySet();
		/*for(Object key : pk){
			
			System.out.println(key + " = " + p.get(key));
		}*/
		/*Console c = System.console();
		System.out.print("Usuario:");
		String user = c.readLine();
		System.out.print("senha:");
		char[] pass = c.readPassword();
		System.out.println("usuario="+user+" senha="+pass);*/
		try{
		Runtime.getRuntime().exec("notepad");
		}catch(Exception e){
			
		}
	}
}
