package br.com.cotiinformatica.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.cotiinformatica.entities.Conta;
import br.com.cotiinformatica.factories.ConnectionFactory;

public class ContaRepository {

	public void create(Conta conta) throws Exception {

		Connection connection = ConnectionFactory.getConnection();

		String query = "insert into conta(nome, data, valor, tipo, descricao, idusuario) values (?,?,?,?,?,?)";

		PreparedStatement statement = connection.prepareStatement(query);
		statement.setString(1, conta.getNome());
		statement.setDate(2, new java.sql.Date(conta.getData().getTime()));
		statement.setDouble(3, conta.getValor());
		statement.setInt(4, conta.getTipo());
		statement.setString(5, conta.getDescricao());
		statement.setInt(6, conta.getIdUsuario());
		statement.execute();

		connection.close();
	}

	public void update(Conta conta) throws Exception {

		Connection connection = ConnectionFactory.getConnection();

		String query = "update conta set nome=?, data=?, valor=?, tipo=?, descricao=? where idconta=?";

		PreparedStatement statement = connection.prepareStatement(query);
		statement.setString(1, conta.getNome());
		statement.setDate(2, new java.sql.Date(conta.getData().getTime()));
		statement.setDouble(3, conta.getValor());
		statement.setInt(4, conta.getTipo());
		statement.setString(5, conta.getDescricao());
		statement.setInt(6, conta.getIdConta());
		statement.execute();

		connection.close();

	}

	public void delete(Conta conta) throws Exception {

		Connection connection = ConnectionFactory.getConnection();

		String query = "delete from cointa where idconta=?";

		PreparedStatement statement = connection.prepareStatement(query);
		statement.setInt(1, conta.getIdConta());
		statement.execute();

		connection.close();

	}

	public List<Conta> findByDatas(Date dataMin, Date dataMax, Integer idUsuario) throws Exception {

		Connection connection = ConnectionFactory.getConnection();

		String query = "select * from conta where data between ? and ? idusuario=? order by data desc";

		PreparedStatement statement = connection.prepareStatement(query);
		statement.setDate(1, new java.sql.Date(dataMin.getTime()));
		statement.setDate(2, new java.sql.Date(dataMax.getTime()));
		ResultSet resultSet = statement.executeQuery();

		List<Conta> lista = new ArrayList<Conta>();

		while (resultSet.next()) {

			Conta conta = new Conta();

			conta.setIdConta(resultSet.getInt("idconta"));
			conta.setNome(resultSet.getString("nome"));
			conta.setData(new SimpleDateFormat("yyyy-MM-dd").parse(resultSet.getString("data")));
			conta.setValor(resultSet.getDouble("valor"));
			conta.setTipo(resultSet.getInt("tipo"));
			conta.setDescricao(resultSet.getString("descricao"));
			conta.setIdConta(resultSet.getInt("idusuario"));

			lista.add(conta);

		}

		connection.close();
		return null;
	}

	public Conta findById(Integer idConta) throws Exception {
		
		Connection connection = ConnectionFactory.getConnection();
		
		String query = " select * from conta where idconta=?";
		
		PreparedStatement statement = connection.prepareStatement(query);
		statement.setInt(1, idConta);
		ResultSet resultSet = statement.executeQuery();
		
		Conta conta = null;
		
		if (resultSet.next()) {
			
			conta = new Conta ();
			
			conta.setIdConta(resultSet.getInt("idconta"));
			conta.setNome(resultSet.getString("nome"));
			conta.setData(new SimpleDateFormat("yyyy-MM-dd").parse(resultSet.getString("data")));
			conta.setValor(resultSet.getDouble("valor"));
			conta.setTipo(resultSet.getInt("tipo"));
			conta.setDescricao(resultSet.getString("descricao"));
			conta.setIdConta(resultSet.getInt("idusuario"));
			
			
		}
		
		connection.close();
		return null;

	}

}