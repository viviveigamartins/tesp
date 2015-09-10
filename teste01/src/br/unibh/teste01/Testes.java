package br.unibh.teste01;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.unibh.persistencia.AlunoDAO;
import br.unibh.persistencia.ProfessorDAO;
import br.unibh.teste01.entidades.Aluno;
import br.unibh.teste01.entidades.Professor;

public class Testes {

	@Test
	public void testeFindAll() {

		AlunoDAO dao = new AlunoDAO();
		List<Aluno> lista = dao.findAll();
		Assert.assertEquals(lista.size(), 101);

	}

	@Test
	public void testeAlunoFind() {

		AlunoDAO dao = new AlunoDAO();
		Aluno a = dao.find(95L);
		Assert.assertEquals(a.getNome(), "Vanna B. Kane");

	}
	
	@Test
	public void AlunoInsertEDelete(){
		
		AlunoDAO dao = new AlunoDAO();
		Aluno a = new Aluno(null, "Aline","12548976358","54896758", new Date()); 
		dao.insert(a);
		Aluno b = dao.find("Aline");
		Assert.assertNotNull(b);
		dao.delete(b);
		Aluno c = dao.find("Aline");
		Assert.assertNull(c);
	}
	@Test
	public void AlunoUpdate(){
		
		AlunoDAO dao = new AlunoDAO();
		Aluno a = new Aluno(null, "Beltrano","22598916358","54896758", new Date()); 
		dao.insert(a);
		Aluno b = dao.find("Beltrano");
		b.setNome("Ciclano");
		dao.update(b);
		Aluno c = dao.find("Ciclano");
		Assert.assertNotNull(c);
		dao.delete(c);
	}
	
	//classe Professor
	
	@Test
	public void testeProfessorFindAll() {

		ProfessorDAO dao = new ProfessorDAO();
		List<Professor> lista = dao.findAll();
		Assert.assertEquals(lista.size(), 100);

	}

	@Test
	public void testeProfessorFind() {

		ProfessorDAO dao = new ProfessorDAO();
		Professor a = dao.find(25L);
		Assert.assertEquals(a.getNome(), "Sonia W. Schneider");

	}
	
	@Test
	public void ProfessorInsertEDelete(){
		
		ProfessorDAO dao = new ProfessorDAO();
		Professor a = new Professor(null, "Pedro","12548976359", new BigDecimal(1254858)); 
		dao.insert(a);
		Professor b = dao.find("Pedro");
		Assert.assertNotNull(b);
		dao.delete(b);
		Professor c = dao.find("Paulo");
		Assert.assertNull(c);
	}
	@Test
	public void ProfessorUpdate(){
		
		ProfessorDAO dao = new ProfessorDAO();
		Professor a = new Professor(null, "Beltrano","22598916358", new BigDecimal(2658974)); 
		dao.insert(a);
		Professor b = dao.find("Beltrano");
		b.setNome("Ciclano");
		dao.update(b);
		Professor c = dao.find("Ciclano");
		Assert.assertNotNull(c);
		dao.delete(c);
	}
	
	

}
