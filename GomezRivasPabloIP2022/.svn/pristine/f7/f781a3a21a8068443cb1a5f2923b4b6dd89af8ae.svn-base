package org.ip.sesion06;

public class TestReloj {
	
	public static void main(String[] args) {
		
		Reloj reloj1 = new Reloj();
		reloj1.setHora(23);
		reloj1.setMinuto(59);
		reloj1.setSegundo(59);
		reloj1.mostrarReloj();
		reloj1.incrementaSegundo();
		reloj1.mostrarReloj();
		System.out.println();
		
		Reloj reloj2 = new Reloj(24, 60, 60);
		reloj2.mostrarReloj();
		reloj2.incrementaSegundo();
		reloj2.incrementaMinuto();
		reloj2.incrementaHora();
		reloj2.mostrarReloj();
		System.out.println();
		
		Reloj reloj3 = new Reloj(reloj1);
		reloj3.mostrarReloj();
		for(int i = 1;i<=86400;i++) {
			reloj3.incrementaSegundo();
		}
		reloj3.mostrarReloj();
		System.out.println();
		
		Reloj reloj4 = new Reloj(reloj1);
		reloj4.mostrarReloj();
		for(int i = 1;i<=1440;i++) {
			reloj4.incrementaMinuto();
		}
		reloj4.mostrarReloj();
		System.out.println();
		
		Reloj reloj5 = new Reloj(reloj1);
		reloj5.mostrarReloj();
		for(int i = 1;i<=24;i++) {
			reloj5.incrementaHora();
		}
		reloj5.mostrarReloj();
		
	}
}
