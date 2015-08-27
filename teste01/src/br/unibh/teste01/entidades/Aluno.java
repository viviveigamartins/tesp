package br.unibh.teste01.entidades;

import java.util.Date;

public class Aluno extends Pessoa {
	private String matricula;
	private Date dataAniversario;
	
	//construtor entra entre a classe e o get e setting
	
	public Aluno(){}	
	
	public Aluno(String matricula, Date dataAniversario) {
		super();
		this.matricula = matricula;
		this.dataAniversario = dataAniversario;
	}
		
	
	public Aluno(Long id, String noem, String cpf, String matricula, Date dataAniversario) {
		super(id, noem, cpf);
		this.matricula = matricula;
		this.dataAniversario = dataAniversario;
	}
	
	

	//getter e setter
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Date getDataAniversario() {
		return dataAniversario;
	}
	public void setDataAniversario(Date dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	// metodo toString
	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", dataAniversario=" + dataAniversario + ", toString()="
				+ super.toString() + "]";
	}

	
	
	

}
