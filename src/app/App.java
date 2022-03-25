package app;


import modelo.Aluno;
import modelo.Curso;
import modelo.Matricula;
import visao.VisaoAluno;
import visao.VisaoCurso;
import visao.VisaoMatricula;
import modelo.Turma;
import visao.VisaoTurma;
import visao.Main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	
public static void main(String args[]) {
        
    VisaoAluno alunoVisao = new VisaoAluno();
    VisaoCurso cursoVisao = new VisaoCurso();
    VisaoTurma turmaVisao = new VisaoTurma();
    VisaoMatricula matriculaVisao = new VisaoMatricula();
    
    List<Aluno> alunos = new ArrayList<>();
    List<Curso> cursos = new ArrayList<>();
    List<Turma> turmas = new ArrayList<>();
    List<Matricula> matriculas = new ArrayList<>();
    

    Scanner jIn = new Scanner(System.in);
    Integer opcao = null;
    do {
        Main.menu();
        System.out.println("Digite a opção");
        opcao = Integer.parseInt(jIn.nextLine());

        switch (opcao) {
            case 1:
                alunoVisao.salvar();
                break;
            case 2:
            	alunos = alunoVisao.listar();
            	alunoVisao.imprimeAluno(alunos);
            	break;
            case 3:
            	alunoVisao.excluir();
                break;
            case 4:
            	alunoVisao.atualizar();
                break;
            case 5:
            	cursoVisao.salvar();
            	break;
            case 6:
            	cursos = cursoVisao.listar();
            	cursoVisao.imprimeCurso(cursos);
            	break;
            case 7:
            	cursoVisao.excluir();
            	break;
            case 8:
            	cursoVisao.atualizar();
            	break;
            case 9:
            	turmaVisao.salvar();
            	break;
            case 10:
            	turmas = turmaVisao.listar();
            	turmaVisao.imprimeTurma(turmas);
            	break;
            case 11:
            	turmaVisao.excluir();
            	break;
            case 12:
            	turmaVisao.atualizar();
            	break;
            case 13:
            	matriculaVisao.salvar();
            	break;
            case 14:
            	matriculas = matriculaVisao.listar();
            	matriculaVisao.imprimeMatricula(matriculas);
            	break;
            case 15:
            	matriculaVisao.excluir();
            	break;
            case 16:
            	matriculaVisao.atualizar();
            	break;
        }

    } while (opcao != 0);
} 
}
