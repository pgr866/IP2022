package org.ip.sesion04;

import java.util.Scanner;

public class PrintCalendario {
	
	public static boolean esBisiesto(int anio) {
		
		if (anio%4 == 0 && anio%100 != 0 || anio%400 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static int getNumeroDeDiasDelMes(int anio, int mes) {
		
		switch (mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				return 31;
			case 4:
			case 6:
			case 9:
			case 11:
				return 30;
			case 2:
				if (PrintCalendario.esBisiesto(anio)) {
					return 29;
				} else {
					return 28;
				}
		}
		return 0;
	}
	
	public static int getDiaInicio(int anio, int mes) {
		
		int y0 = anio - (14 - mes) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = mes + 12 * ((14 - mes) / 12) - 2;
		int d0 = (1 + x + (31 * m0) / 12) % 7;
		return d0;
	}
	
	public static void printCuerpoMes(int anio, int mes) {
		
		int inicio = PrintCalendario.getDiaInicio(anio, mes);
		int diasMes = PrintCalendario.getNumeroDeDiasDelMes(anio, mes);
		
		if (inicio == 0) {
			inicio = 7;
		}
		
		for (int j = 1;j<=(inicio-1);j++) {
			System.out.print("    ");
		}
			
		for (int i = inicio;i<(inicio+diasMes);i++) {
			
			if (i%7==0) {
				System.out.print("  ");
				System.out.printf("%2d",(i-inicio+1));
				System.out.println();
			} else {
				System.out.print("  ");
				System.out.printf("%2d",(i-inicio+1));
			}
		}
	}
	
	public static String getNombreMes(int mes) {
	switch(mes) {
		case 1:
			return "Enero";
		case 2:
			return "Febrero";
		case 3:
			return "Marzo";
		case 4:
			return "Abril";
		case 5:
			return "Mayo";
		case 6:
			return "Junio";
		case 7:
			return "Julio";
		case 8:
			return "Agosto";
		case 9:
			return "Septiembre";
		case 10:
			return "Octubre";
		case 11:
			return "Noviembre";
		case 12:
			return "Diciembre";
	}
	return null;
	}
	
	public static void printTituloMes(int anio, int mes) {
		System.out.println("         " + PrintCalendario.getNombreMes(mes) + " " + anio);
		System.out.println("-----------------------------");
		System.out.println(" Lun Mar Mie Jue Vie Sab Dom");
	}
	
	public static void printMes(int anio, int mes) {
		
		PrintCalendario.printTituloMes(anio, mes);
		PrintCalendario.printCuerpoMes(anio, mes);
	}
		
	public static void main(String[] args) {
		
		int anio;
		int mes;
		Scanner entrada=new Scanner(System.in);
		
		System.out.print("Introduzca un anio completo (e.g., 2001): ");
		anio = entrada.nextInt();
		
		System.out.print("Introduzca un mes como un numero entre 1 y 12: ");
		mes = entrada.nextInt();
		PrintCalendario.printMes(anio, mes);
		
		entrada.close();
	}
}
