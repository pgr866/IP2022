package org.ip.tema03.ejemplostema;

public class TestFigura {

	public static void main(String[] args) {
		Cuadrado cuad = new Cuadrado(1.0, 1.0, 1.5);
		System.out.println("X cuadrado = " + cuad.getX());
		cuad.x = 5.0;
		System.out.println("Area cuadrado = " + cuad.area());
		System.out.println("X cuadrado = " + cuad.getX());
		System.out.println(cuad.toString());
		RectanguloAbs rect = new RectanguloAbs(1.0, 0.0, 2.0, 3.0);
		System.out.println("Area rectangulo = " + rect.area());
		Circulo circ = new Circulo(0.0, 0.0, 2.5);
		System.out.println("Area cuadrado = " + circ.area());		
	}
}
