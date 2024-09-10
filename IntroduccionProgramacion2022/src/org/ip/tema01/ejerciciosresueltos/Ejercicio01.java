package org.ip.tema01.ejerciciosresueltos;

public class Ejercicio01 {

	/**
	 * Suma y multiplica dos enteros no negativos
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int dato1, dato2, suma, producto;
		// PRE: nDato1 >= 0 y nDato2 >= 0
		dato1 = 7;
		dato2 = 10;
		suma = dato1 + dato2;
		producto = dato1 * dato2;
		System.out.println("La suma es...." + suma);
		System.out.println(("El producto es...." + producto));
		

	}

}
// POST: nProducto = nDato1 * nDato2 y nSuma = nDato1 + nDato2