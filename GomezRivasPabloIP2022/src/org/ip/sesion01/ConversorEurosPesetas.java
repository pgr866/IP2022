package org.ip.sesion01;

public class ConversorEurosPesetas {

	public static void main(String[] args) {

		double euros = 131.25;
		int pesetas = 3247;
		int totalPesetas = (int) (euros * 166.386);
		double totalEuros = pesetas / 166.386;

		System.out.println(euros + " euros => " + totalPesetas + " pesetas");
		System.out.printf(pesetas + " pesetas => ");
		System.out.printf("%.2f", totalEuros);
		System.out.println(" euros");
	}
}