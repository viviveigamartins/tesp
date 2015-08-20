package br.unibh.teste01;

import java.math.BigDecimal;

/**
 * Classe concreta de professor
 * @author 11320835
 * @version 1.0
 */

public class professor extends Pessoa {
	
	
	//variavel de instancia 
	
	private BigDecimal salario;
	
	//construtor entra entre a classe e o get e setting
	
	/**
	 * construtor padrão
	 */
	
	public professor(){}	

	public professor(BigDecimal salario) {
		super();
		this.salario = salario;
	}
	
	
	public professor(Long id, String noem, String cpf, BigDecimal salario) {
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
