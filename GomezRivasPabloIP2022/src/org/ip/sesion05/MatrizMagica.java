package org.ip.sesion05;

import java.util.Scanner;

public class MatrizMagica {
	
	public static boolean esMatrizMagica(int [][] matriz) {
		boolean filaMagica = false;
		int suma = 0;
		int memoria = 0;
		for(int i=0;i<4;i++) {
			
			for(int j=0;j<4;j++) {
				suma += matriz[i][j];
			}
			if((i==0) || (i>0 && filaMagica == true && memoria==suma)) {
				filaMagica = true;
			} else {
				filaMagica = false;
			}
			memoria = suma;
			suma = 0;
		}
		
		boolean columnaMagica = false;
		suma = 0;
		memoria = 0;
		
		for(int j=0;j<4;j++) {
			
			for(int i=0;i<4;i++) {
				suma += matriz[i][j];
			}
			if((j==0) || (j>0 && columnaMagica == true && memoria==suma)) {
				columnaMagica = true;
			} else {
				columnaMagica = false;
			}
			memoria = suma;
			suma = 0;
		}
		
		if(filaMagica && columnaMagica) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int [][] matriz = new int [4][4];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("M[" + i + "][" + j + "]: ");
				matriz[i][j] = entrada.nextInt();
			}
		}
		if (MatrizMagica.esMatrizMagica(matriz)) {
			System.out.println("La matriz es magica");
		} else {
			System.out.println("La matriz no es magica");
		}
		
	}
}
