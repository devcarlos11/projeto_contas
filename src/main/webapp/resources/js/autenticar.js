//executando rotinas do jquery quando a página for aberta
$(document).ready(function() {

	//validação do formulário
	$("#formAutenticar").validate({
		rules: {
			"email": {
				required: true,
				email: true
			},
			"senha": {
				required: true,
				pattern: /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/
			}

		},
		messages: {
			"senha": {
				pattern: "A senha deve ter letras maiúsculas, minúsculas, números, símbolos e pelo menos 8 caracteres."
			}
		}
	});
});	