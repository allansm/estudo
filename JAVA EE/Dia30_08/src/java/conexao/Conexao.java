
package conexao;

import java.sql.DriverManager;
import java.sql.Connection;


public  class Conexao {
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1/banco","root","");
        }catch(Exception e){
            //return null;
            throw new RuntimeException(e);
        }
    }        
}
