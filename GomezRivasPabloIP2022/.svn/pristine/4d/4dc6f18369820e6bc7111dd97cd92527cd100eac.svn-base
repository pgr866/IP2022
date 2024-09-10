package org.ip.sesion02;

public class FechaCorrecta {

	public static void main(String[] args) {
		
		int dia = 29;
		int mes = 2;
		int anio = 2020;
		boolean bisiesto = (anio%4 == 0 && anio%100 != 0 || anio%400 == 0);
		if (anio >= 1500 || anio <= 3000) {
			switch (mes) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if (dia >= 1 && dia <= 31) {
						System.out.println("Fecha correcta: " + dia + "/" + mes + "/" + anio);
					} else {
						System.out.println("Fecha incorrecta - " + dia + "/" + mes + "/" + anio);
					}
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					if (dia >= 1 && dia <=  30) {
						System.out.println("Fecha correcta: " + dia + "/" + mes + "/" + anio);
					} else {
						System.out.println("Fecha incorrecta - " + dia + "/" + mes + "/" + anio);
					}
					break;
				case 2:
					if (dia >=1 && dia <= 28 && !bisiesto) {
						System.out.println("Fecha correcta: " + dia + "/" + mes + "/" + anio);
					} else if  (dia >=1 && dia <= 29 && bisiesto) {
						System.out.println("Fecha correcta: " + dia + "/" + mes + "/" + anio);	
					} else {
						System.out.println("Fecha incorrecta - " + dia + "/" + mes + "/" + anio);
					}
				}
			} else {
				System.out.println("Fecha incorrecta - " + dia + "/" + mes + "/" + anio);	
		}
	}
}
