package br.com.allan.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class IncluirDados {
	public static void main(String[] args)throws Exception{
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String sql = "insert into pessoa values (?,?,?,?)";
		String[] pessoas = {"um","dois","tres","quatro","cinco","seis","sete"};
		try(Connection con = DriverManager.getConnection(url , "allan","123456")){
			try(PreparedStatement stm = con.prepareStatement(sql)){
				for(int i = 0; i <pessoas.length;i++){
					stm.setInt(1,i+4);
					stm.setString(2,pessoas[i]);
					stm.setString(3, "i");
					stm.setString(4,pessoas[i]+"@hotmail.com");
					stm.addBatch();
				}
				stm.executeBatch();
			}catch(Exception e){}
				sql = "select nome,email from pessoa";
				try(PreparedStatement stm2 = con.prepareStatement(sql)){
					ResultSet rs = stm2.executeQuery();
					while(rs.next()){
						System.out.println(rs.getString(1)+ ":"+rs.getString(2));
					}
				}
			
		}
	}
}	
