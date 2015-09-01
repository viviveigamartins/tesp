package br.unibh.persistencia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.unibh.teste01.entidades.Aluno;

public class AlunoDAO implements DAO<Aluno,Long> {
	private static Connection con = null;

	@Override
	public Aluno find(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Aluno t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Aluno t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Aluno t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Aluno> findAll() {
		ArrayList<Aluno> lista = new ArrayList<Aluno>();
		
		
		try {
			
			
			ResultSet res = JDBCUtil.getConnection().
					prepareStatement("select * from tb_aluno").executeQuery();
			
			while (res.next()){
				lista.add(
						new Aluno(
								res.getLong("id"),
								res.getString("noem"),
								res.getString("cpf"),
								res.getString("matricula"),
								res.getDate("dataAniversario"))
								
						);
								
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		} finally{
			
						
				JDBCUtil.closeConnection();
			
			}
		
		return lista;
	}
	

}
