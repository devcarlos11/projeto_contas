<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Cadastro de Contas</title>

<!-- Referência da folha de estilos CSS do bootstrap -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
	
	<!-- Folha de estilos CSS local -->
<link href="../resources/style.css" rel="stylesheet" />

</head>
<body>

	<!-- menu navbar -->
	<jsp:include page="/WEB-INF/views/admin/components/navbar.jsp"></jsp:include>


	<div class="container mt-3">
		<h4>Cadastro de Contas</h4>
			<p>Preencha os campos abaixo para incluir uma conta a pagar ou a receber.</p>
		<hr/>
		
		<div class="text-success mb-2">
			<h5>${mensagem_sucesso}</h5>
		</div>

		<div class="text-danger mb-2">
			<h5>${mensagem_erro}</h5>
		</div>

		<form id="formCadastro" method="post" action="cadastro-contas-post">

			<div class="row md-2">
				<div class="col-md-6">
					<label>Nome da conta:</label> <input type="text"
						class="form-control" id="nome" name="nome"
						placeholder="Digite o nome da conta aqui." />
				</div>
				<div class="col-md-3">
					<label>Data da conta:</label> <input type="date"
						class="form-control" id="data" name="data" />

				</div>
				<div class="col-md-3">
					<label>Valor da conta:</label> <input type="text"
						class="form-control" id="valor" name="valor"
						placeholder="Digite o valor aqui." />

				</div>
			</div>


			<div class="row mb-2">
				<div class="col-md-9">
					<label>Descrição da conta:</label>
					<textarea class="form-control"
					 id="descricao" name="descricao"
					 placeholder="Digite a descrição aqui."></textarea>
				</div>
				<div class="col-md-3">
					<label>Tipo da conta:</label> 
					<select class="form-select" id="tipo" name="tipo">
						<option value="">Escolha uma opção</option>
						<option value="1">Conta a receber</option>
						<option value="2">Conta a pagar</option>
					</select>
				</div>
			</div>

			<div class="row mb-2">
				<div class="col-md-12">
					<input type="submit" class="btn btn-success"
						value="Realizar cadastro" /> 
						<a href="/projeto contas/admin/consulta-contas" class="btn btn-ligth">
							Ir para a consulta
						</a>
				</div>
			</div>

		</form>
	</div>
	
	<!-- bootstrap JS-->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

	<!-- JQuery JS -->
	<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>

	<!-- JQuery Validate JS -->
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.5/jquery.validate.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.5/additional-methods.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.5/localization/messages_pt_BR.min.js"></script>
	
	<!-- Arquivo JS local -->
	<script src="../resources/js/cadastro-contas.js"></script>
	
	
</body>
</html>