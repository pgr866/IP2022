package org.ip.sesion06;

import java.util.Scanner;

public class TestEcuacionCuadratica {
	
	public static void main(String[] args) {
		
		System.out.println("Introduce los valores de los coeficientes de la");
		System.out.println("ecuacion cuadratica: ax*x + b*x + c = 0");
		Scanner entrada = new Scanner(System.in);
		System.out.print("a = ");
		double a = entrada.nextDouble();
		System.out.print("b = ");
		double b = entrada.nextDouble();
		System.out.print("c = ");
		double c = entrada.nextDouble();
		entrada.close();
		
		EcuacionCuadratica ecuacion = new EcuacionCuadratica(a, b, c);
		System.out.println(ecuacion);
		
		if(a==0) {
			System.out.println("No es una ecuacion cuadratica");
		} else if(ecuacion.getDiscriminante()<0) {
			System.out.println("Ecuacion cuadratica sin raices reales");
		} else if(ecuacion.getDiscriminante()==0) {
			System.out.println("Ecuacion cuadratica con una unica raiz de valor doble");
			System.out.println("x = " + ecuacion.getRaiz1());
		} else {
			System.out.println("Ecuacion cuadratica con dos raices de valores");
			System.out.println("x1 = " + ecuacion.getRaiz1());
			System.out.println("x2 = " + ecuacion.getRaiz2());
		}	
	}
}
