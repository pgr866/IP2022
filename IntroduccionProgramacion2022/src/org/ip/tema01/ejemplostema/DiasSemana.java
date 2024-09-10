package org.ip.tema01.ejemplostema;

/*
 * Dado un numero comprendido entre el 1 y el 7, muestre el dia de
 * la semana con el que se corresponde
 */
public class DiasSemana {

	public static void main(String[] args) {
		int dia = 0;
		switch (dia) {
			case 1:
				System.out.println("Lunes");
				break;
			case 2:
				System.out.println("Martes");
				break;
			case 3:
				System.out.println("Miercoles");
				break;
			case 4:
				System.out.println("Jueves");
				break;
			case 5:
				System.out.println("Viernes");
				break;
			case 6:
				System.out.println("Sabado");
				break;
			case 7:
				System.out.println("Domingo");
				break;
			default:
				System.out.println("Dia sin coincidencia");
		}
	}
}
