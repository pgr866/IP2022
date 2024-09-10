package org.ip.tema03.ejemplostema;

public class TestFiguraInt {

	public static void main(String[] args) {
		CirculoInt circ = new CirculoInt(2.5);
		System.out.println("Area del circulo: " + circ.area());
		CuadradoInt cuad = new CuadradoInt(5.0);
		System.out.println("Area del cuadrado: " + cuad.area());
		FiguraInt fig = cuad;
		System.out.println("Area de la figura: " + fig.area());
	}
}
