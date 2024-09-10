package org.ip.tema03.ejerciciosresueltos;

public class TestPublicaciones {

	public static int numeroPrestados(Object [] array) {
		int contador = 0;
		for (int i = 0; i < array.length; i++) {
			if ((array[i] instanceof Libro) && ((Libro)array[i]).isPrestado())
				contador++;
		}
		return contador;
	}

	public static int publicacionesAnterioresA(Publicacion [] arrayPublicaciones, int anio) {
		int contador = 0;
		for (int i = 0; i < arrayPublicaciones.length; i++) {
			if ((arrayPublicaciones[i] instanceof Publicacion) && ((Publicacion)arrayPublicaciones[i]).getAnio() < anio)
				contador++;
		}
		return contador;
	}

	public static void main(String[] args) {

		Publicacion [] biblioteca = {new Libro("000001L", "Introduction to Java Programming", 2015),
				new Revista("000001R", "GeoInformatica", 2017, 75),
				new Libro("000002L", "Machine Learning with Java", 2017),
				new Libro("000003L", "Data Structures and Algorithms in Java", 2014),
				new Revista("000002R", "Information Systems", 2017, 87),
				new Revista("000003R", "Parallel Databases", 2017, 51),
				};

		((Libro)biblioteca[0]).prestar();
		((Libro)biblioteca[3]).prestar();
		for (int i = 0; i < biblioteca.length; i++) {
			System.out.println(biblioteca[i]);
		}

		int anio = 2016;
		System.out.println(publicacionesAnterioresA(biblioteca, anio) + " publicaciones anteriores a " + anio);

		System.out.println(numeroPrestados(biblioteca) + " libros prestados");
	}
}
