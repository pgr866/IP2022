package org.ip.tema03.ejerciciosresueltos;

public class Coche extends Vehiculo {

	private int numeroPuertas;

	public Coche(String marca, String modelo, String matricula, int numeroPuertas) {
		super(marca, modelo, matricula);
		this.numeroPuertas = numeroPuertas;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	@Override
	public String toString() {
		return "Coche => " + super.toString() + ". Tiene " + numeroPuertas + " puertas";
	}
}
