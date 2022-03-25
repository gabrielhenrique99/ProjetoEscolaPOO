package modelo;

public class Pessoa {
	private String idPessoa;
    private String nomePessoa;
    private String dtNascimentoPessoa;
    private String cpfPessoa;
    private String dddPessoa;
    private String telefonePessoa;
    private String emailPessoa;
    private String enderecoPessoa;
    private String cidadePessoa;
    private String estadoPessoa;
    
    public Pessoa() {
        this.nomePessoa = "";
        this.dtNascimentoPessoa = "";
        this.cpfPessoa = "";
        this.dddPessoa = "";
        this.telefonePessoa = "";
        this.emailPessoa = "";
        this.enderecoPessoa = "";
        this.cidadePessoa = "";
        this.estadoPessoa = "";
        this.idPessoa = "";
    }
    
	public Pessoa(String idPessoa, String nomePessoa, String dtNascimentoPessoa, String cpfPessoa, String dddPessoa,
			String telefonePessoa, String emailPessoa, String enderecoPessoa, String cidadePessoa,
			String estadoPessoa) {
		this.idPessoa = idPessoa;
		this.nomePessoa = nomePessoa;
		this.dtNascimentoPessoa = dtNascimentoPessoa;
		this.cpfPessoa = cpfPessoa;
		this.dddPessoa = dddPessoa;
		this.telefonePessoa = telefonePessoa;
		this.emailPessoa = emailPessoa;
		this.enderecoPessoa = enderecoPessoa;
		this.cidadePessoa = cidadePessoa;
		this.estadoPessoa = estadoPessoa;
	}

	public String getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(String idPessoa) {
		this.idPessoa = idPessoa;
	}
	public String getNomePessoa() {
		return nomePessoa;
	}
	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	public String getDtNascimentoPessoa() {
		return dtNascimentoPessoa;
	}
	public void setDtNascimentoPessoa(String dtNascimentoPessoa) {
		this.dtNascimentoPessoa = dtNascimentoPessoa;
	}
	public String getCpfPessoa() {
		return cpfPessoa;
	}
	public void setCpfPessoa(String cpfPessoa) {
		this.cpfPessoa = cpfPessoa;
	}
	public String getDddPessoa() {
		return dddPessoa;
	}
	public void setDddPessoa(String dddPessoa) {
		this.dddPessoa = dddPessoa;
	}
	public String getTelefonePessoa() {
		return telefonePessoa;
	}
	public void setTelefonePessoa(String telefonePessoa) {
		this.telefonePessoa = telefonePessoa;
	}
	public String getEmailPessoa() {
		return emailPessoa;
	}
	public void setEmailPessoa(String emailPessoa) {
		this.emailPessoa = emailPessoa;
	}
	public String getEnderecoPessoa() {
		return enderecoPessoa;
	}
	public void setEnderecoPessoa(String enderecoPessoa) {
		this.enderecoPessoa = enderecoPessoa;
	}
	public String getCidadePessoa() {
		return cidadePessoa;
	}
	public void setCidadePessoa(String cidadePessoa) {
		this.cidadePessoa = cidadePessoa;
	}
	public String getEstadoPessoa() {
		return estadoPessoa;
	}
	public void setEstadoPessoa(String estadoPessoa) {
		this.estadoPessoa = estadoPessoa;
	}
    
    

}