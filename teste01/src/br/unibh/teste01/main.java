package br.unibh.teste01;

import java.math.BigDecimal;
import java.util.Date;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	aluno a1 = new aluno(14L,"adriana silva","123456","2252",new Date());
	
	System.out.println(a1);
	
	professor prof1 = new professor(15L,"jose humberto","321456", new BigDecimal(100));
	
	System.out.println(prof1);
	
	
	}
	

}
