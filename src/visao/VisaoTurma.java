package visao;

import java.util.List;
import java.util.Scanner;

import Controle.ControleTurma;
import modelo.Turma;

public class VisaoTurma {
	
	private Scanner jIn;
    private ControleTurma tControle;

    public VisaoTurma() {
        this.jIn = new Scanner(System.in);
        this.tControle = new ControleTurma();
    }

    public Turma salvar() {
    	System.out.println("Digite o curso da turma:");
        String curso = this.jIn.nextLine();
        System.out.println("Digite a data de inicia da turma:");
        String dataInicio = this.jIn.nextLine();
        System.out.println("Digite a data do fim da turma: ");
        String dataFim = this.jIn.nextLine();
       
        
        return this.tControle.salvar(curso,dataInicio,dataFim);
    }

    public void atualizar() {
        Turma t = new Turma();
        System.out.println("Digite o codigo da turma:");
        t.setIdTurma(this.jIn.nextLine());
        System.out.println("Digite a nova data do fim da turma:");
        t.setDataFim(jIn.nextLine());
        tControle.atualizar(t);
    }
    
    public List<Turma> listar(){
         return tControle.listar();
    }
    
    public void imprimeTurma(List<Turma> turmas) {
        System.out.println("-------- LISTA DE TURMAS -------- ");
        for (Turma turma : turmas) {
            System.out.println("ID: " + turma.getIdTurma() +"| Nome do curso: "+turma.getCurso()+
            		"| Data de Início da turma: " + turma.getDataInicio() + "| Previsão término da turma: " + turma.getDataFim());
        }

    }
    
    public void excluir(){
        System.out.println("Digite o codigo da turma");
        tControle.excluir(Integer.parseInt(jIn.nextLine()));
    }



}
