package br.unibh.teste01;

import java.math.BigDecimal;
import java.sql.Connection;
import java.util.Date;
import java.util.List;

import br.unibh.persistencia.AlunoDAO;
import br.unibh.persistencia.JDBCUtil;
import br.unibh.teste01.entidades.Aluno;
import br.unibh.teste01.entidades.Professor;

public class main {

	public static void main(String[] args) {
		
		AlunoDAO dao = new AlunoDAO();
		List<Aluno> Lista = dao.findAll();
		for(Aluno a:Lista){
			System.out.println(a);
			
		}
		// TODO Auto-generated method stub

		
	
	try {
		Connection c = JDBCUtil.getConnection();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	}
	

}
