package br.com.pratica.jdbc.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	public Connection getConnection(){
		Connection con = null;
		try{
		con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cjweb1","postgres","123456");
		System.out.println("conectado com sucesso");
		}catch(Exception e){
			
			System.out.println("Error!!!");
		}
		return con;
	}
}
