<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Projeto contas</title>

<!-- Referência da folha de estilos CSS do bootstrap -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">


<!-- Folha de estilos CSS local -->
<link href="resources/style.css" rel="stylesheet"/>

</head>
<body class="bg-secondary">

	<div class="row">
		<div class="col-md-4 offset-md-4">
			<div class="card mt-4">
				<div class="card-body">

					<div class="text-center">
						<img src="https://i.vimeocdn.com/portrait/38409031_60x60" />
						<hr />
						<h2>Acesso ao sistema</h2>
						<p>Entre com suas credenciais de acesso:</p>
					</div>

					<form id="formAutenticar">

						<div class="mb-2">
							<label>Email de acesso:</label> <input
							type="text" 
							class="form-control"
							id="email"
							name="email" 
							placeholder="Digite seu email aqui." />
						</div>

						<div class="mb-2">
							<label>Senha de acesso:</label> <input 
							type="password" 
							class="form-control"
							id="senha"
							name="senha"
							placeholder="Digite sua senha aqui." />
						</div>

						<div class="mb-2 d-grid">
							<input type="submit" class="btn btn-primary" value="Entrar" />

						</div>

					</form>

					<div class="mb-2 d-grid">
						<a href="/projeto_contas/criar-usuario" class="btn btn-light">
							Não possui conta ? <strong>Cadastre-se aqui!</strong>
						</a>
					</div>

					<div class="mb-2 d-grid">
						<a href="/projeto_contas/recuperar-senha" class="btn btn-light">
							Esqueceu sua senha? <strong>Clique aqui!</strong>
						</a>
					</div>

				</div>
			</div>
		</div>
	</div>

	<!-- bootstrap JS-->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

<!-- JQuery JS -->
	<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>

	<!-- JQuery Validate JS -->
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.5/jquery.validate.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.5/additional-methods.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.5/localization/messages_pt_BR.min.js"></script>

	<script src="resources/js/autenticar.js"></script>

</body>
</html>
