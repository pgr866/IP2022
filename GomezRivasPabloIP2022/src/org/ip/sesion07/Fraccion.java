package org.ip.sesion07;

public class Fraccion implements Comparable {
	
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
		Fraccion otro = (Fraccion) obj;
		if(this.numerador == otro.numerador && this.denominador == otro.denominador)
			return true;
			
		return false;
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
	
	public static int getNumFracciones() {
		return numFracciones;
	}
	
	@Override
	public String toString() {
		return numerador + "/" + denominador;
	}
	
	public Fraccion sumar(Fraccion frac) {
        Fraccion suma = new Fraccion();
        suma.numerador = this.numerador * frac.denominador + this.denominador * frac.numerador;
        suma.denominador = this.denominador * frac.denominador;
        return suma;
	}
	
	public static Fraccion sumar(Fraccion frac1, Fraccion frac2) {
        Fraccion suma = new Fraccion();
        suma.numerador = frac1.getNumerador() * frac2.getDenominador() + frac1.getDenominador() * frac2.getNumerador();
        suma.denominador = frac1.getDenominador() * frac2.getDenominador();
        return suma;
	}
	
	public Fraccion restar(Fraccion frac) {
        Fraccion resta = new Fraccion();
        resta.numerador = this.numerador * frac.denominador - this.denominador * frac.numerador;
        resta.denominador = this.denominador * frac.denominador;
        return resta;
	}
	
	public Fraccion multiplicar(Fraccion frac) {
        Fraccion producto = new Fraccion();
        producto.numerador = this.numerador * frac.numerador;
        producto.denominador = this.denominador * frac.denominador;
        return producto;
	}
	
	public Fraccion dividir(Fraccion frac) {
        Fraccion cociente = new Fraccion();
        cociente.numerador = this.numerador * frac.denominador;
        cociente.denominador = this.denominador * frac.numerador;
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
        
        if(simplificada.getNumerador()<0 && simplificada.getDenominador()<0) {
        	simplificada.setNumerador(-1*simplificada.getNumerador());
        	simplificada.setDenominador(-1*simplificada.getDenominador());		 
        }
        return simplificada;
    }

	@Override
	public int compareTo(Object obj) {
		Fraccion otro = (Fraccion) obj;
		
		if(((double) numerador/(double) denominador) == ((double) otro.numerador/(double) otro.denominador)) {
			return 0;
		} else if(((double) numerador/(double) denominador)>((double) otro.numerador/(double) otro.denominador)) {
			return 1;
		} else {
			return -1;
		}
	}
	
}
