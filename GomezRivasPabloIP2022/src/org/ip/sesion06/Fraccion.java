package org.ip.sesion06;

public class Fraccion {
	private int numerador;
	private int denominador;
	private static int numFracciones = 0;
	
	public Fraccion() {
		super();
		this.numerador = 0;
		this.denominador = 1;
		numFracciones++;
	}
	
	public Fraccion(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
		numFracciones++;
	}
	
	public Fraccion(Fraccion fraccion) {
		super();
		this.numerador = fraccion.numerador;
		this.denominador = fraccion.denominador;
		numFracciones++;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fraccion otro = (Fraccion) obj;
		return numerador == otro.numerador && denominador == otro.denominador;
	}
	
	public int getNumerador() {
		return numerador;
	}
	
	public int getDenominador() {
		return denominador;
	}
	
	public static int getNumFracciones() {
		return numFracciones;
	}
	
	@Override
	public String toString() {
		return numerador + "/" + denominador;
	}
	
	public Fraccion sumar(Fraccion b) {
        Fraccion suma = new Fraccion();
        suma.numerador = this.numerador * b.denominador + this.denominador * b.numerador;
        suma.denominador = this.denominador * b.denominador;
        return suma;
	}
	
	public static Fraccion sumar(Fraccion a, Fraccion b) {
        Fraccion suma = new Fraccion();
        suma.numerador = a.getNumerador() * b.getDenominador() + a.getDenominador() * b.getNumerador();
        suma.denominador = a.getDenominador() * b.getDenominador();
        return suma;
	}
	
	public Fraccion restar(Fraccion b) {
        Fraccion resta = new Fraccion();
        resta.numerador = this.numerador * b.denominador - this.denominador * b.numerador;
        resta.denominador = this.denominador * b.denominador;
        return resta;
	}
	
	public Fraccion multiplicar(Fraccion b) {
        Fraccion producto = new Fraccion();
        producto.numerador = this.numerador * b.numerador;
        producto.denominador = this.denominador * b.denominador;
        return producto;
	}
	
	public Fraccion dividir(Fraccion b) {
        Fraccion cociente = new Fraccion();
        cociente.numerador = this.numerador * b.denominador;
        cociente.denominador = this.denominador * b.numerador;
        return cociente;
	}
	
	private int mcd(){
	     int u = Math.abs(numerador);
	     int v = Math.abs(denominador);
	     if(v == 0){
	          return u;
	     }
	     int r;
	     while(v != 0){
	          r = u % v;
	          u = v;
	          v = r;
	     }
	     return u;
	}
	
	public Fraccion simplificar() {
		Fraccion simplificada = new Fraccion();
        int n = mcd();
        simplificada.numerador = numerador / n;
        simplificada.denominador = denominador / n;
        numFracciones--;
        return simplificada;
    }
	
}
