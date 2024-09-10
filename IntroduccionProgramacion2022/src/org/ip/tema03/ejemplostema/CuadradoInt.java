package org.ip.tema03.ejemplostema;

public class CuadradoInt implements FiguraInt {
	private double lado;

	public CuadradoInt(double lado) {
		super();
		this.lado = lado;
	}

	@Override
	public double area() {
		return lado * lado;
	}
}
