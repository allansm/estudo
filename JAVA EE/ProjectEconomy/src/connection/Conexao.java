package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	public Connection getConnection() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost/economy","root","");
	}
}
