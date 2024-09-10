package org.ip.tema01.ejerciciosresueltos;

public class Ejercicio10 {

	/**
	 * Muestra las potencias de 2 comprendidas entre 1 y 100000
	 * @param args
	 */
	public static void main(String[] args) {
	    int potencia = 1;
		int i = 0;
		int limite = 100000;
		while (potencia <= limite){
			System.out.printf("%d\t%d\n",i,potencia);
			potencia = potencia * 2;
			i++;
		}
		
		// Otra forma de hacerlo con 'for'		
		/*
		for (int potencia = 1; potencia <= limite; i++) {
			System.out.printf("%d\t%d\n", i, potencia);
			potencia = potencia * 2;
		}
		*/
	}
}
