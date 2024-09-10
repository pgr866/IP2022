package org.ip.tema01.ejemplostema;

/*
 * Tablas de multiplicar con for y while
 */
public class TablasMultiplicar {

	public static void main(String[] args) {
		for (int tabla = 1; tabla <= 10; tabla++) {
			System.out.println("\n\nTabla del " + tabla);
         
			int i = 1;
			while (i <= 10) {
				System.out.println(tabla + " x " + i + " = " + (tabla * i));
				i++;
			}
		}
	}
}
