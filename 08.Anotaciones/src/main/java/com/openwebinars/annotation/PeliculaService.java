package com.openwebinars.annotation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class PeliculaService {
	//@Autowired
	private PeliculaDao peliculaDao;
	
	public PeliculaService() {
		
	}
	
	//@Autowired
	public PeliculaService(PeliculaDao peliculaDao) {
		System.out.println("autowired via constructor");
		this.peliculaDao = peliculaDao;
	}
	
	@Autowired
	public void setPeliculaDao(PeliculaDao peliculaDao) {
		System.out.println("autowired via setter");
		this.peliculaDao = peliculaDao;
	}
	
	public List<Pelicula> pelisPorGenero(String genero){
		return peliculaDao
				.findAll()
				.stream()
				.filter(p -> p.getGenero().equalsIgnoreCase(genero))
				.collect(Collectors.toCollection(ArrayList::new));
	}

}
