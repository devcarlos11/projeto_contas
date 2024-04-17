package br.com.cotiinformatica.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class AdminAccessInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		// verificando se a página que está sendo acessada no sistema
		// pertence ao diretório /admin
		if (request.getServletPath().contains("/admin/")) {

			// verificando se o usúario não está autenticado
			if (request.getSession().getAttribute("usuario_auth") == null) {

				// redirecionando de volta para a página incial do sistema
				response.sendRedirect("/projeto_contas/");
				return false;
			}

		}

		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub

	}

}
