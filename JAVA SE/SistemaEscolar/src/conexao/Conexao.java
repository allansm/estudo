

package conexao;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexao {
    public static Connection getConnection(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost/escola", "root", "");
        }catch(Exception e){
            return null;
        }
    }
}
