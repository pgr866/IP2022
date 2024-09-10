package org.ip.tema03.ejemplostema;

public class PasaObjeto {

	public static void printAreas(Circulo1 c, int n) {
		System.out.println("n principio del metodo: " + n);
		System.out.println("Radio \t\tArea");
		while (n >= 1) {
			System.out.println(c.getRadio() + "\t\t" + c.getArea());
			c.setRadio(c.getRadio() + 1);
			n--;
		}
		System.out.println("n final del metodo: " + n);
	}

	public static void main(String[] args) {
		Circulo1 miCirculo = new Circulo1(1);
		int n = 5;
		printAreas(miCirculo, n);
		System.out.println("El radio es " + miCirculo.getRadio());
		System.out.println("n es " + n);
	}
}
