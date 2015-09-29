package br.unibh.escola.entidades;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 * Classe concreta de professor
 * @author 11320835
 * @version 1.0
 */

	@Entity
	@Table(name ="TB_PROFESSOR")
	

public class Professor extends Pessoa {
	
	
	//variavel de instancia 
	@Size(min=500,max=100000)
	@Column(nullable=true, columnDefinition="DECIMAL(14,2)")
	
	private BigDecimal salario;	
	
	public static Double BONUS =0.1D;
	
	//construtor entra entre a classe e o get e setting
	
	/**
	 * construtor padr�o
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