package org.ip.sesion07;

import org.ip.sesion07.Hora12.Meridiano;

public class TestHora {
	
	public static void main(String[] args) {
		
		Hora reloj = new Hora(11, 30);
		System.out.println(reloj);
		
		for (int i = 1; i <= 61; i++) {
			reloj.incrementar();
			}
		System.out.println(reloj);
		
		reloj.setHora(23);
		System.out.println(reloj);
		
		for (int i = 1; i <= 61; i++) {
			reloj.incrementar();
			}
		System.out.println(reloj);
		System.out.println();
		
		
		Hora12 reloj12 = new Hora12(11, 10, Meridiano.AM);
		System.out.println(reloj12);
		
		reloj12.setHora(12);
		reloj12.setMinuto(11);
		System.out.println(reloj12);
		System.out.println(reloj12);
		
		for (int i = 1; i <= 61; i++) {
			reloj12.incrementar();
			}
		System.out.println(reloj12);
		System.out.println();
		
		
		HoraExacta relojExacto = new HoraExacta(0, 0, 31);
		System.out.println("Hora Exacta del reloj: " + relojExacto);
		
		relojExacto.setSegundo(32);
		relojExacto.setMinuto(1);
		System.out.println("Hora Exacta del reloj: " + relojExacto);
		
		relojExacto.setHora(23);
		System.out.println("Hora Exacta del reloj: " + relojExacto);
		
		for (int i = 1; i <= 4000; i++) {
			relojExacto.incrementar();
			}
		System.out.println("Hora Exacta del reloj: " + relojExacto);
		System.out.println();
		
		System.out.println("COMPROBACION DE MOMENTOS EXACTOS");
		
		HoraExacta momentoExacto1 = new HoraExacta (1, 2, 3);
		HoraExacta momentoExacto2 = new HoraExacta (1, 2, 3);
		HoraExacta momentoExacto3 = new HoraExacta (10, 20, 30);
		
		System.out.println("Los momentos exactos son: " + momentoExacto1 + ", " + momentoExacto2 + " y " + momentoExacto3);
		
		if(momentoExacto1.equals(momentoExacto2)) {
			System.out.println(momentoExacto1 + " ES IGUAL A " + momentoExacto2);
		} else {
			System.out.println(momentoExacto1 + " NO ES IGUAL A " + momentoExacto2);
		}
		
		if(momentoExacto1.equals(momentoExacto3)) {
			System.out.println(momentoExacto1 + " ES IGUAL A " + momentoExacto3);
		} else {
			System.out.println(momentoExacto1 + " NO ES IGUAL A " + momentoExacto3);
		}
		
		if(momentoExacto1.compareTo(momentoExacto3) == 0) {
			System.out.println(momentoExacto1 + " ES IGUAL A " + momentoExacto3);
		} else if(momentoExacto1.compareTo(momentoExacto3) == 1) {
			System.out.println(momentoExacto1 + " ES MAYOR QUE " + momentoExacto3);
		} else {
			System.out.println(momentoExacto1 + " ES MENOR QUE " + momentoExacto3);
		}
		
		if(momentoExacto3.compareTo(momentoExacto2) == 0) {
			System.out.println(momentoExacto3 + " ES IGUAL A " + momentoExacto2);
		} else if(momentoExacto3.compareTo(momentoExacto2) == 1) {
			System.out.println(momentoExacto3 + " ES MAYOR QUE " + momentoExacto2);
		} else {
			System.out.println(momentoExacto3 + " ES MENOR QUE " + momentoExacto2);
		}
		
		if(momentoExacto1.compareTo(momentoExacto2) == 0) {
			System.out.println(momentoExacto1 + " ES IGUAL A " + momentoExacto2);
		} else if(momentoExacto1.compareTo(momentoExacto2) == 1) {
			System.out.println(momentoExacto1 + " ES MAYOR QUE " + momentoExacto2);
		} else {
			System.out.println(momentoExacto1 + " ES MENOR QUE " + momentoExacto2);
		}
		
	}
}
