package br.unibh.escola.entidades;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Size;

/**
 * Classe concreta de professor
 * @author 11320835
 * @version 1.0
 */

	@Entity
	@PrimaryKeyJoinColumn
	@Table(name ="TB_PROFESSOR",uniqueConstraints = @UniqueConstraint(columnNames ="salario"))
	@NamedQueries({	
		@NamedQuery(name="Professor.findByName", query = "select a from Professor a where a.nome like :nome")
		})
	

public class Professor extends Pessoa {
	
	
	//variavel de instancia 
	@DecimalMin("500")
	@DecimalMax("100000")
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
