package Controle;

import java.util.List;

import dao.DaoFactory;
import modelo.Turma;

public class ControleTurma {
	
	public Turma salvar(String curso, String dataInicio,
			String dataFim){
		Turma turma = new Turma();
		turma.setCurso(curso);
		turma.setDataInicio(dataInicio);
		turma.setDataFim(dataFim);

        
       turma.setIdTurma(DaoFactory.getTurmaDao().salvar(turma));
        
        return turma;
    }
    
    public void atualizar(Turma turma){
        DaoFactory.getTurmaDao().atualizar(turma);          
    }
    
    public List<Turma> listar(){
         return DaoFactory.getTurmaDao().listar();
    }
    
    public void excluir(Integer id){
        DaoFactory.getTurmaDao().excluir(id);
    }

}
