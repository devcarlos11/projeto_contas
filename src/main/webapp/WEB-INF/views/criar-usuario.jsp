<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Projeto contas</title>

<!-- Referência da folha de estilos CSS do bootstrap -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">

</head>
<body class="bg-secondary">

	<div class="row">
		<div class="col-md-4 offset-md-4">
			<div class="card mt-4">
				<div class="card-body">

					<div class="text-center">
						<img src="https://i.vimeocdn.com/portrait/38409031_60x60" />
						<hr />
						<h2>Criar conta de usuário</h2>
						<p>Preencha seus dados pra criar uma conta:</p>
					</div>

					<div class="text-center text-success">
						<strong>${mensagem_sucesso}</strong>
					</div>

					<div class="text-center text-danger">
						<strong>${mensagem_erro}</strong>
					</div>

					<form method="post" action="criar-usuario-post">

						<div class="mb-2">
							<label>Nome de usuário:</label> <input 
								type="text"
								class="form-control" 
								name="nome"
								placeholder="Digite seu email aqui." />
						</div>

						<div class="mb-2">
							<label>Email de acesso:</label> <input 
								type="text"
								class="form-control" 
								name="email"
								placeholder="Digite seu email aqui." />
						</div>

						<div class="mb-2">
							<label>Senha de acesso:</label> <input 
								type="password"
								class="form-control" 
								name="senha"
								placeholder="Digite sua senha aqui." />
						</div>

						<div class="mb-2 d-grid">
							<input type="submit" class="btn btn-primary"
								value="Realizar cadastro" />

						</div>

					</form>

					<div class="mb-2 d-grid">
						<a href="/projeto_contas/" class="btn btn-light"> Voltar </a>
					</div>

				</div>
			</div>
		</div>
	</div>

	<!-- Referência do arquivo JS dp bootstrap-->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
