package dao;

import modelo.Aluno;
import app.App;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AlunoDao extends Dao {
	
	public List<Aluno> listar() {
        List<Aluno> alunos = new ArrayList<>();
        try {
            
        	PreparedStatement stmt = this.conexao.prepareStatement("SELECT p.idPessoa, p.nomePessoa, p.dtNascimentoPessoa,p.cpfPessoa, p.dddPessoa, p.telefonePessoa,p.emailPessoa,p.enderecoPessoa,p.cidadePessoa,p.estadoPessoa, a.numeroMatricula FROM aluno AS a INNER JOIN pessoa AS p ON(a.idPessoa=p.idPessoa) ORDER BY p.nomePessoa;");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
            	Aluno aluno = new Aluno();
                                
            	aluno.setIdPessoa(rs.getString("idPessoa"));
                aluno.setNomePessoa(rs.getString("nomePessoa"));
                aluno.setDtNascimentoPessoa(rs.getString("dtNascimentoPessoa"));
                aluno.setCpfPessoa(rs.getString("cpfPessoa"));
                aluno.setDddPessoa(rs.getString("dddPessoa"));
                aluno.setTelefonePessoa(rs.getString("telefonePessoa"));
                aluno.setEmailPessoa(rs.getString("emailPessoa"));
                aluno.setEnderecoPessoa(rs.getString("enderecoPessoa"));
                aluno.setCidadePessoa(rs.getString("cidadePessoa"));
                aluno.setEstadoPessoa(rs.getString("estadoPessoa"));
                aluno.setNumeroMatricula(rs.getString("numeroMatricula"));
                
                alunos.add(aluno);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alunos;
    }

    public String salvar(Aluno aluno) {
    	String last_inserted_id = null;
        try {
            
            PreparedStatement stmt = this.conexao.prepareStatement("INSERT INTO pessoa (nomePessoa,dtNascimentoPessoa,cpfPessoa,"+
                    "dddPessoa,telefonePessoa,emailPessoa,enderecoPessoa,cidadePessoa,estadoPessoa) VALUES (?,?,?,?,?,?,?,?,?)"
            		, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, aluno.getNomePessoa());
            stmt.setString(2, aluno.getDtNascimentoPessoa());
            stmt.setString(3, aluno.getCpfPessoa());
            stmt.setString(4, aluno.getDddPessoa());
            stmt.setString(5, aluno.getTelefonePessoa());
            stmt.setString(6, aluno.getEmailPessoa());
            stmt.setString(7, aluno.getEnderecoPessoa());
            stmt.setString(8, aluno.getCidadePessoa());
            stmt.setString(9, aluno.getEstadoPessoa());
            stmt.executeUpdate();
            
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                last_inserted_id = rs.getString(1);
            }
            
            stmt = this.conexao.prepareStatement("INSERT INTO aluno (numeroMatricula,idPessoa) VALUES (?,?)");
            stmt.setString(1, aluno.getNumeroMatricula());
            stmt.setString(2, last_inserted_id);
            stmt.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        return last_inserted_id;
    }

    public void excluir(int id) {

        try {            
            PreparedStatement stmt = this.conexao.prepareStatement("delete from aluno where idPessoa=?");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public  void atualizar(Aluno a) {

        try {
            
        	PreparedStatement stmt = this.conexao.prepareStatement("update pessoa set nomePessoa=? where idPessoa=?");
            stmt.setString(1, a.getNomePessoa());
            stmt.setString(2, a.getIdPessoa());
            stmt.executeUpdate();
            
            //stmt = this.conexao.prepareStatement("update aluno set numeroMatricula=? where idPessoa=?");
            //stmt.setString(1, a.getNumeroMatricula());
            //stmt.setString(2, a.getIdPessoa());
            //stmt.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
	
}
