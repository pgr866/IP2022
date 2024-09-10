package org.ip.sesion04;

import java.util.Scanner;

public class ValidarFecha {
	
	public static boolean esBisiesto(int anio) {
		
		if (anio%4 == 0 && anio%100 != 0 || anio%400 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean esFechaCorrecta(int dia, int mes, int anio) {
		
		if (anio >= 1) {
			switch (mes) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if (dia >= 1 && dia <= 31) {
						return true;
					} else {
						return false;
					}
				case 4:
				case 6:
				case 9:
				case 11:
					if (dia >= 1 && dia <=  30) {
						return true;
					} else {
						return false;
					}
				case 2:
					if (dia >=1 && dia <= 28 && !ValidarFecha.esBisiesto(anio)) {
						return true;
					} else if  (dia >=1 && dia <= 29 && ValidarFecha.esBisiesto(anio)) {
						return true;
					} else {
						return false;
					}
			}
		} else {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int dia, mes, anio;
		Scanner entrada=new Scanner(System.in);
		
		do {
			System.out.println("Introduce el dia");
			dia = entrada.nextInt();
			
			System.out.println("Introduce el mes");
			mes = entrada.nextInt();
			
			System.out.println("Introduce el anio");
			anio = entrada.nextInt();
			
			if (esFechaCorrecta(dia,mes,anio)) {
				System.out.println("FECHA CORRECTA");
			} else {
				System.out.println("FECHA INCORRECTA, INTRODUCE NUEVOS VALORES");
			}
		} while (!(esFechaCorrecta(dia,mes,anio)));
		
		entrada.close();
	}
}
