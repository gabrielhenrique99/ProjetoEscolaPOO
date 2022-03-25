package Controle;

import java.util.List;

import dao.DaoFactory;
import modelo.Matricula;

public class ControleMatricula {
	
	public Matricula salvar(String dataMatricula, String aluno,String turma){
		Matricula matricula = new Matricula();
		matricula.setDataMatricula(dataMatricula);
		matricula.setAluno(aluno);
		matricula.setTurma(turma);
        
       matricula.setIdMatricula(DaoFactory.getMatriculaDao().salvar(matricula));
        
        return matricula;
    }
    
    public void atualizar(Matricula matricula){
        DaoFactory.getMatriculaDao().atualizar(matricula);          
    }
    
    public List<Matricula> listar(){
         return DaoFactory.getMatriculaDao().listar();
    }
    
    public void excluir(Integer id){
        DaoFactory.getMatriculaDao().excluir(id);
    }


}
