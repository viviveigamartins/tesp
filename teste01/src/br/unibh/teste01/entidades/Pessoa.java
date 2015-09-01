package br.unibh.teste01.entidades;

public abstract class Pessoa {

	private Long id;
	private String nome;
	private String cpf;
	
	public Pessoa(){}
	
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", noem=" + nome + ", cpf=" + cpf + ", getId()=" + getId() + ", getNoem()="
				+ getNome() + ", getCpf()=" + getCpf() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pessoa(Long id, String noem, String cpf) {
		super();
		this.id = id;
		this.nome = noem;
		this.cpf = cpf;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
