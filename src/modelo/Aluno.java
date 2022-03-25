package modelo;

public class Aluno extends Pessoa {

    private String numeroMatricula;


    public String getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(String numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	
	public Aluno() {
		this.numeroMatricula = "";
	}

	public Aluno(String numeroMatricula) {
		super();
		this.numeroMatricula = numeroMatricula;
	}

}
