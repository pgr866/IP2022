package org.ip.tema03.ejerciciosresueltos;

public class Libro extends Publicacion implements Prestable {

	private boolean prestado;

	public Libro(String codigo, String titulo, int anio, boolean prestado) {
		super(codigo, titulo, anio);
		this.prestado = prestado;
	}

	public Libro(String codigo, String titulo, int anio) {
		super(codigo, titulo, anio);
		this.prestado = false;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	public void prestar() {
		prestado = true;
	}

	public void devolver() {
		prestado = false;
	}

	@Override
	public String toString() {
		return super.toString() + (prestado ? "prestado" : "no prestado") + "\n";
	}
}
