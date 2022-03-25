import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Teste {

	public static void main(String[] args) {
				    
		    String banco = "bd_escola";
		    String usuario = "teste";
		    String senha = "IFCE10";
		    
		    Connection con;
		        
		        try {
		            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+banco, usuario, senha);
		            System.out.println("Deu certo");
		        } catch (SQLException ex) {
		            System.out.println(ex.getMessage());
		        }
		        
		

	}

}
