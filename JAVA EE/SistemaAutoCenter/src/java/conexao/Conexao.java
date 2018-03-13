package conexao;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexao {
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/db", "root", "");
        }catch(Exception e){
            return null;
        }
    }
}
