package org.ip.sesion04;

public class GenerarPrimos {
	
	public static boolean esPrimo(int numero) {
		
		if(numero == 1)
			return false;
		
		if(numero % 2 == 0)
			if (numero == 2)
				return true;
			else
				return false;
		
		double raiz = Math.sqrt(numero);
		int resto=1;
		
		for(int i=3;resto!=0 && i<=raiz;i+=2)
			resto = (int) (numero%i);
		
		if(resto==0)
			return false;
		else
			return true;
	}
	
	public static void main(String[] args) {
		int n = 50;
		int i = 1;
		int numero = 2;
		System.out.println("Los " + n + " primeros numeros primos son:");
		System.out.println();
		
		while (i<=n) {
			if (GenerarPrimos.esPrimo(numero)) {
				System.out.printf("\t%3d",numero);
				if (i%10==0) {
					System.out.println();
				}
				i++;
			}
			numero++;
		}
	}
}
