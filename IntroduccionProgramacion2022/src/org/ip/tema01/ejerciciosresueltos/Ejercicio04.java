package org.ip.tema01.ejerciciosresueltos;

public class Ejercicio04 {

	/**
	 * Contrato en una empresa si los trabajadores cumplen: Que la edad sea de
	 * al menos 18 anios y tengan mas de 85 puntos en alguna de las dos pruebas
	 * que han realizado
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int edad, nota1, nota2;
		// PRE: edad >= 0 y nota1 >= 0 y nota2 >= 0
		edad = 18;
		nota1 = 15;
		nota2 = 90;
		if ((edad >= 18) && ((nota1 > 85) || (nota2 > 85))) {
			System.out.println("CONTRATADO");
		} else {
			System.out.println("NO CONTRATADO");
		}
	}
}
