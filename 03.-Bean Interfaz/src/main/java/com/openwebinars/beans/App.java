package com.openwebinars.beans;

// crtl + shift + o para hacer imports automaticamente
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
		
		Saludator saludador = null;
		
	
		
		//refereniando un bean mediante una clase
		EmailService emailService = appContext.getBean(EmailService.class);
		emailService.enviarEmailSaludo("jfmora@audifilm.com");
		
		//refereniando un bean mediante una interface
		IEmailService emailService2; // = null en el ejemplo del video
		emailService2 =appContext.getBean(IEmailService.class);
		emailService2.enviarEmailSaludo("jfmora@audifilm.com");
		
		((ClassPathXmlApplicationContext) appContext).close();
	}

}
