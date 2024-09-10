package org.ip.sesion01;

public class EnteroAleatorio {

	public static void main(String[] args) {
		
		int m = -15;
		int n = 15;
		int valorEntero = (int) Math.floor(Math.random()*(n-m+1)+m);
		System.out.println("Vamos a generar un entero aleatorio entre " + m + " y " + n);
		System.out.println();
		System.out.println("El entero generado aleatoriamente es: " + valorEntero);
		
	}
}
