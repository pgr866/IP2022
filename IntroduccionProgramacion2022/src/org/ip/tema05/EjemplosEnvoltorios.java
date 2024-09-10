package org.ip.tema05;

public class EjemplosEnvoltorios {

	public static void main(String[] args) {
		Character caracter = new Character('a');
		boolean digito = Character.isDigit('5');	// metodo de clase
		System.out.println(digito);
		int valor = caracter.compareTo('j');	// metodo de objeto, interfaz Comparable
		System.out.println(valor);
		char letra = Character.toUpperCase('a');	// metodo de clase
		System.out.println(letra);
		Integer entero1 = new Integer(45);
		Integer entero2 = new Integer("456");
		System.out.println("El maximo valor entero es " + Integer.MAX_VALUE);
		System.out.println("El minimo valor real es " + Double.MIN_VALUE);
		int valor1 = entero1.intValue();	// metodo de Number y de objeto
		System.out.println(valor1);
		int valor2 = entero2.intValue();	// metodo de Number y de objeto
		System.out.println(valor2);
		Double real1 = new Double(25.0);
		Double real2 = new Double("456.75");
		double valor3 = real1.doubleValue();	// metodo de Number y de objeto
		System.out.println(valor3);
		double valor4 = real2.doubleValue();	// metodo de Number y de objeto
		System.out.println(valor4);
		double valor5 = Double.parseDouble("788.90");	// metodo de clase
		System.out.println(valor5);
	}
}
