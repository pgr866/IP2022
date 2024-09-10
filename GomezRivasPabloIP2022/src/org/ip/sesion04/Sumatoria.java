package org.ip.sesion04;

import java.util.Scanner;

public class Sumatoria {
	
	public static int sumaIterativa(int x) {
		
		int suma=0;
		for (int i=1;i<=x;i++) {
			suma = suma + i;
		}
		return suma;
	}
	
	public static int sumaDirecta(int x) {
		
		int suma = x * (x + 1) / 2;
		return suma;
	}
	
	public static int sumaRecursiva(int x) {
		
		if (x==1) {
			return 1;
		} else {
			return x+Sumatoria.sumaRecursiva(x-1);
		}
	}
	
	public static void main(String[] args) {
		
		int x;
		Scanner entrada=new Scanner(System.in);		
		
		System.out.println("Introduzca el numero de terminos que desea sumar");
		x = entrada.nextInt();
		System.out.println();
		System.out.println("La suma usando el metodo iterativo de los " + x + " primeros numeros es " + Sumatoria.sumaIterativa(x));
		System.out.println("La suma usando el metodo directo de los " + x + " primeros numeros es " + Sumatoria.sumaDirecta(x));
		System.out.println("La suma usando el metodo recursivo de los " + x + " primeros numeros es " + Sumatoria.sumaRecursiva(x));
		System.out.println();
		if (Sumatoria.sumaIterativa(x) == Sumatoria.sumaDirecta(x) && Sumatoria.sumaIterativa(x) == Sumatoria.sumaRecursiva(x)) {
			System.out.println("Funcionamiento correcto");
		} else {
			System.out.println("Funcionamiento incorrecto");
		}
		
		entrada.close();
	}
}
