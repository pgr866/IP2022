package org.ip.sesion07;

public class Complejo {

	private double real;
	private double imaginaria;

	public Complejo(double real, double imaginaria) {
		super();
		this.real = real;
		this.imaginaria = imaginaria;
	}

	public Complejo(double real) {
		super();
		this.real = real;
		this.imaginaria = 0.0;
	}

	public Complejo(Complejo comp) {
		super();
		this.real = comp.real;
		this.imaginaria = comp.imaginaria;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImaginaria() {
		return imaginaria;
	}

	public void setImaginaria(double imaginaria) {
		this.imaginaria = imaginaria;
	}

	@Override
	public String toString() {
		if (imaginaria == 0) return real + "";
        if (real == 0) return imaginaria + "i";
        if (imaginaria <  0) return real + " - " + (-imaginaria) + "i";
        return real + " + " + imaginaria + "i";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complejo other = (Complejo) obj;
		if (real != other.real)
			return false;
		if (imaginaria != other.imaginaria)
			return false;
		return true;
	}

	public Complejo sumar(Complejo b) {
		double parteReal = real + b.getReal();
		double parteImag = 	imaginaria + b.getImaginaria();
		return new Complejo(parteReal, parteImag);
	}

	public Complejo restar(Complejo b) {
		double parteReal = real - b.getReal();
		double parteImag = 	imaginaria - b.getImaginaria();
		return new Complejo(parteReal, parteImag);
	}

	public Complejo multiplicar(Complejo b) {
		double parteReal = real * b.getReal() - imaginaria * b.getImaginaria();
		double parteImag = 	imaginaria * b.getReal() + real* b.getImaginaria();
		return new Complejo(parteReal, parteImag);
	}

	public Complejo productoPorEscalar(double valorEscalar) {
		double parteReal = real * valorEscalar;
		double parteImag = 	imaginaria * valorEscalar;
		return new Complejo(parteReal, parteImag);
	}

	public Complejo dividir(Complejo b) {
	    double denominador = b.getReal() * b.getReal() + (b.getImaginaria() * b.getImaginaria());
		double parteReal = (real * b.getReal() + imaginaria * b.getImaginaria()) / denominador;
		double parteImag = 	(imaginaria * b.getReal() - real* b.getImaginaria()) / denominador;
		return new Complejo(parteReal, parteImag);
	}

	public Complejo modulo() {
		return new Complejo (Math.sqrt(real*real + imaginaria*imaginaria));
	}

	public double argumento() {
		return Math.atan2(imaginaria,real);
	}

	public Complejo conjugado() {
		return new Complejo (real, -imaginaria);
	}

}
