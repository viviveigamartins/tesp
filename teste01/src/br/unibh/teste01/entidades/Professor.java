package br.unibh.teste01.entidades;

import java.math.BigDecimal;

/**
 * Classe concreta de professor
 * @author 11320835
 * @version 1.0
 */

public class Professor extends Pessoa {
	
	
	//variavel de instancia 
	
	private BigDecimal salario;
	public static Double BONUS =0.1D;
	
	//construtor entra entre a classe e o get e setting
	
	/**
	 * construtor padrão
	 */
	
	public Professor(){}	

	public Professor(BigDecimal salario) {
		super();
		this.salario = salario;
	}
	
	
	public Professor(Long id, String noem, String cpf, BigDecimal salario) {
		super(id, noem, cpf);
		this.salario = salario;
	}
	
	

	//getter e setter
	
	@Override
	public String toString() {
		return "professor [salario=" + salario + ", toString()=" + super.toString() + "]";
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	
	
	

}
