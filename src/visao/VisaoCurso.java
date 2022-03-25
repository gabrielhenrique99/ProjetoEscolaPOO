package visao;

import java.util.List;
import java.util.Scanner;

import Controle.ControleCurso;
import modelo.Curso;

public class VisaoCurso {
	
	private Scanner jIn;
    private ControleCurso cControle;

    public VisaoCurso() {
        this.jIn = new Scanner(System.in);
        this.cControle = new ControleCurso();
    }

    public Curso salvar() {
    	System.out.println("Digite o nome do curso:");
        String nomeCurso = this.jIn.nextLine();
        System.out.println("Digite a carga horária do curso:");
        String cargaHoraria = this.jIn.nextLine();
        System.out.println("Digite o turno do curso: ");
        String turnoCurso = this.jIn.nextLine();
        System.out.println("Digite a área do curso: ");
        String areaCurso = this.jIn.nextLine();
        System.out.println("Digite o instrutor do curso");
        String instrutorCurso = this.jIn.nextLine();
       
        
        return this.cControle.salvar(nomeCurso,cargaHoraria,turnoCurso,areaCurso,instrutorCurso);
    }

    public void atualizar() {
        Curso c = new Curso();
        System.out.println("Digite o codigo do curso:");
        c.setIdCurso(this.jIn.nextLine());
        System.out.println("Digite o novo nome do curso:");
        c.setNomeCurso(jIn.nextLine());
        cControle.atualizar(c);
    }
    
    public List<Curso> listar(){
         return cControle.listar();
    }
    
    public void imprimeCurso(List<Curso> cursos) {
        System.out.println("-------- LISTA DE Cursos -------- ");
        for (Curso curso : cursos) {
            System.out.println("ID: " + curso.getIdCurso() +"| Nome do curso: "+curso.getNomeCurso()+
            		"| Carga Horária: " + curso.getCargaHoraria() + "| Turno: " + curso.getTurnoCurso() + 
                    "| Instrutor " + curso.getInstrutorCurso());
        }

    }
    
    public void excluir(){
        System.out.println("Digite o codigo do curso");
        cControle.excluir(Integer.parseInt(jIn.nextLine()));
    }


}
