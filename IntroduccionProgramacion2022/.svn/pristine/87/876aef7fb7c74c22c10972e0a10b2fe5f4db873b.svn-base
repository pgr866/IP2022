package org.ip.tema04;

import java.util.Arrays;
import org.ip.sesion07.Fraccion;

public class BusquedaLinealGenerica {

	@SuppressWarnings({"rawtypes"})
	public static int busquedaLineal(Comparable[] array, Comparable clave) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(clave))
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		Fraccion [] arrayFracciones = {new Fraccion(9, 2), new Fraccion(-3, 4), new Fraccion(1, 2),
				new Fraccion(7, 5), new Fraccion(1, 5), new Fraccion(1, 7), new Fraccion(7, 9),
				new Fraccion(1, 3), new Fraccion(7, 13), new Fraccion(-3, 7)};
		System.out.println("El array de fracciones es: " + Arrays.toString(arrayFracciones));
		Fraccion clave = new Fraccion(1, 2);
		int posicion = busquedaLineal(arrayFracciones, clave);
		System.out.println("La fraccion " + clave + " esta en la posicion " + posicion);
		Fraccion otraClave = new Fraccion(5, 7);
		System.out.println("La fraccion " + otraClave + " esta en la posicion " + busquedaLineal(arrayFracciones, otraClave));
	}
}
