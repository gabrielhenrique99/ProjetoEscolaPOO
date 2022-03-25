package Controle;

import java.util.List;

import dao.DaoFactory;
import modelo.Curso;

public class ControleCurso {
	
	public Curso salvar(String nomeCurso, String cargaHoraria,
			String turnoCurso, String areaCurso, String instrutorCurso){
		Curso curso = new Curso();
		curso.setNomeCurso(nomeCurso);
		curso.setCargaHoraria(cargaHoraria);
		curso.setTurnoCurso(turnoCurso);
		curso.setAreaCurso(areaCurso);
		curso.setInstrutorCurso(instrutorCurso);
        
       curso.setIdCurso(DaoFactory.getCursoDao().salvar(curso));
        
        return curso;
    }
    
    public void atualizar(Curso curso){
        DaoFactory.getCursoDao().atualizar(curso);          
    }
    
    public List<Curso> listar(){
         return DaoFactory.getCursoDao().listar();
    }
    
    public void excluir(Integer id){
        DaoFactory.getCursoDao().excluir(id);
    }

}
