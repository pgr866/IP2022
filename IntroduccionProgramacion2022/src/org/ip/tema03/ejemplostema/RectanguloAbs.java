package org.ip.tema03.ejemplostema;

public class RectanguloAbs extends Figura {
	private double ancho;
	private double alto;
	
	public RectanguloAbs(double x, double y, double ancho, double alto) {
		super(x, y);
		this.ancho = ancho;
		this.alto = alto;
	}
	
	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	@Override
	public double area() {
		return ancho * alto;
	}

}
