package fr.epita.web.controllers;
/**
 * @author bharath
 *
 */
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.support.SpringBeanAutowiringSupport;

/**
 * Servlet implementation class AbstractSpringServlet
 */
@SuppressWarnings("serial")
public class AbstractSpringServlet extends HttpServlet {
	@Override
	public void init() throws ServletException {

		SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
	}
}
