package br.com.cotiinformatica.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.cotiinformatica.entities.Usuario;
import br.com.cotiinformatica.factories.ConnectionFactory;

public class UsuarioRepository {

	/*
	 * método para gravar os dados de um usuário na tabela do banco de dados do
	 * PostGreSQL
	 */
	public void create(Usuario usuario) throws Exception {

		// abrir conexão com banco de dados
		Connection connection = ConnectionFactory.getConnection();

		// escrevendo a query SQL que será executado no banco de dados
		String query = "insert into usuario(nome, email, senha) values (?,?,?)";

		// exceutando a query no banco de dados e passar os parametros
		PreparedStatement statement = connection.prepareStatement(query);
		statement.setString(1, usuario.getNome());
		statement.setString(2, usuario.getEmail());
		statement.setString(3, usuario.getSenha());
		statement.execute();

		// fechando conexão com o banco de dados
		statement.close();

	}

	/*
	 * método para consultar 1 usuário no banco de dados através do email informado
	 */

	public Usuario find(String email) throws Exception {

		// abrindo conexão com o banco de dados
		Connection connection = ConnectionFactory.getConnection();

		// escrevendo a query SQL que será executado no banco de dados
		String query = "select * from usuario where email = ?";

		// executando a query no banco de dados e passar os parametros
		PreparedStatement statement = connection.prepareStatement(query);
		statement.setString(1, email);
		ResultSet resultSet = statement.executeQuery();

		Usuario usuario = null;

		// verificando se algum registro foi obtido do banco
		if (resultSet.next()) {

			usuario = new Usuario(); // instanciando
			usuario.setIdUsuario(resultSet.getInt("idusuario"));
			usuario.setNome(resultSet.getString("nome"));
			usuario.setEmail(resultSet.getString("email"));

		}

		// fechando a conexão
		connection.close();
		// retornado o usuário
		return usuario;

	}

}
