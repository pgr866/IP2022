package org.ip.tema03.ejerciciosresueltos;

public abstract class Instrumento {
	public enum Nota {DO, RE, MI, FA, SOL, LA, SI}

	protected String nombre;
	protected String tipo;
	protected Nota notas[];
	protected int numeroNotas;
	static protected int TAMANO_MAXIMO_ARRAY = 100;

	public Instrumento() {
		this.nombre = "";
		this.tipo = "";
		this.notas = new Nota[TAMANO_MAXIMO_ARRAY];
		this.numeroNotas = 0;
	}

	public Instrumento(String nombre, String tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.notas = new Nota[TAMANO_MAXIMO_ARRAY];
		this.numeroNotas = 0;
	}

	void anadirNota(Nota nota) {
		if (numeroNotas < notas.length) {
			notas[numeroNotas] = nota;
			numeroNotas++;
		}
	}

	// metodo abstracto
	abstract void interpretar();
}
