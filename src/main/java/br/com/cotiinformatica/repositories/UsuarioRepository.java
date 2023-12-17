package br.com.cotiinformatica.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;

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

}
