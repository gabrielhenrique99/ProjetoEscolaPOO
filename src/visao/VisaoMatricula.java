package visao;

import java.util.List;
import java.util.Scanner;

import Controle.ControleMatricula;
import modelo.Matricula;

public class VisaoMatricula {
	
	private Scanner jIn;
    private ControleMatricula mControle;

    public VisaoMatricula() {
        this.jIn = new Scanner(System.in);
        this.mControle = new ControleMatricula();
    }

    public Matricula salvar() {
    	System.out.println("Digite a data de hoje:");
        String dataMatricula = this.jIn.nextLine();
        System.out.println("Digite o código do aluno:");
        String aluno = this.jIn.nextLine();
        System.out.println("Digite o código da turma: ");
        String turma = this.jIn.nextLine();
        
        return this.mControle.salvar(dataMatricula,aluno,turma);
    }

    public void atualizar() {
        Matricula m = new Matricula();
        System.out.println("Digite o código da matricula do Aluno:");
        m.setIdMatricula(this.jIn.nextLine());
        System.out.println("Digite a nova turma do aluno:");
        m.setTurma(jIn.nextLine());
        mControle.atualizar(m);
    }
    
    public List<Matricula> listar(){
         return mControle.listar();
    }
    
    public void imprimeMatricula(List<Matricula> matriculas) {
        System.out.println("-------- LISTA DE MATRICULAS -------- ");
        for (Matricula matricula : matriculas) {
            System.out.println("ID: " + matricula.getIdMatricula() +"| Data da Matricula: "+matricula.getDataMatricula() + 
            		"| Nome do Aluno: " + matricula.getAluno() + "| Turma: " + matricula.getTurma());
        }

    }
    
    public void excluir(){
        System.out.println("Digite a matrícula");
        mControle.excluir(Integer.parseInt(jIn.nextLine()));
    }


}
