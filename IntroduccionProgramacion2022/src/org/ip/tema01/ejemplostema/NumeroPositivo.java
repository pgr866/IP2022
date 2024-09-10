package org.ip.tema01.ejemplostema;

import java.util.Scanner; // Importamos esta libreria con utilidades para leer desde teclado

public class NumeroPositivo {

	public static void main(String[] args) {
		
		int numero; // NO ponemos tildes!! 
		
		// Para leer desde teclado declaramos e inicializamos esta variable llamada entrada
		Scanner entrada = new Scanner(System.in);
			
	    System.out.println("Introduzca un numero: ");
	    
	    numero = entrada.nextInt();  // Lee un int desde teclado y lo guarda en la variable numero

	    if (numero < 0) {
	        System.out.println("Este numero es negativo: " + numero);
	        numero = numero * -1;	    
	    }
		
	    System.out.println("El valor absoluto del numero es: " + numero);
	    
	    entrada.close();
	}
}
