package org.ip.tema01.ejerciciosresueltos;

public class EstimatePI {

	public static double estimationOfPi(long precision) {
		double valorEstimado = 0.0;
		double sum = 0.0;
		boolean mostrar = true;
		long cantidadMostrar = precision / 10;
		
		System.out.printf("%-6s\t\t%8s\n", "i" , "PI(i)");
		System.out.println("--------------------------");
		for (long i = 1; i <= precision; i++){
			//if (i % 2 == 0)
			//	sum += -1.0 / ((2.0 * (double)i) - 1.0);
			//else
			//	sum += 1.0 / ((2.0 * (double)i) - 1.0);
			
			sum += Math.pow(-1.0, (double)i + 1.0) / ((2.0 * (double)i) - 1.0);
			
			if (mostrar) {
				//System.out.println("i = " + i + ", PI(" + i + ") = " + 4.0 * sum);
				System.out.printf("%-8d\t%10.8f\n", i , 4.0 * sum);
				valorEstimado = 4.0 * sum;
				mostrar = false;
			}
			if (i % cantidadMostrar == 0)
				mostrar = true;
		}
		
		return valorEstimado;
	}

	public static void main(String[] args) {
		double piEstimatedValue = estimationOfPi(1000);
		System.out.printf("\nmyPI = \t\t%17.15f", piEstimatedValue);
		System.out.printf("\nMath.PI = \t%17.15f", Math.PI);
	}
}
