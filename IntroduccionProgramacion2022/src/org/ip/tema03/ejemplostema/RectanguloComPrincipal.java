package org.ip.tema03.ejemplostema;

public class RectanguloComPrincipal {

	public static void main(String[] args) {
		Punto p = new Punto(5, 10);
		System.out.println(p.toString());
		RectanguloCom rect1 = new RectanguloCom(p, 5, 20);
		System.out.println(rect1.toString());
		RectanguloCom rect2 = new RectanguloCom(new Punto(4, 4), 10, 20);
		System.out.println(rect2.toString());
		rect1.desplazar(2, 2);
		System.out.println(rect1.toString());
	}
}
