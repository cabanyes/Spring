package com.openwebinars.annotation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PeliculaDaoImplMemory implements PeliculaDao {

	private List<Pelicula>  peliculas = new ArrayList<>();
	public Pelicula findById(int id) {
		return peliculas.get(id);
	}

	public Collection<Pelicula> findAll() {
		return peliculas;
	}

	public void insert(Pelicula pelicula) {
		peliculas.add(pelicula);
		
	}

	public void edit(Pelicula antigua, Pelicula nueva) {
		peliculas.add(antigua);
		peliculas.remove(nueva);
		
	}

	public void delete(Pelicula pelicula) {
		peliculas.remove(pelicula);
		
	}
	
	public void init() {
		
		insert(new Pelicula("la guerra de las galaxias", "1977", "ciencia-ficci�n"));
		insert(new Pelicula("E.T.", "1985", "ciencia-ficci�n"));
		insert(new Pelicula("el padrino", "1978", "acci�n"));
		insert(new Pelicula("regreso al futuro", "1999", "ciencia-ficci�n"));
		insert(new Pelicula("tiburon", "1986", "acci�n"));
		
	}

}
