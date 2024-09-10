package org.ip.tema01.ejemplostema;

public class CalculosEsfera {

	public static void main(String[] args){
		
		double radio = 4.3;

		double diametro, area, volumen;
		double radioCilindro, alturaCilindro;
		
		diametro = 2 * radio;
		System.out.println("El diametro de la esfera es: " + diametro);
			
		area = 4 * Math.PI * Math.pow(radio, 2.0);
		System.out.println("El area de la esfera es: " + area);
				
		volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3.0);
		System.out.println("El volumen de la esfera es: " + volumen);
				
		radioCilindro = (Math.sqrt(2.0) / 2.0) * radio;
		alturaCilindro = Math.sqrt(2.0) * radio;
		System.out.println("El radio del cilindro inscrito en la esfera es : " + radioCilindro);
		System.out.println("La altura del cilindro inscrito en la esfera es: " + alturaCilindro);
	}
}
