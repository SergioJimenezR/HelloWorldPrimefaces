package com.sergiojimenez.backbeans;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WelcomePageRedirect implements WebMvcConfigurer {

	private static final String PAGINA_INICIO = "index.xhtml";

	/**
	 * Redirección de la página inicial.
	 */
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("forward:/" + PAGINA_INICIO);
		registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
	}
}