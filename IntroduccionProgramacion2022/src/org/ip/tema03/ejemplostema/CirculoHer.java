package org.ip.tema03.ejemplostema;

public class CirculoHer extends ObjGeometrico {
	private double radio;

	public CirculoHer(int x, int y, double radio) {
		super(x, y);
		this.radio = radio;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	@Override
	public String toString() {
		return "Origen del circulo = " + super.toString()
				+ ", radio = " + radio;
	}
}
