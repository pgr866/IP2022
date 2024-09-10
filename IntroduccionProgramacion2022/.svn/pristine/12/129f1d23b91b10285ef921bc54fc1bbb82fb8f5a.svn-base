package org.ip.tema01.ejemplostema;

public class FacturaTaxi {
	/**
	 * Porgrama que calcula la factura de un taxi segun el numero de kms.
	 * Por debajo de 30km la cantidad es fija, entre 31-100 km hay una segunda tarifa, y 
	 * si recorre mas de 100km se aplica una tercera tarifa.
	 */

	public static void main(String[] args) {
		double fijo = 18;
		int km = 150;
		double tarifa2 = 0.85;
		double tarifa3 = 0.65;
		double importe;
		
		if (km <= 30) {
			importe = fijo;
		} else if (km <= 100) {
			importe = fijo + (km - 30) * tarifa2;
		} else {
			importe = fijo + 70 * tarifa2  + (km - 100) * tarifa3;
		}
		
		System.out.println();
		System.out.println("CALCULO TARIFA TAXI");
		System.out.println();
		System.out.println("Kilometros recorridos => " + km);
		System.out.printf("El importe total a pagar es %5.2f euros", importe);
	}
}
