package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    
    private static final String banco = "testeescola";
    private static final String usuario = "teste";
    private static final String senha = "IFCE10";
    
    public static Connection getConnect(){
        
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/"+banco, usuario, senha);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

}
