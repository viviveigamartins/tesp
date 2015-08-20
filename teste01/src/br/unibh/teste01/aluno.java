package br.unibh.teste01;

import java.util.Date;

public class aluno extends Pessoa {
	private String matricula;
	private Date dataAniversario;
	
	//construtor entra entre a classe e o get e setting
	
	public aluno(){}	
	
	public aluno(String matricula, Date dataAniversario) {
		super();
		this.matricula = matricula;
		this.dataAniversario = dataAniversario;
	}
		
	
	public aluno(Long id, String noem, String cpf, String matricula, Date dataAniversario) {
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
		return "aluno [matricula=" + matricula + ", dataAniversario=" + dataAniversario + "]";
	}
	
	

}
