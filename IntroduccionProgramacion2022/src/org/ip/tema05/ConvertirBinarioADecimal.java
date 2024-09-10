package org.ip.tema05;

public class ConvertirBinarioADecimal {

	public static void main(String[] args) {
		String strNumeroBinario = "111000";

		// Convierte un numero binario a decimal utilizando
		// el metodo de clase ParseInt de la clase Integer
		// El segundo argumento indica la base

		int numeroDecimal = Integer.parseInt(strNumeroBinario, 2);
		System.out.println("El numero binario " + strNumeroBinario
				+ " convertido a numero decimal es " + numeroDecimal);
	}
}
