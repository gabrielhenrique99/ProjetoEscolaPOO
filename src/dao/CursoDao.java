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
import modelo.Curso;

public class CursoDao extends Dao {
	
	public List<Curso> listar() {
        List<Curso> cursos = new ArrayList<>();
        try {
            
        	PreparedStatement stmt = this.conexao.prepareStatement("SELECT c.idcurso, c.nomeCurso, c.cargaHoraria, c.turnoCurso, c.areaCurso, c.idInstrutor, i.idInstrutor, p.idPessoa, p.nomePessoa FROM curso AS c INNER JOIN instrutor AS i ON(c.idInstrutor=i.idInstrutor) INNER JOIN pessoa AS p ON(i.idPessoa=p.idPessoa);");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
            	Curso curso = new Curso();
                                
                curso.setIdCurso(rs.getString("idCurso"));
                curso.setNomeCurso(rs.getString("nomeCurso")); 
                curso.setCargaHoraria(rs.getString("cargaHoraria"));
                curso.setTurnoCurso(rs.getString("turnoCurso"));
                curso.setAreaCurso(rs.getString("areaCurso"));
                curso.setInstrutorCurso(rs.getString("nomePessoa"));
                cursos.add(curso);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cursos;
    }

    public String salvar(Curso curso) {
    	String last_inserted_id = null;
        try {
            
            PreparedStatement stmt = this.conexao.prepareStatement("INSERT INTO curso (nomeCurso,cargaHoraria,turnoCurso,"+
                    "areaCurso,idInstrutor) VALUES (?,?,?,?,?)"
            		, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, curso.getNomeCurso());
            stmt.setString(2, curso.getCargaHoraria());
            stmt.setString(3, curso.getTurnoCurso());
            stmt.setString(4, curso.getAreaCurso());
            stmt.setString(5, curso.getInstrutorCurso());
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
            PreparedStatement stmt = this.conexao.prepareStatement("delete from curso where idCurso=?");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public  void atualizar(Curso c) {

        try {
            
        	PreparedStatement stmt = this.conexao.prepareStatement("update curso set nomeCurso=? where idCurso=?");
            stmt.setString(1, c.getNomeCurso());
            stmt.setString(2, c.getIdCurso());
            stmt.executeUpdate();

            
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
