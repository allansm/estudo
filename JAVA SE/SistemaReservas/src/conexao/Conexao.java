

package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Conexao {
    
    public static Connection getConnection(){
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/reservas","root","");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null ,e);
            return null;
        }
    }
}
