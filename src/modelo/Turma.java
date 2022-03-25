package modelo;

public class Turma {
	
	private String idTurma;
	private String curso;
	private String dataInicio;
	private String dataFim;
	

	public Turma() {
		this.idTurma = "";
		this.curso = "";
		this.dataInicio = "";
		this.dataFim = "";
		
	}
	
	public Turma(String idTurma, String curso, String dataInicio, String dataFim) {
		super();
		this.idTurma = idTurma;
		this.curso = curso;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}


	public String getIdTurma() {
		return idTurma;
	}


	public void setIdTurma(String idTurma) {
		this.idTurma = idTurma;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public String getDataInicio() {
		return dataInicio;
	}


	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}


	public String getDataFim() {
		return dataFim;
	}


	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}
	
	
	
	

}
