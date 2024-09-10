package org.ip.tema03.ejemplostema;

public class RectanguloPrincipal {

	public static void main(String[] args) {
		Rectangulo rect1 = new Rectangulo(10, 15, 20, 5);
		Rectangulo rect2 = new Rectangulo(7, 15, 7, 5);
		Rectangulo rect3 = new Rectangulo(10, 15, 20, 20);

		int altura = rect1.getAlto();
		if (altura < 10)
			System.out.println("Rectangulo 1 pequenio");
		System.out.println("Rectangulo 1 " + rect1.toString());
		if (rect1.equals(rect2))
			System.out.println("Mismos rectangulos 1 y 2");
		else
			System.out.println("Distintos rectangulos 1 y 2");
		if (rect1.equals(rect3))
			System.out.println("Mismos rectangulos 1 y 3");
		else
			System.out.println("Distintos rectangulos 1 y 3");
		System.out.println("El numero de rectangulos creados es "
				+ Rectangulo.getNumRectangulos());
		rect1.desplazar(7, 9);
		System.out.println("Rectangulo 1 " + rect1.toString());
		if (rect1.compareTo(rect3) == 0)
			System.out.println("Rectangulos 1 y 3 con igual area");
		else if (rect1.compareTo(rect3) == -1)
			System.out.println("Rectangulo 1 tiene menor area que 3");
		else
			System.out.println("Rectangulo 1 tiene mayor area que 3");
		if (rect1.estaDentro(20, 26))
			System.out.println("El punto (20, 26) esta dentro del rectangulo 1");
		else
			System.out.println("El punto (20, 26) no esta dentro del rectangulo 1");
		
		Rectangulo rect4 = new Rectangulo(rect2);
		if (rect4.equals(rect2))
			System.out.println("Mismos rectangulos 4 y 2");
		else
			System.out.println("Distintos rectangulos 4 y 2");
		System.out.println("Area del rectangulo 4: " + rect4.calcularArea());
		System.out.println("El numero de rectangulos creados es "
				+ Rectangulo.getNumRectangulos());
	}
}
