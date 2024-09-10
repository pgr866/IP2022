package org.ip.sesion03;

import java.util.Scanner;

public class BucleCentinela {

	public static void main(String[] args) {
		
		int numeros = 0;
		int a = 0;
		int b = 0;
		int positivos = 0;
		int negativos = 0;
		double contador = 0;
		double sumatoria = 0;
		
		System.out.println("Introduce valores enteros, el programa termina si la entrada es 0");
		
		Scanner entrada=new Scanner(System.in);
		
		do {
			numeros = entrada.nextInt();
			if (numeros>0) {
				a++;
				positivos+=numeros;
			}
			if (numeros<0) {
				b++;
				negativos+=numeros;
			}
			sumatoria+=numeros;
			contador++;
		} while (!(numeros==0));
		
		System.out.println("El numero de positivos es " + a);
		System.out.println("El numero de negativos es " + b);
		System.out.println("La suma total de valores leidos es " + (int)sumatoria);
		System.out.println("La suma de los positivos es " + positivos);
		System.out.println("La suma de los negativos es " + negativos);
		System.out.println("La media de los valores es " + (sumatoria/(contador-1)));
		
		entrada.close();
	}	
}
