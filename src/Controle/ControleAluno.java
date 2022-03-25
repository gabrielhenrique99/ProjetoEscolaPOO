package Controle;


import dao.DaoFactory;
import modelo.Aluno;
import java.util.List;

public class ControleAluno {
	
	public Aluno salvar(String numeroMatricula, String nomePessoa,
			String dtNascimentoPessoa, String cpfPessoa, 
			String dddPessoa, String telefonePessoa, String emailPessoa,
			String enderecoPessoa, String cidadePessoa, String estadoPessoa){
		Aluno aluno = new Aluno();
		aluno.setNumeroMatricula(numeroMatricula);
        aluno.setNomePessoa(nomePessoa);
        aluno.setDtNascimentoPessoa(dtNascimentoPessoa);
        aluno.setCpfPessoa(cpfPessoa);
        aluno.setDddPessoa(dddPessoa);
        aluno.setTelefonePessoa(telefonePessoa);
        aluno.setEmailPessoa(emailPessoa);
        aluno.setEnderecoPessoa(enderecoPessoa);
        aluno.setCidadePessoa(cidadePessoa);
        aluno.setEstadoPessoa(estadoPessoa);
        
        
        aluno.setIdPessoa(DaoFactory.getAlunoDao().salvar(aluno));
        
        return aluno;
    }
    
    public void atualizar(Aluno aluno){
        DaoFactory.getAlunoDao().atualizar(aluno);          
    }
    
    public List<Aluno> listar(){
         return DaoFactory.getAlunoDao().listar();
    }
    
    public void excluir(Integer id){
        DaoFactory.getAlunoDao().excluir(id);
    }

}
