package org.ip.sesion08;

import org.ip.sesion07.Fraccion;

public class ArrayFracciones implements Comparable{
	
	private Fraccion[] array;
	
	public ArrayFracciones(int numeroElementos) {
		
		this.array = new Fraccion[numeroElementos];
		
		for(int i=0;i<numeroElementos;i++) {
			this.array[i] = new Fraccion();
		}
		
	}
	
	public ArrayFracciones(Fraccion[] array) {
		
		this.array = new Fraccion[array.length];
		
		for(int i=0;i<array.length;i++) {
			this.array[i] = array[i];
		}
		
	}
	
	public ArrayFracciones(ArrayFracciones arrayFracciones) {
		
		this.array = new Fraccion[arrayFracciones.array.length];
		
		for(int i=0;i<arrayFracciones.array.length;i++) {
			this.array[i] = arrayFracciones.array[i];
		}
		
	}

	public Fraccion[] getArray() {
		return array;
	}
	
	 public int getNumeroElementos() {
		 return array.length;
	 }

	public void setArray(Fraccion valor) {
		for(int i=0;i<array.length;i++) {
			array[i] = valor;
		}
	}
	
	public Fraccion getValorElemento(int posicion) {
		if(posicion>=0 && posicion<=array.length-1) {
			return array[posicion];
		}
		return null;
	}
	
	public boolean setValorElemento(int posicion, Fraccion valor) {
		if(posicion>=0 && posicion<=array.length-1) {
			array[posicion] = valor;
			return true;
		}
		return false;
	}
	
	 public Fraccion getMinimo() {
		 Fraccion menor = array[0];
		 for(int i=0;i<array.length;i++) {
			 if(array[i].compareTo(menor)==-1)
				 menor = array[i];
		 }
		 return menor;
	 }
	
	 public Fraccion getMaximo() {
		 Fraccion maximo = array[0];
		 for(int i=0;i<array.length;i++) {
			 if(array[i].compareTo(maximo)==1)
				 maximo = array[i];
		 }
		 return maximo;
	 }
	 
	 public Fraccion getSumaArray() {
		 
		 Fraccion suma = new Fraccion(0, 1);
		 for(int i=0;i<array.length;i++) {
			suma = suma.sumar(array[i]);
		 }
		 return suma.simplificar();
	 }
	 
	 public String toString() {
		 String salida = "ArrayFracciones: [";
		 
		 for(int i=0;i<array.length;i++) {
			 if(i==array.length-1)
				 salida += "<" + array[i].toString() + ">]";
			 else
				 salida += "<" + array[i].toString() + ">, ";
		 }
		 return salida;
	 }
	 
	 public boolean equals(Object obj) {
		 ArrayFracciones otro = (ArrayFracciones) obj;
		 
		 if(!(this.array.length == otro.array.length))
			 return false;
		 
		 int contador = 0;
		 for(int i=0;i<this.array.length;i++) {
			 if(this.array[i].equals(otro.array[i]))
				 contador++;
		 }
		 if(contador == array.length)
			 return true;
		 
		 return false;
	 }
	 
	@Override
	public int compareTo(Object obj) {
		ArrayFracciones otro = (ArrayFracciones) obj;
		
		if(this.getSumaArray().equals(otro.getSumaArray()))
			return 0;
		
		if(this.getSumaArray().compareTo(otro.getSumaArray())==1)
			return 1;
		
		return -1;
	}
	
}
