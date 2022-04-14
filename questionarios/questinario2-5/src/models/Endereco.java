package models;

public class Endereco {
	private String cep;
	private String rua;
	private String bairro;
	
	public Endereco(String cep, String rua, String bairro) {
		this.cep = cep;
		this.rua = rua;
		this.bairro = bairro;
	}
	
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
	
}
