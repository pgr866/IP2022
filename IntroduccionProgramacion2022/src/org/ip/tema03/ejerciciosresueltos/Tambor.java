package org.ip.tema03.ejerciciosresueltos;

public class Tambor extends Instrumento {

	public Tambor() {
		super("Tambor", "Percusion");
	}

	@Override
	public void interpretar() {
		System.out.println(nombre + " - " + tipo);
		for (int i = 0; i < numeroNotas; i++) {
			switch (notas[i]) {
			case DO:
				System.out.print("DoT ");
				break;
			case RE:
				System.out.print("ReT ");
				break;
			case MI:
				System.out.print("MiT ");
				break;
			case FA:
				System.out.print("FaT ");
				break;
			case SOL:
				System.out.print("SolT ");
				break;
			case LA:
				System.out.print("LaT ");
				break;
			case SI:
				System.out.print("SiT ");
				break;
			}
		}
		System.out.println("");
	}

}
