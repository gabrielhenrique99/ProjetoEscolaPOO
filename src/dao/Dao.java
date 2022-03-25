package dao;

import util.ConnectionFactory;
import java.sql.Connection;

public class Dao {
	protected Connection conexao;
	    
	public Dao(){        
		this.conexao = ConnectionFactory.getConnect();
	}
	    
}


