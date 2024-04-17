
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Projeto contas</title>

<!-- Referência da folha de estilos CSS do bootstrap -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Folha de estilos CSS local -->
<style>
/*formatação para mensagem de erro*/
label.error {
	color: #d9534f;
}
/*formatação para o campo com erro*/
input.error {
	border: 2px solid #d9534f;
}
</style>

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
						<h3>${mensagem_sucesso}</h3>
					</div>

					<div class="text-center text-danger">
						<h3>${mensagem_erro}</h3>
					</div>

					<form id="formCriarUsuario" method="post"
						action="criar-usuario-post">

						<div class="mb-2">
							<label>Nome de usuário:</label> <input type="text"
								class="form-control" id="nome" name="nome"
								placeholder="Digite seu email aqui." />
						</div>

						<div class="mb-2">
							<label>Email de acesso:</label> <input type="text"
								class="form-control" id="email" name="email"
								placeholder="Digite seu email aqui." />
						</div>

						<div class="mb-2">
							<label>Senha de acesso:</label> <input type="password"
								class="form-control" id="senha" name="senha"
								placeholder="Digite sua senha aqui." />
						</div>

						<div class="mb-2">
							<label>Confirme a sua senha:</label> <input type="password"
								class="form-control" id="senhaConfirmacao"
								name="senhaConfirmacao" placeholder="Confirme sua senha aqui." />
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

	<!-- Bootstrap JS-->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

	<!-- JQuery JS -->
	<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>

	<!-- JQuery Validate JS -->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.5/jquery.validate.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.5/additional-methods.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.5/localization/messages_pt_BR.min.js"></script>

	<script src="resources/js/criar-usuario.js"></script>
</body>
</html>
