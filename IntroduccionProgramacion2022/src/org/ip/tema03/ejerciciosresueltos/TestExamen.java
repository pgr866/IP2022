package org.ip.tema03.ejerciciosresueltos;

public class TestExamen {

	public static void main(String[] args) {
		Fecha fecha = new Fecha(4, 2, 2017);
		Hora hora = new Hora(9, 0);
		Examen iP = new Examen("Introducion a la Programacion", "Aulario III", "Aula 7", fecha, hora);
		System.out.println(iP.toString());
		iP.setFecha(new Fecha(7, 2, 2017));
		iP.setHora(new Hora(12, 0));
		System.out.println(iP.toString());
	}
}
