package org.ip.sesion07;

import org.ip.sesion07.Multimedia.Formato;

public class Disco extends Multimedia{

	public enum Genero { pop, rock, soul, funky, jazz, blues, tecno, hiphop, punk, ambient, classic, bso, flamenco }
	
	protected Genero genero;
	private int numeroCanciones;
	
	public Disco(String titulo, String autor, Formato formato, double duracion, Genero genero, int numeroCanciones) {
		super(titulo, autor, formato, duracion);
		this.genero = genero;
		this.numeroCanciones = numeroCanciones;
	}
	
	public Disco(Disco disco) {
		super(disco.getTitulo(), disco.getAutor(), disco.getFormato(), disco.getDuracion());
		this.genero = disco.genero;
		this.numeroCanciones = disco.numeroCanciones;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public int getNumeroCanciones() {
		return numeroCanciones;
	}

	public void setNumeroCanciones(int numeroCanciones) {
		this.numeroCanciones = numeroCanciones;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + "  Disco {genero: " + genero + " y numero de canciones: " + numeroCanciones + "}";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disco other = (Disco) obj;
		if (genero != other.genero)
			return false;
		if (numeroCanciones != other.numeroCanciones)
			return false;
		return true;
	}
	
}
