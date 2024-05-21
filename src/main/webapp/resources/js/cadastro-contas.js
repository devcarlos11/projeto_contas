$(document).ready(function(){
	
	//validação do formulário
	$("#formCadastro").validate({
		rules: {
			"nome": {
				required: true,
				minlegth:8,
				maxlength:100
			},
			"data": {
				required: true
			},
			"valor": {
				required: true,
				min:1
			},
			"tipo":{
				required: true
			},
			"descricao":{
				required: true,
				minlegth:8,
				maxlength:500
			}
		},
	});
})	