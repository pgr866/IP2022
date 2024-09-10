package org.ip.sesion08;

import static org.junit.Assert.*;

import org.ip.sesion07.Fraccion;
import org.junit.Before;
import org.junit.Test;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ArrayFraccionesTestJUnit5 {

	ArrayFracciones arrayFracciones1;
	ArrayFracciones arrayFracciones2;
	ArrayFracciones arrayFracciones3;

	@Before
	public void setUp() throws Exception {
		Fraccion [] fracciones = {new Fraccion(8, 9), new Fraccion(11, -21), new Fraccion(1, 3),
				new Fraccion(1, 7), new Fraccion(7, 5), new Fraccion(11, 9), new Fraccion(-3, 13)};

		arrayFracciones1 = new ArrayFracciones(5);
		arrayFracciones2 = new ArrayFracciones(fracciones);
		arrayFracciones3 = new ArrayFracciones(arrayFracciones2);
	}

	@Test
	public void testA_ArrayFraccionesComprobarMetodos() {
		assertTrue("Error: El numero fracciones del array2 deberia ser 7 y es " + arrayFracciones2.getNumeroElementos(), arrayFracciones2.getNumeroElementos() == 7);
		assertTrue("Error: El numero fracciones del array3 deberia ser 7 y es " + arrayFracciones3.getNumeroElementos(), arrayFracciones3.getNumeroElementos() == 7);
		assertTrue("Error: El valor del elemento [2] del array1 deberia ser 0 y es " + arrayFracciones1.getValorElemento(2), arrayFracciones1.getValorElemento(2).equals(new Fraccion()));
		arrayFracciones1.setArray(new Fraccion(1, 2));
		assertTrue("Error: El valor del elemento [2] del array1 deberia ser 1/2 y es " + arrayFracciones1.getValorElemento(2), arrayFracciones1.getValorElemento(2).equals(new Fraccion(1, 2)));
		assertTrue("Error: El valor del elemento [3] del array2 deberia ser 1/7 y es " + arrayFracciones2.getValorElemento(3), arrayFracciones2.getValorElemento(3).equals(new Fraccion(1, 7)));
		assertTrue(arrayFracciones2.setValorElemento(3, new Fraccion(5, 7)));
		assertTrue("Error: El valor del elemento [3] del array2 deberia ser 5/7 y es " + arrayFracciones2.getValorElemento(3), arrayFracciones2.getValorElemento(3).equals(new Fraccion(5, 7)));

		assertTrue("Error: El valor del elemento minimo del array3 deberia ser 11/-21 y es " + arrayFracciones3.getMinimo(), arrayFracciones3.getMinimo().equals(new Fraccion(11, -21)));
		assertTrue("Error: El valor del elemento maximo del array3 deberia ser 7/5 y es " + arrayFracciones3.getMaximo(), arrayFracciones3.getMaximo().equals(new Fraccion(7, 5)));
		assertTrue(arrayFracciones3.setValorElemento(0, new Fraccion(11, 3)));
		assertTrue("Error: El valor del elemento maximo del array3 deberia ser 11/3 y es " + arrayFracciones3.getMaximo(), arrayFracciones3.getMaximo().equals(new Fraccion(11, 3)));
		assertTrue("Error: El valor de los elementos maximo y minimo del array1 deberian ser 1/2 y son " + arrayFracciones1.getMinimo() + " y " + arrayFracciones1.getMaximo(), arrayFracciones1.getMinimo().equals(arrayFracciones1.getMaximo()));

		assertTrue("Error: El valor suma del array1 deberia ser 5/2 y es " + arrayFracciones1.getSumaArray(), arrayFracciones1.getSumaArray().equals(new Fraccion(5, 2)));
		assertTrue("Error: El valor suma del array2 deberia ser 15578/4095 y es " + arrayFracciones2.getSumaArray(), arrayFracciones2.getSumaArray().equals(new Fraccion(15578, 4095)));
		assertTrue("Error: El valor suma del array3 deberia ser 24613/4095 y es " + arrayFracciones3.getSumaArray(), arrayFracciones3.getSumaArray().equals(new Fraccion(24613, 4095)));
	}

	@Test
	public void testB_ArrayFraccionesToStringArray1() {
		arrayFracciones1.setArray(new Fraccion(1, 7));
		String salidaArray = arrayFracciones1.toString();
		String salidaEsperadaArray = "ArrayFracciones: [<1/7>, <1/7>, <1/7>, <1/7>, <1/7>]";
		assertEquals(salidaArray, salidaEsperadaArray);
	}

	@Test
	public void testC_ArrayFraccionesToStringArray2() {
		String salidaArray = arrayFracciones2.toString();
		String salidaEsperadaArray = "ArrayFracciones: [<8/9>, <11/-21>, <1/3>, <1/7>, <7/5>, <11/9>, <-3/13>]";
		assertEquals(salidaArray, salidaEsperadaArray);
	}

	@Test
	public void testD_ArrayFraccionesToStringArray3() {
		assertTrue(arrayFracciones3.setValorElemento(0, new Fraccion(11, 3)));
		assertTrue(arrayFracciones3.setValorElemento(4, new Fraccion(5, 13)));
		String salidaArray = arrayFracciones3.toString();
		String salidaEsperadaArray = "ArrayFracciones: [<11/3>, <11/-21>, <1/3>, <1/7>, <5/13>, <11/9>, <-3/13>]";
		assertEquals(salidaArray, salidaEsperadaArray);
	}

	@Test
	public void testE_ArrayFraccionesEqualsCompareTo() {
		ArrayFracciones arrayFracciones4 = new ArrayFracciones(7);
		for (int i = 0; i < arrayFracciones4.getNumeroElementos(); i++)
			arrayFracciones4.setValorElemento(i, new Fraccion(i, i + 1));

		assertTrue("Error: El valor suma del array4 deberia ser 617/140 y es " + arrayFracciones4.getSumaArray(), arrayFracciones4.getSumaArray().equals(new Fraccion(617, 140)));
		assertTrue(arrayFracciones4.setValorElemento(0, new Fraccion(-17, 3)));
		assertTrue("Error: El valor suma del array4 deberia ser -529/420 y es " + arrayFracciones4.getSumaArray(), arrayFracciones4.getSumaArray().equals(new Fraccion(-529, 420)));

		assertTrue(arrayFracciones1.equals(arrayFracciones2) == false);
		assertTrue(arrayFracciones2.equals(arrayFracciones3) == true);
		assertTrue(arrayFracciones3.equals(arrayFracciones4) == false);

		assertTrue(arrayFracciones1.compareTo(arrayFracciones2) == -1);
		assertTrue(arrayFracciones2.compareTo(arrayFracciones1) == 1);
		assertTrue(arrayFracciones2.compareTo(arrayFracciones3) == 0);
		assertTrue(arrayFracciones3.compareTo(arrayFracciones4) == 1);

		ArrayFracciones arrayFracciones5 = new ArrayFracciones(arrayFracciones4);
		assertTrue(arrayFracciones4.equals(arrayFracciones5) == true);
		assertTrue(arrayFracciones4.compareTo(arrayFracciones5) == 0);
	}
	
	@Test
	public void testF_ArrayFraccionesNuevoTest() {
		ArrayFracciones arrayFracciones4 = new ArrayFracciones(5);
		int potencia = 2;
		for (int i = 0; i < arrayFracciones4.getNumeroElementos(); i++) {
			Fraccion frac = arrayFracciones4.getValorElemento(i);
			frac.setNumerador(i + 1);
			frac.setDenominador(potencia);
			arrayFracciones4.setValorElemento(i, frac);
			potencia *= 2;
		}
		
		arrayFracciones1.setArray(new Fraccion(1, 2));

		assertTrue(arrayFracciones1.equals(arrayFracciones4) == false);
		assertTrue(arrayFracciones1.compareTo(arrayFracciones4) == 1);
		assertTrue(arrayFracciones1.getNumeroElementos() == arrayFracciones4.getNumeroElementos());
		assertTrue("Error: El valor suma del array4 deberia ser 57/32 y es " + arrayFracciones4.getSumaArray(), arrayFracciones4.getSumaArray().equals(new Fraccion(57, 32)));
		assertTrue("Error: El valor suma del array4 deberia ser 5/2 y es " + arrayFracciones1.getSumaArray(), arrayFracciones1.getSumaArray().equals(new Fraccion(5, 2)));
		assertTrue("Error: El valor del elemento minimo del array4 deberia ser 5/32 y es " + arrayFracciones4.getMinimo(), arrayFracciones4.getMinimo().equals(new Fraccion(5, 32)));
		assertTrue("Error: El valor del elemento maximo del array4 deberia ser 1/2 y es " + arrayFracciones4.getMaximo(), arrayFracciones4.getMaximo().equals(new Fraccion(1, 2)));
	}
}
