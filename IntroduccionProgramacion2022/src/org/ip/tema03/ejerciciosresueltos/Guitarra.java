package org.ip.tema03.ejerciciosresueltos;

public class Guitarra extends Instrumento {

	public Guitarra() {
		super("Guitarra", "Cuerda");
	}

	@Override
	public void interpretar() {
		System.out.println(nombre + " - " + tipo);
		for (int i = 0; i < numeroNotas; i++) {
			switch (notas[i]) {
			case DO:
				System.out.print("DoooG ");
				break;
			case RE:
				System.out.print("ReeeG ");
				break;
			case MI:
				System.out.print("MiiiG ");
				break;
			case FA:
				System.out.print("FaaaG ");
				break;
			case SOL:
				System.out.print("SooolG ");
				break;
			case LA:
				System.out.print("LaaaG ");
				break;
			case SI:
				System.out.print("SiiiG ");
				break;
			}
		}
		System.out.println("");
	}
}
