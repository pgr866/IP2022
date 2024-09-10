package org.ip.tema03.ejemplostema;

public class RectanguloCom {
	private Punto origen;
	private int ancho;
	private int alto;
	public RectanguloCom(Punto origen, int ancho, int alto) {
		super();
		this.origen = origen;
		this.ancho = ancho;
		this.alto = alto;
	}
	@Override
	public String toString() {
		return "Rectangulo [origen=" + origen + ", ancho=" + ancho
				+ ", alto=" + alto + "]";
	}
	public Punto getOrigen() {	return origen;	}
	public void setOrigen(Punto origen) {	this.origen = origen;	}
	public int getAncho() {	return ancho;	}
	public void setAncho(int ancho) {	this.ancho = ancho;	}
	public int getAlto() {	return alto;	}
	public void setAlto(int alto) {	this.alto = alto;	}
	@Override
	public boolean equals(Object obj) {
		RectanguloCom otro = (RectanguloCom) obj;
		return ancho == otro.ancho && alto == otro.alto && origen.equals(otro.origen);
	}
	public void desplazar(int dx, int dy) {
		origen.desplazar(dx, dy);
	}
}
