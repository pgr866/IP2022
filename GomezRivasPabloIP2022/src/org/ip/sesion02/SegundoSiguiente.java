package org.ip.sesion02;

public class SegundoSiguiente {

	public static void main(String[] args) {
		int hora = 11;
		int minuto = 42;
		int segundo = 59;
		
		System.out.print("Instante de tiempo actual             : ");
		System.out.printf("%02d", hora);
		System.out.print(":");
		System.out.printf("%02d", minuto);
		System.out.print(":");
		System.out.printf("%02d", segundo);
		System.out.println();
		if (hora>=0 && hora<=23 && minuto>=0 && minuto<=59 && segundo>=0 && segundo<=59) {
			segundo ++;
			if (segundo == 60) {
				segundo = 0;
				minuto ++;
			}
			if (minuto == 60) {
				minuto = 0;
				hora ++;
			}
			if (hora == 24) {
				hora = 0;
			}

			System.out.print("Instante de tiempo un segundo despues : ");
			System.out.printf("%02d", hora);
			System.out.print(":");
			System.out.printf("%02d", minuto);
			System.out.print(":");
			System.out.printf("%02d", segundo);
		}		
	}
}
