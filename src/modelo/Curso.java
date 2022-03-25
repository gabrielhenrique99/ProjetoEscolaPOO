package modelo;

public class Curso {
	
	private String idCurso;
	private String nomeCurso;
	private String cargaHoraria;
	private String turnoCurso;
	private String areaCurso;
	private String instrutorCurso;
	
	public Curso() {
		this.idCurso = "";
		this.nomeCurso = "";
		this.cargaHoraria = "";
		this.turnoCurso = "";
		this.areaCurso = "";
		this.setInstrutorCurso("");
		
	}
	
	public Curso(String idCurso, String nomeCurso, String cargaHoraria, String turnoCurso, String areaCurso, String instrutorCurso) {
		super();
		this.idCurso = idCurso;
		this.nomeCurso = nomeCurso;
		this.cargaHoraria = cargaHoraria;
		this.turnoCurso = turnoCurso;
		this.areaCurso = areaCurso;
		this.setInstrutorCurso(instrutorCurso);
	}
	public String getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(String idCurso) {
		this.idCurso = idCurso;
	}
	public String getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public String getTurnoCurso() {
		return turnoCurso;
	}
	public void setTurnoCurso(String turnoCurso) {
		this.turnoCurso = turnoCurso;
	}
	public String getAreaCurso() {
		return areaCurso;
	}
	public void setAreaCurso(String areaCurso) {
		this.areaCurso = areaCurso;
	}

	public String getInstrutorCurso() {
		return instrutorCurso;
	}

	public void setInstrutorCurso(String instrutorCurso) {
		this.instrutorCurso = instrutorCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}


	
}
