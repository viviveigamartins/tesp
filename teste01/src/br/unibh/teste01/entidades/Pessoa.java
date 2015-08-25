package br.unibh.teste01.entidades;

public abstract class Pessoa {

	private Long id;
	private String noem;
	private String cpf;
	
	public Pessoa(){}
	
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", noem=" + noem + ", cpf=" + cpf + ", getId()=" + getId() + ", getNoem()="
				+ getNoem() + ", getCpf()=" + getCpf() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNoem() {
		return noem;
	}
	public void setNoem(String noem) {
		this.noem = noem;
	}
	public Pessoa(Long id, String noem, String cpf) {
		super();
		this.id = id;
		this.noem = noem;
		this.cpf = cpf;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
