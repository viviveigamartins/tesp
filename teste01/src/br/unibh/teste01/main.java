package br.unibh.teste01;

import java.math.BigDecimal;
import java.sql.Connection;
import java.util.Date;

import br.unibh.persistencia.JDBCUtil;
import br.unibh.teste01.entidades.Aluno;
import br.unibh.teste01.entidades.Professor;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Aluno a1 = new Aluno(14L,"adriana silva","123456","2252",new Date());
	
	System.out.println(a1);
	
	Professor prof1 = new Professor(15L,"jose humberto","321456", new BigDecimal(100));
	
	System.out.println(prof1);
	
	try {
		Connection c = JDBCUtil.getConnection();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	}
	

}
