package com.openwebinars.annotation;

import java.util.List;

// crtl + shift + o para hacer imports automaticamente
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");

		PeliculaService peliculaService = appContext.getBean(PeliculaService.class);
		
		List<Pelicula>  result= peliculaService.pelisPorGenero("acción");

		
		for (Pelicula p : result) {
			p.toString();
		}

		((ClassPathXmlApplicationContext) appContext).close();
		
		}

}
