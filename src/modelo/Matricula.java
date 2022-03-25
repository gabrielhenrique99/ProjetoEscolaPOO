package modelo;

public class Matricula {
	
	private String idMatricula;
	private String dataMatricula;
	private String aluno;
	private String turma;
	
	public Matricula() {
		this.idMatricula = "";
		this.dataMatricula = "";
		this.aluno = "";
		this.turma = "";
	}
	
	public Matricula(String idMatricula, String dataMatricula, String aluno, String turma) {
		super();
		this.idMatricula = idMatricula;
		this.dataMatricula = dataMatricula;
		this.aluno = aluno;
		this.turma = turma;
	}

	public String getIdMatricula() {
		return idMatricula;
	}

	public void setIdMatricula(String idMatricula) {
		this.idMatricula = idMatricula;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getAluno() {
		return aluno;
	}

	public void setAluno(String aluno) {
		this.aluno = aluno;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	

}
