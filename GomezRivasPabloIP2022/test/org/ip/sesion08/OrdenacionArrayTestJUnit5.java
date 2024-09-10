package org.ip.sesion08;

import static org.junit.Assert.*;

import org.ip.sesion07.Fraccion;

import java.util.Arrays;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrdenacionArrayTestJUnit5 {

	String salidaArray;
	String salidaEsperadaArray;

	// TestA
	double [] arrayReales;
	double [] otroArrayReales;

	// TestB
	Fraccion[] arrayFracciones;

	@Before
	public void setUp() throws Exception {		
		arrayReales = new double[] {20.5, 6.1, -30.7, 8.6, 1.9, 30.2, -2.3};
		otroArrayReales = new double[] {5.1, 10.2, -15.3, 2.4, -4.5, 23.6, 7.7, -13.8,
				8.9, 17.1, 27.2, 0.3};

		arrayFracciones = new Fraccion[] {
				new Fraccion(3, 2), new Fraccion(5, 3),
				new Fraccion(1, -6), new Fraccion(1, 7),
				new Fraccion(1, -2), new Fraccion(1, 5),
				new Fraccion(2, 5), new Fraccion(7, 3),
				new Fraccion(4, -3), new Fraccion(-2, 7),
				new Fraccion(6, 7), new Fraccion(3, 5),
				new Fraccion(-2, 3), new Fraccion(3, 7)};
	}

	/*
	 * testA_01: testeando el metodo burbuja en array de reales
	 */

	@Test
	public void testA_01_burbuja_caso01_arrayReales() {
		OrdenacionArray.burbuja(arrayReales);
		salidaArray = Arrays.toString(arrayReales);
		salidaEsperadaArray = "[-30.7, -2.3, 1.9, 6.1, 8.6, 20.5, 30.2]";
		assertEquals(salidaEsperadaArray, salidaArray);
	}

	/*
	 * testA_02: testeando el metodo burbujaMejorada en array de reales
	 */

	@Test
	public void testA_02_burbujaMejorada_caso01_otroArrayReales() {
		OrdenacionArray.burbujaMejoradoFlag(otroArrayReales);
		salidaArray = Arrays.toString(otroArrayReales);
		salidaEsperadaArray = "[-15.3, -13.8, -4.5, 0.3, 2.4, 5.1, 7.7, 8.9, 10.2, 17.1, 23.6, 27.2]";
		assertEquals(salidaEsperadaArray, salidaArray);
	}

	@Test
	public void testA_02_burbujaMejorada_caso02_otroArrayReales_reversed() {
		//Partimos del array ordenado
		OrdenacionArray.burbujaMejoradoFlag(otroArrayReales);
		// Reverse 'otroArrayReales'
		int n = otroArrayReales.length;
		double temp;
		for (int i = 0; i < n / 2; i++) {
			temp = otroArrayReales[i];
			otroArrayReales[i] = otroArrayReales[n - i - 1];
			otroArrayReales[n - i - 1] = temp;
		}
		salidaArray = Arrays.toString(otroArrayReales);
		salidaEsperadaArray = "[27.2, 23.6, 17.1, 10.2, 8.9, 7.7, 5.1, 2.4, 0.3, -4.5, -13.8, -15.3]";
		assertEquals(salidaEsperadaArray, salidaArray);
	}

	/*
	 * testA_03: testeando el metodo seleccion en array de reales
	 */

	@Test
	public void testA_03_seleccion_caso01_otroArrayReales() {
		OrdenacionArray.seleccion(otroArrayReales);
		salidaArray = Arrays.toString(otroArrayReales);
		salidaEsperadaArray = "[-15.3, -13.8, -4.5, 0.3, 2.4, 5.1, 7.7, 8.9, 10.2, 17.1, 23.6, 27.2]";
		assertEquals(salidaEsperadaArray, salidaArray);
	}

	@Test
	public void testA_03_seleccion_caso02_otroArrayReales_swapped() {
		double temp;
		//Partimos del array ordenado
		OrdenacionArray.burbujaMejoradoFlag(otroArrayReales);

		// Some swaps
		temp = otroArrayReales[0];
		otroArrayReales[0] = otroArrayReales[3];
		otroArrayReales[3] = temp;
		temp = otroArrayReales[5];
		otroArrayReales[5] = otroArrayReales[10];
		otroArrayReales[10] = temp;
		temp = otroArrayReales[7];
		otroArrayReales[7] = otroArrayReales[11];
		otroArrayReales[11] = temp;

		salidaArray = Arrays.toString(otroArrayReales);
		salidaEsperadaArray = "[0.3, -13.8, -4.5, -15.3, 2.4, 23.6, 7.7, 27.2, 10.2, 17.1, 5.1, 8.9]";
		assertEquals(salidaEsperadaArray, salidaArray);

		OrdenacionArray.seleccion(otroArrayReales);
		salidaArray = Arrays.toString(otroArrayReales);
		salidaEsperadaArray = "[-15.3, -13.8, -4.5, 0.3, 2.4, 5.1, 7.7, 8.9, 10.2, 17.1, 23.6, 27.2]";
		assertEquals(salidaEsperadaArray, salidaArray);
	}	
	
	/*
	 * testB   : testeando arrays de Comparables (Fraccion)
	 * testB_01: testeando el metodo toString de array de Comparables, y la ordenacion con Array.sort()
	 */

	@Test
	public void testB_01_ArrayToString_caso01_arrayFracciones() {
		salidaArray = Arrays.toString(arrayFracciones);
		salidaEsperadaArray = "[3/2, 5/3, 1/-6, 1/7, 1/-2, 1/5, 2/5, 7/3, 4/-3, -2/7, 6/7, 3/5, -2/3, 3/7]";
		assertEquals(salidaEsperadaArray, salidaArray);
	}

	/*
	 * testB_02: testeando los metodos burbuja y seleccion en array de Comparables
	 */

	@Test
	public void testB_02_burbuja_caso01_arrayFracciones() {
		OrdenacionArray.burbuja(arrayFracciones);
		salidaArray = Arrays.toString(arrayFracciones);
		salidaEsperadaArray = "[4/-3, -2/3, 1/-2, -2/7, 1/-6, 1/7, 1/5, 2/5, 3/7, 3/5, 6/7, 3/2, 5/3, 7/3]";
		assertEquals(salidaEsperadaArray, salidaArray);
	}

	@Test
	public void testB_03_burbujaMejorada_caso01_arrayFracciones() {
		OrdenacionArray.burbujaMejoradoFlag(arrayFracciones);
		salidaArray = Arrays.toString(arrayFracciones);
		salidaEsperadaArray = "[4/-3, -2/3, 1/-2, -2/7, 1/-6, 1/7, 1/5, 2/5, 3/7, 3/5, 6/7, 3/2, 5/3, 7/3]";
		assertEquals(salidaEsperadaArray, salidaArray);
	}
	
	@Test
	public void testB_04_burbujaMejorada_caso2_burbuja() {
		// Copiamos el arrayFracciones en otro array temporal
		Fraccion [] arrayFraccionesTemp = new Fraccion[arrayFracciones.length];
		for (int i = 0; i < arrayFracciones.length; i++)
			arrayFraccionesTemp[i] = new Fraccion(arrayFracciones[i]);
		
		// Ordenamos el array arrayFracciones por el metodo de burbuja
		OrdenacionArray.burbuja(arrayFracciones);
		
		// Ordenamos el array arrayFraccionesTemp por el metodo de burbuja mejorado
		OrdenacionArray.burbujaMejoradoFlag(arrayFraccionesTemp);

		salidaArray = Arrays.toString(arrayFracciones);
		salidaEsperadaArray = Arrays.toString(arrayFraccionesTemp);
		assertEquals(salidaEsperadaArray, salidaArray);
	}


	@Test
	public void testB_05_seleccion_caso01_arrayFracciones() {
		OrdenacionArray.seleccion(arrayFracciones);
		salidaArray = Arrays.toString(arrayFracciones);
		salidaEsperadaArray = "[4/-3, -2/3, 1/-2, -2/7, 1/-6, 1/7, 1/5, 2/5, 3/7, 3/5, 6/7, 3/2, 5/3, 7/3]";
		assertEquals(salidaEsperadaArray, salidaArray);
	}

	@Test
	public void testB_06_seleccion_caso02_arrayFracciones_reversed() {
		// Partimos del array ordenado
		OrdenacionArray.seleccion(arrayFracciones);

		// Invertir array
		for (int i = 0; i < arrayFracciones.length / 2; i++) {
			Fraccion tempFraccion = arrayFracciones[i];
			arrayFracciones[i] = arrayFracciones[arrayFracciones.length - i - 1];
			arrayFracciones[arrayFracciones.length - i - 1] = tempFraccion;
		}

		salidaArray = Arrays.toString(arrayFracciones);
		salidaEsperadaArray = "[7/3, 5/3, 3/2, 6/7, 3/5, 3/7, 2/5, 1/5, 1/7, 1/-6, -2/7, 1/-2, -2/3, 4/-3]";
		assertEquals(salidaEsperadaArray, salidaArray);
	}

	@Test
	public void testB_07_seleccion_caso03_burbujaMejorada() {
		// Copiamos el arrayFracciones en otro array temporal
		Fraccion [] arrayFraccionesTemp = new Fraccion[arrayFracciones.length];
		for (int i = 0; i < arrayFracciones.length; i++)
			arrayFraccionesTemp[i] = new Fraccion(arrayFracciones[i]);
		
		// Ordenamos el array arrayFracciones por el metodo de seleccion
		OrdenacionArray.seleccion(arrayFracciones);
		
		// Ordenamos el array arrayFraccionesTemp por el metodo de burbuja mejorada
		OrdenacionArray.burbujaMejoradoFlag(arrayFraccionesTemp);

		salidaArray = Arrays.toString(arrayFracciones);
		salidaEsperadaArray = Arrays.toString(arrayFraccionesTemp);
		assertEquals(salidaEsperadaArray, salidaArray);
	}

	@Test
	public void testB_08_seleccion_caso04_sort() {
		// Copiamos el arrayFracciones en otro array temporal
		Fraccion [] arrayFraccionesTemp = new Fraccion[arrayFracciones.length];
		for (int i = 0; i < arrayFracciones.length; i++)
			arrayFraccionesTemp[i] = new Fraccion(arrayFracciones[i]);
		
		// Ordenamos el array arrayFracciones por el metodo de seleccion
		OrdenacionArray.seleccion(arrayFracciones);
		
		// Ordenamos el array arrayFraccionesTemp con Arrays.sort
		Arrays.sort(arrayFraccionesTemp);

		salidaArray = Arrays.toString(arrayFracciones);
		salidaEsperadaArray = Arrays.toString(arrayFraccionesTemp);
		assertEquals(salidaEsperadaArray, salidaArray);
	}
}
