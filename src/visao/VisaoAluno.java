package visao;

import Controle.ControleAluno;
import modelo.Aluno;

import java.util.List;
import java.util.Scanner;

public class VisaoAluno {
	
	private Scanner jIn;
    private ControleAluno aControle;

    public VisaoAluno() {
        this.jIn = new Scanner(System.in);
        this.aControle = new ControleAluno();
    }

    public Aluno salvar() {
    	System.out.println("Digite o número de matricula do aluno:");
        String numeroMatricula = this.jIn.nextLine();
        System.out.println("Digite o nome do aluno:");
        String nomePessoa = this.jIn.nextLine();
        System.out.println("Digite a data de nascimento do aluno: ");
        String dtNascimentoPessoa = this.jIn.nextLine();
        System.out.println("Digite o CPF do aluno: ");
        String cpfPessoa = this.jIn.nextLine();
        System.out.println("Digite o seu DDD");
        String dddPessoa = this.jIn.nextLine();
        System.out.println("Digite o telefone do aluno: ");
        String telefonePessoa = this.jIn.nextLine();
        System.out.println("Digite o Email do aluno: ");
        String emailPessoa = this.jIn.nextLine();
        System.out.println("Digite o endereço do aluno");
        String enderecoPessoa = this.jIn.nextLine();
        System.out.println("Digite a cidade do aluno: ");
        String cidadePessoa = this.jIn.nextLine();
        System.out.println("Digite o estado do aluno (Somente a abreviatura)");
        String estadoPessoa = this.jIn.nextLine();
       
        
        return this.aControle.salvar(numeroMatricula,nomePessoa,dtNascimentoPessoa,cpfPessoa,
        		dddPessoa,telefonePessoa,emailPessoa,enderecoPessoa,cidadePessoa,estadoPessoa);
    }

    public void atualizar() {
        Aluno a = new Aluno();
        System.out.println("Digite o codigo do aluno:");
        a.setIdPessoa(this.jIn.nextLine());
        System.out.println("Digite o novo nome do aluno:");
        a.setNomePessoa(jIn.nextLine());
        aControle.atualizar(a);
    }
    
    public List<Aluno> listar(){
         return aControle.listar();
    }
    
    public void imprimeAluno(List<Aluno> alunos) {
        System.out.println("-------- LISTA DE ALUNOS -------- ");
        for (Aluno aluno : alunos) {
            System.out.println("ID: " + aluno.getIdPessoa() +"| Data de Nascimento: "+aluno.getDtNascimentoPessoa() + " | Nome: " + aluno.getNomePessoa() + 
                    "| CPF " + aluno.getCpfPessoa() + "| Email: " + aluno.getEmailPessoa() + 
                    "| Telefone: (" + aluno.getDddPessoa()+ ") " +aluno.getTelefonePessoa()+
                    "| Endereço: " + aluno.getEnderecoPessoa()+"| Cidade: "+ aluno.getEnderecoPessoa()+"| Estado: "+aluno.getEstadoPessoa()+"| Matrícula " + aluno.getNumeroMatricula());
        }

    }
    
    public void excluir(){
        System.out.println("Digite o codigo do aluno");
        aControle.excluir(Integer.parseInt(jIn.nextLine()));
    }

}


