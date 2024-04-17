package br.com.cotiinformatica.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.cotiinformatica.entities.Usuario;
import br.com.cotiinformatica.helpers.EncryptHelper;
import br.com.cotiinformatica.repositories.UsuarioRepository;

@Controller
public class AutenticarController {

	// definindo a rota para abrir a página no navegador
	@RequestMapping(value = "/") // página raiz (inicial) do projeto
	public ModelAndView autenticar() {

		// definindo qual página será aberta no navegador:
		// WEB-INF/views/autenticar.jsp
		ModelAndView modelAndView = new ModelAndView("autenticar");
		return modelAndView;
	}

	// mapeamento para que o método possa receber a requisição POST
	// do formulário para o action /autenticar-post
	@RequestMapping(value = "/autenticar-post", method = RequestMethod.POST)
	public ModelAndView autenticarPost(HttpServletRequest request) {

		ModelAndView modelAndView = new ModelAndView("autenticar");

		try {

			// resgatar o email e senha enviados pelo formulário
			String email = request.getParameter("email");
			String senha = EncryptHelper.encryptToSHA1(request.getParameter("senha"));

			// buscando o usuário no banco de dados através do email e da senha
			UsuarioRepository usuarioRepository = new UsuarioRepository();
			Usuario usuario = usuarioRepository.find(email, senha);

			// verificar se o usuário foi encontrado
			if (usuario != null) {

				// gravar os dados do usúario em seção
				request.getSession().setAttribute("usuario_auth", usuario);

				// redirecionar para a página pincipal da área restrita
				modelAndView.setViewName("redirect:/admin/dashboard");

			} else {
				throw new Exception("Acesso negado. Usuário inválido.");
			}
		} catch (Exception e) {
			modelAndView.addObject("mensagem_erro", e.getMessage());
		}
		return modelAndView;
	}

	/*
	 * Método para fazer o logout do usúario . Este método deverá capturar a rota
	 * /logout disparada pelo sitema.
	 */
	@RequestMapping(value = "/logout")
	public ModelAndView logout(HttpServletRequest request) {
		// apagar os dados do usúario gravados em seção
		request.getSession().removeAttribute("usuario_auth");

		// redirecionando para a página inicial do sistema
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("redirect:/"); // raiz do projeto

		return modelAndView;

	}

}
