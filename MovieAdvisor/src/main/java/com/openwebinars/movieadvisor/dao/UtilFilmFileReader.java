package com.openwebinars.movieadvisor.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.util.ResourceUtils;

import com.openwebinars.movieadvisor.model.Film;

public class UtilFilmFileReader {
	public static List<Film> readFile(final String path, final String separator, final String listSeparator) {
		List<Film> result = new ArrayList<>();
		System.out.println("separator es " + separator);
		System.out.println("list separator es " + listSeparator);
		//@formatter:off
		
		try {
			// @formatter:off
			result = Files
						.lines(Paths.get(ResourceUtils.getFile(path).toURI()))
						.skip(1)
						.map(line -> {
							//System.out.println("line es " + line);
							String[] values = line.split(separator);
							
							//System.out.println("values es " + values[0]);
							
							
							
							
							
							return new Film(Long.parseLong(values[0]), values[1], values[2],
											Arrays.asList(values[3].split(listSeparator)));
					}).collect(Collectors.toList());
 			// @formatter:on


		} catch (Exception e) {
			System.err.println("Error de lectura del fichero de datos: imdb_data");
			System.exit(-1);
		}

		return result;

	}
		
	

}
