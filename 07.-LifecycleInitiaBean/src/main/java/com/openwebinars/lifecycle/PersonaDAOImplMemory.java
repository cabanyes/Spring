package com.openwebinars.lifecycle;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class PersonaDAOImplMemory implements PersonaDAO, InitializingBean, DisposableBean{

	List<Persona> personas = new ArrayList<Persona>();
	
	public Persona findByIndex(int index) {
		return personas.get(index);
	}

	public List<Persona> findAll() {
		return personas;
	}

	public void insert(Persona persona) {
		personas.add(persona);
		
	}

	public void edit(int index, Persona persona) {
		personas.remove(index);
		personas.add(index, persona);
	}

	public void delete(int index) {
		personas.remove(index);
		
	}

	public void delete(Persona persona) {
		personas.remove(persona);
		
	}

	public void afterPropertiesSet() throws Exception {
		insert(new Persona("luis",35));
		insert(new Persona("ana",32));
		insert(new Persona("pepe",34));
		insert(new Persona("julia",39));
	}
	
	public void destroy() throws Exception {
		System.out.println("Limpiando el primer dato de la lista");
		personas.remove(0);
	}
	//via xml, hay que referenciarlo en el beans.xml con init-method="init" y quitar del implements
	//de la declaracion de la clase, InitializingBean
	public void init() throws Exception {
		System.out.println("via xml");
		insert(new Persona("luis",35));
		insert(new Persona("ana",32));
		insert(new Persona("pepe",34));
		insert(new Persona("julia",39));
	}
	
	

}
