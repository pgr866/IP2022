package org.ip.tema03.ejerciciosresueltos;

public class ArrayEnteros implements Comparable<Object> {

	private int [] array;

	public ArrayEnteros(int numeroElementos) {
		array = new int [numeroElementos];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
	}

	public ArrayEnteros(int[] array) {
		this.array = new int [array.length];
		for (int i = 0; i < array.length; i++) {
			this.array[i] = array[i];
		}
	}

	public ArrayEnteros(ArrayEnteros arrayEnteros) {
		this.array = new int [arrayEnteros.getNumeroElementos()];
		for (int i = 0; i < arrayEnteros.getNumeroElementos(); i++) {
			this.array[i] = arrayEnteros.getValorElemento(i);
		}
	}

	public int [] getArray() {
		return array;
	}

	public void setArray(int valor) {
		for (int i = 0; i < array.length; i++) {
			array[i] = valor;
		}
	}

	public int getNumeroElementos() {
		return array.length;
	}

	public int getValorElemento(int posicion) {
		if ((posicion < 0) || (posicion > array.length - 1)) throw new RuntimeException("Valor de posicion fuera de rango");
		return array[posicion];
	}

	public boolean setValorElemento(int posicion, int valor) {
		if ((posicion < 0) || (posicion > array.length - 1))
			return false;
		array[posicion] = valor;
		return true;
	}

	public int getRangoValores() {
		int minValue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < minValue)
				minValue = array[i];
			if (array[i] > maxValue)
				maxValue = array[i];
		}
		return maxValue - minValue;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		if (!(obj instanceof ArrayEnteros))
			return false;
		ArrayEnteros other = (ArrayEnteros) obj;

		if (array.length != other.getNumeroElementos())
			return false;
		boolean equal = true;
		for (int i = 0; (i < array.length) && (equal); i++) {
			if (array[i] != other.getValorElemento(i))
				equal = false;
		}
		return equal;
	}

	@Override
	public String toString() {
		String salida = "Array: [";
		for (int i = 0; i < array.length; i++) {
			if (i != array.length - 1)
				salida += array[i] + "\t";
			else
				salida += array[i];
		}
		salida += "]";
		return salida;
	}

	@Override
	public int compareTo(Object obj) {
		ArrayEnteros otraMatriz = (ArrayEnteros) obj;
		if (this.getRangoValores() > otraMatriz.getRangoValores()){
			return 1;
		}
		else if (this.getRangoValores() < otraMatriz.getRangoValores()){
			return -1;
		}
		else
			return 0;
	}

}
