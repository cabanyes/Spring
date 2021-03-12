package com.openwebinars.beans;

// crtl + shift + o para hacer imports automaticamente
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");

		Saludator saludador = null;

		saludador = appContext.getBean(Saludator.class);

		System.out.println(saludador.saludo() + "\n\n");

		// refereniando un bean mediante una interface
		IEmailService emailService; // = null en el ejemplo del video
		emailService = appContext.getBean(IEmailService.class);
		emailService.enviarEmailSaludo("jfmora@audifilm.com");

		((ClassPathXmlApplicationContext) appContext).close();

	}

}
