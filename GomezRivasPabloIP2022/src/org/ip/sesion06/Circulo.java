package org.ip.sesion06;

public class Circulo {
	
	private double xCentro;
	private double yCentro;
	private double radio;
	private static int numCirculos;
	
	public Circulo() {
		super();
		this.xCentro = 0;
		this.yCentro = 0;
		this.radio = 0;
		numCirculos++;
	}
	
	public Circulo(double xCentro, double yCentro, double radio) {
		super();
		this.xCentro = xCentro;
		this.yCentro = yCentro;
		this.radio = radio;
		numCirculos++;
	}
	
	public Circulo(double xCentro, double yCentro) {
		super();
		this.xCentro = xCentro;
		this.yCentro = yCentro;
		this.radio = 0;
		numCirculos++;
	}
	
	public Circulo(double radio) {
		super();
		this.xCentro = 0;
		this.yCentro = 0;
		this.radio = radio;
		numCirculos++;
	}
	
	public Circulo(Circulo c) {
		super();
		this.xCentro = c.xCentro;
		this.yCentro = c.yCentro;
		this.radio = c.radio;
		numCirculos++;
	}
	
	 public static int getNumCirculos() {
		 return numCirculos;
	 }

	public double getXCentro() {
		return xCentro;
	}

	public void setXCentro(double xCentro) {
		this.xCentro = xCentro;
	}

	public double getYCentro() {
		return yCentro;
	}

	public void setYCentro(double yCentro) {
		this.yCentro = yCentro;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	@Override
	public String toString() {
		return "Circulo={(xCentro=" + xCentro + ", yCentro=" + yCentro + "), radio=" + radio + "}";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circulo other = (Circulo) obj;
		if (Double.doubleToLongBits(radio) != Double.doubleToLongBits(other.radio))
			return false;
		if (Double.doubleToLongBits(xCentro) != Double.doubleToLongBits(other.xCentro))
			return false;
		if (Double.doubleToLongBits(yCentro) != Double.doubleToLongBits(other.yCentro))
			return false;
		return true;
	}
	
	public int compareTo(Object obj) {
		Circulo otro = (Circulo) obj;
		if (calcularArea() == otro.calcularArea())
			return 0;
		else if (calcularArea() < otro.calcularArea())
			return -1;
		else
			return 1;
	}
	
	public double calcularArea() {
		double area = Math.PI * Math.pow(radio, 2);
		return area;
	}
	
	public double calcularLongitud() {
		double longitud = 2 * Math.PI * radio;
		return longitud;
	}
	
	public double calcularDiametro() {
		double diametro = 2 * radio;
		return diametro;
	}
	
}
