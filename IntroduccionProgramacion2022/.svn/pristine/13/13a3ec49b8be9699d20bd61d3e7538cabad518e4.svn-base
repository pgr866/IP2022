package org.ip.sesion07;

public class Fraccion implements Comparable<Object> {

	private int numerador;
	private int denominador;

	public Fraccion() {
		numerador = 0;
		denominador = 1;
	}

	public Fraccion(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;

		//if ((numerador > 0 && denominador < 0) ||(numerador < 0 && denominador < 0 )){
		//	this.numerador = -numerador;
		//	this.denominador = -denominador;
		//}
		//else {
		//	this.numerador = numerador;
		//	this.denominador = denominador;
		//}

		//this.numerador = ((denominador > 0 ) ? 1 : -1) * numerador;
		//this.denominador = Math.abs(denominador);
	}

	public Fraccion(Fraccion frac) {
		this.numerador = frac.numerador;
		this.denominador = frac.denominador;
	}

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	@Override
	public String toString() {
		if (denominador == 1)
			return numerador + "";
		else
			return numerador + "/" + denominador;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Fraccion))
			return false;
		Fraccion otro = (Fraccion) obj;
		if (denominador != otro.denominador)
			return false;
		if (numerador != otro.numerador)
			return false;
		return true;
	}

	public Fraccion sumar(Fraccion b){
		int num = numerador * b.getDenominador() + denominador * b.getNumerador();
		int den = denominador * b.getDenominador();
		return new Fraccion(num, den);
	}

	public static Fraccion sumar(Fraccion a, Fraccion b) {
		int num = a.getNumerador() * b.getDenominador() + b.getNumerador() * a.getDenominador();
		int den = a.getDenominador() * b.getDenominador();
		return new Fraccion(num, den);
	}

	public  Fraccion restar(Fraccion b) {
		int num = numerador * b.getDenominador() - denominador * b.getNumerador();
		int den = denominador * b.getDenominador();
		return new Fraccion(num, den);
	}

	public  Fraccion multiplicar( Fraccion b) {
		return new Fraccion(numerador * b.getNumerador(), denominador * b.getDenominador());
	}

	public  Fraccion dividir( Fraccion b) {
		return new Fraccion(numerador * b.getDenominador(), denominador *b.getNumerador());
	}

	private static int mcd(int u, int v) {
		//u = Math.abs(u);
		if (u < 0)
			u = -u;
		//v = Math.abs(v);
		if (v < 0)
			v = -v;
		if (v == 0) {
			return u;
		}
		int r;
		while (v != 0) {
			r = u % v;
			u = v;
			v = r;
		}
		return u;
	}

	public Fraccion simplificar() {
		int mcd = mcd(numerador, denominador);
		numerador /= mcd;
		denominador /= mcd;
		return this;
	}

	public int compareTo(Object obj){
		Fraccion otraFraccion = (Fraccion) obj;

		double valorFraccion = (double)numerador / (double)denominador;
		double valorOtraFraccion = (double)otraFraccion.getNumerador() / (double)otraFraccion.getDenominador();

		if (valorFraccion > valorOtraFraccion)
			return 1;
		else if (valorFraccion < valorOtraFraccion)
			return -1;
		else
			return 0;
	}

}
