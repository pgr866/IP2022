package org.ip.tema01.ejemplostema;

public class ValorDevuelto {

	// cada llamada se sustituye por un int
	public static int sumaEnteros(int entero1, int entero2) {
		int resultado;
		resultado = entero1 + entero2;
		
		return resultado;  // sustituye la llamada por el valor especificado
	}
	
	public static void main(String[] args) {
		int suma = sumaEnteros(2, 3);  // se sustituye por 5 que se asigna a suma
		int valor = sumaEnteros(1, 7) * 5; // se sustituye por 8 que se multiplica por 5
		
		System.out.println("Suma  = " + suma);
		System.out.println("Valor = " + valor);
	}
}

