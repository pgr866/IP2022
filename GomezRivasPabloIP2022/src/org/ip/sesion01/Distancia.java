package org.ip.sesion01;

public class Distancia {

	public static void main(String[] args) {
		
		int x = 2;
		int y = 1;
		double distancia = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		System.out.println("La distancia del punto (" + x + ", " + y + ") al punto (0, 0) es " + distancia);
		
	}
}
