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
import modelo.Matricula;

public class MatriculaDao extends Dao {
	
	public List<Matricula> listar() {
        List<Matricula> matriculas = new ArrayList<>();
        try {
            
        	PreparedStatement stmt = this.conexao.prepareStatement("SELECT m.idMatricula, m.dataMatricula, m.alunoMatricula, m.turmaMatricula, a.idAluno, p.idPessoa, p.nomePessoa, t.idTurma, c.nomeCurso FROM matricula AS m INNER JOIN turma AS t ON(m.turmaMatricula=t.idTurma) INNER JOIN aluno AS a ON (m.alunoMatricula=a.idAluno) INNER JOIN pessoa AS p ON(a.idPessoa=p.idPessoa) INNER JOIN curso AS c ON (c.idCurso=t.cursoTurma);");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
            	Matricula matricula = new Matricula();
            	
            	matricula.setIdMatricula(rs.getString("idMatricula"));
            	matricula.setDataMatricula(rs.getString("dataMatricula"));
            	matricula.setAluno(rs.getString("nomePessoa"));
            	matricula.setTurma(rs.getString("nomeCurso"));
                matriculas.add(matricula);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        return matriculas;
    }

    public String salvar(Matricula matricula) {
    	String last_inserted_id = null;
        try {
            
            PreparedStatement stmt = this.conexao.prepareStatement("INSERT INTO matricula (dataMatricula,alunoMatricula,turmaMatricula) VALUES (?,?,?)"
            		, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, matricula.getDataMatricula());
            stmt.setString(2, matricula.getAluno());
            stmt.setString(3, matricula.getTurma());
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
            PreparedStatement stmt = this.conexao.prepareStatement("delete from matricula where idMatricula=?");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public  void atualizar(Matricula m) {

        try {
            
        	PreparedStatement stmt = this.conexao.prepareStatement("update matricula set turmaMatricula=? where idMatricula=?");
            stmt.setString(1, m.getTurma());
            stmt.setString(2, m.getIdMatricula());
            stmt.executeUpdate();

            
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}
