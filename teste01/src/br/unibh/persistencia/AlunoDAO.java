package br.unibh.persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import br.unibh.teste01.entidades.Aluno;

public class AlunoDAO implements DAO<Aluno, Long> {
	private static SimpleDateFormat  df = new SimpleDateFormat ("yyyy-MM-dd");

	@Override
	public Aluno find(Long id) {
		try {
			PreparedStatement p = JDBCUtil.getConnection().
					prepareStatement("select * from tb_aluno where id =?");

			p.setLong(1, id);
			ResultSet res = p.executeQuery();
			if (res.next()) {
				return new Aluno(
						res.getLong("id"),
						res.getString("nome"),
						res.getString("cpf"),
						res.getString("matricula"), 
						res.getDate("dataAniversario"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		} finally {

			JDBCUtil.closeConnection();

		}

		return null;
	}
	
	public Aluno find(String nome) {
		try {
			PreparedStatement p = JDBCUtil.getConnection().
					prepareStatement("select * from tb_aluno where nome like ?");

			p.setString(1, nome + "%");
			ResultSet res = p.executeQuery();
			if (res.next()) {
				return new Aluno(
						res.getLong("id"),
						res.getString("nome"),
						res.getString("cpf"),
						res.getString("matricula"),
						res.getDate("dataAniversario"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		} finally {

			JDBCUtil.closeConnection();

		}

		return null;
	}


	@Override
	public void insert(Aluno t) {
		try {
			PreparedStatement p = JDBCUtil.getConnection().prepareStatement("insert into tb_aluno"
					+ " (nome, cpf, matricula, dataAniversario)"
					+ " values (?, ?, ?, ?)");

			p.setString(1, t.getNome());
			p.setString(2, t.getCpf());
			p.setString(3, t.getMatricula());
			p.setString(4, df.format(t.getDataAniversario()));
			p.executeUpdate();
			
			} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		} finally {

			JDBCUtil.closeConnection();

		}

	}

	@Override
	public void update(Aluno t) {
		try {
			PreparedStatement p = JDBCUtil.getConnection().prepareStatement(
					"update tb_aluno set nome = ?, cpf = ?,"
					+ " matricula = ?, dataAniversario =  ?"
					+ " where id = ?");

			p.setString(1, t.getNome());
			p.setString(2, t.getCpf());
			p.setString(3, t.getMatricula());
			p.setString(4, df.format(t.getDataAniversario()));
			p.setLong(5,  t.getId());
			p.executeUpdate();
			
			} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		} finally {

			JDBCUtil.closeConnection();

		}

	}

	

	@Override
	public void delete(Aluno t) {
		try {
			PreparedStatement p = JDBCUtil.getConnection().prepareStatement("delete from tb_aluno where id = ?");
			p.setLong(1, t.getId());
			p.executeUpdate();
			
			} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		} finally {

			JDBCUtil.closeConnection();

		}

	}


	@Override
	public List<Aluno> findAll() {
		ArrayList<Aluno> lista = new ArrayList<Aluno>();

		try {

			ResultSet res = JDBCUtil.getConnection().prepareStatement("select * from tb_aluno").executeQuery();

			while (res.next()) {
				lista.add(new Aluno(res.getLong("id"), res.getString("nome"), res.getString("cpf"),
						res.getString("matricula"), res.getDate("dataAniversario"))

				);

			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		} finally {

			JDBCUtil.closeConnection();

		}

		return lista;
	}

}
