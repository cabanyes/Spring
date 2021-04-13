package com.openwebinars.lifecycle;

import java.util.List;

// crtl + shift + o para hacer imports automaticamente
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");

		PersonaDAO personaDAO = appContext.getBean(PersonaDAO.class);

		List<Persona> result = personaDAO.findAll();
		for (Persona p : result) {
			p.toString();
		}

		((ClassPathXmlApplicationContext) appContext).close();
		
		result = personaDAO.findAll();
		for (Persona p : result) {
			p.toString();
		}
		;
	}

}
