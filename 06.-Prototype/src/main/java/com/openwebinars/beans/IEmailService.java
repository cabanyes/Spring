package com.openwebinars.beans;

public interface IEmailService {
	
	public void enviarEmailSaludo(String str);

	public void setDestinatarioPorDefecto(String string);
	
	public void enviarEmailSaludo();
}
