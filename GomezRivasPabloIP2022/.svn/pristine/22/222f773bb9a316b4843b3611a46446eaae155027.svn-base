package org.ip.sesion05;

public class PracticarConArrays {
	
	public static int [] invertir(int [] array) {
		int [] arrayInvertido = new int[array.length];
		for (int i=0;i<array.length;i++) {
			arrayInvertido[array.length-i-1] = array[i];
		}
		return arrayInvertido;
	}
	public static void desplazar(int [] array) {
		
		int desplazamiento=5;
		
		for(int i=0;i<desplazamiento;i++) {
			int cero = array[0];
			for (int j=0;j<array.length-1;j++) {
				array[j] = array[j+1];
			}
			array[array.length-1] = cero;
		}
		if(desplazamiento==1) {
			System.out.println("Desplazando el array una posicion ...");
		} else {
			System.out.println("Desplazando el array " + desplazamiento + " posiciones ...");
		}
		PracticarConArrays.mostrarArray(array);
		
	}
	public static int indiceMaximoValor(int [] array) {
		int max = array[0];
		int indMax = 0;
		for (int i=0;i<array.length;i++) {
			if (array[i]>max) {
				max = array[i];
				indMax = i;
			}
		}
		return indMax;
	}
	public static int indiceMinimoValor(int [] array) {
		int min = array[0];
		int indMin = 0;
		for (int i=0;i<array.length;i++) {
			if (array[i]<min) {
				min = array[i];
				indMin = i;
			}
		}
		return indMin;
	}
	public static int [] eliminarDuplicados(int [] array) {
		int elementos=0;
		boolean duplicado;
		for(int i=0;i<array.length;i++) {
			duplicado = false;
			for(int j=0;j<i;j++) {
				if(array[i]==array[j]) {
					duplicado = true;
				}
			}
			if (!duplicado) {
				elementos++;
			}
		}
		
		int [] arraySinDuplicados = new int[elementos];
		int k=0;
		for(int i=0;i<array.length;i++) {
			duplicado = false;
			for(int j=0;j<i;j++) {
				if(array[i]==array[j]) {
					duplicado = true;
				}
			}
			if (!duplicado) {
				arraySinDuplicados[k]=array[i];
				k++;
			}
		}
		return arraySinDuplicados;
	}
	public static void mostrarArray(int [] array) {
		System.out.print("Array de Enteros: [");
		for (int i=0;i<array.length;i++) {
			if (i==array.length-1) {
				System.out.print(array[i] + "]");
			} else {
				System.out.print(array[i] + ", ");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int [] array = {5, 10, 15, 2, 4, 23, 7, 13, 8, 17, 27};
		int [] array2 = {1, 1, 3, 2, 1, 6, 3, 4, 4, 4, 5, 2, 1, 2, 6, 4, 7, 5, 6, 7, 1, 8};
		
		PracticarConArrays.mostrarArray(array);
		System.out.println("Indice del menor valor del array de enteros: " + PracticarConArrays.indiceMinimoValor(array));
		System.out.println("Indice del mayor valor del array de enteros: " + PracticarConArrays.indiceMaximoValor(array));
		PracticarConArrays.mostrarArray(PracticarConArrays.invertir(array));
		System.out.println("Indice del menor valor del array invertido: " + PracticarConArrays.indiceMinimoValor(PracticarConArrays.invertir(array)));
		System.out.println("Indice del mayor valor del array invertido: " + PracticarConArrays.indiceMaximoValor(PracticarConArrays.invertir(array)));
		PracticarConArrays.desplazar(array);
		PracticarConArrays.mostrarArray(array2);
		PracticarConArrays.mostrarArray(PracticarConArrays.eliminarDuplicados(array2));
		
	}
}