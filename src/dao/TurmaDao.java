package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import app.App;
import modelo.Turma;

public class TurmaDao extends Dao {
	
	public List<Turma> listar() {
        List<Turma> turmas = new ArrayList<>();
        try {
            
        	PreparedStatement stmt = this.conexao.prepareStatement("SELECT t.idTurma, c.nomeCurso, t.dataInicio, t.dataFim FROM turma AS t INNER JOIN curso AS c ON(t.cursoTurma=c.idCurso) ORDER BY(t.idTurma);");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
            	Turma turma = new Turma();
                                
                turma.setIdTurma(rs.getString("idTurma"));
                turma.setCurso(rs.getString("nomeCurso"));
                turma.setDataInicio(rs.getString("dataInicio"));
                turma.setDataFim(rs.getString("dataFim"));
                
                turmas.add(turma);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        return turmas;
    }

    public String salvar(Turma turma) {
    	String last_inserted_id = null;
        try {
            
            PreparedStatement stmt = this.conexao.prepareStatement("INSERT INTO turma (cursoTurma, dataInicio, dataFim) VALUES (?,?,?);"
            		, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, turma.getCurso());
            stmt.setString(2, turma.getDataInicio());
            stmt.setString(3, turma.getDataFim());
            stmt.executeUpdate();
            
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                last_inserted_id = rs.getString(1);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        return last_inserted_id;
    }

    public void excluir(int id) {

        try {            
            PreparedStatement stmt = this.conexao.prepareStatement("delete from turma where idTurma=?");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public  void atualizar(Turma t) {

        try {
            
        	PreparedStatement stmt = this.conexao.prepareStatement("update turma set dataFim=? where idTurma=?");
            stmt.setString(1, t.getDataFim());
            stmt.setString(2, t.getIdTurma());
            stmt.executeUpdate();

            
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
