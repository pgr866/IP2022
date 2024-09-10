package org.ip.sesion01;

public class CalculoIntereses {

	public static void main(String[] args) {
		
		double dineroIngresado = 2500;
		double interesAnual = 1.75;
		double interesesSeisMeses = dineroIngresado * (interesAnual / 100) / 12 * 6;
		double retencionRealizada = interesesSeisMeses * 21 / 100;
		double interesesCobrados = interesesSeisMeses - retencionRealizada;
		
		System.out.println("*** Calculo de intereses ***");
		System.out.print("Dinero ingresado: ");
		System.out.printf("%.2f", dineroIngresado);
		System.out.println("€");
		System.out.print("Interes anual: ");
		System.out.printf("%.2f", interesAnual);
		System.out.println("%");
		System.out.print("Intereses a los 6 meses: ");
		System.out.printf("%.2f", interesesSeisMeses);
		System.out.println("€");
		System.out.print("Retencion realizada: ");
		System.out.printf("%.2f", retencionRealizada);
		System.out.println("€");
		System.out.print("Intereses cobrados: ");
		System.out.printf("%.2f", interesesCobrados);
		System.out.println("€");
		
	}
}