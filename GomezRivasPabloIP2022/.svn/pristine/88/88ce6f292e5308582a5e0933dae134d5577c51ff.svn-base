package org.ip.sesion06;

public class Reloj {
	
	private int hora;
	private int minuto;
	private int segundo;
	
	public Reloj() {
		this.segundo = 0;
		this.minuto = 0;
		this.hora = 0;
	}
	
	public Reloj(int hora, int minuto, int segundo) {
		if (segundo>=0 && segundo<=59) {
			this.segundo = segundo;
		} else {
			this.segundo = 0;
		}
		
		if (minuto>=0 && minuto<=59) {
			this.minuto = minuto;
		} else {
			this.minuto = 0;
		}
		
		if (hora>=0 && hora<=23) {
			this.hora = hora;
		} else {
			this.hora = 0;
		}
	}
	
	public Reloj(Reloj reloj) {
		this.segundo = reloj.segundo;
		this.minuto = reloj.minuto;
		this.hora = reloj.segundo;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		if (hora>=0 && hora<=23) {
			this.hora = hora;
		} else {
			this.hora = 0;
		}
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		if (minuto>=0 && minuto<=59) {
			this.minuto = minuto;
		} else {
			this.minuto = 0;
		}
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		if (segundo>=0 && segundo<=59) {
			this.segundo = segundo;
		} else {
			this.segundo = 0;
		}
	}
	
	public void mostrarReloj() {
		System.out.printf("%02d", hora);
		System.out.print(":");
		System.out.printf("%02d", minuto);
		System.out.print(":");
		System.out.printf("%02d", segundo);
		System.out.println();
	}
	
	public void incrementaHora() {
		if(hora == 23) {
			this.hora = 0;
		} else {
			this.hora+=1;
		}
	}
	
	public void incrementaMinuto() {
		if(minuto == 59) {
			this.minuto = 0;
			incrementaHora();
		} else {
			this.minuto+=1;
		}
	}
	
	public void incrementaSegundo() {
		if(segundo == 59) {
			this.segundo = 0;
			incrementaMinuto();
		} else {
			this.segundo+=1;
		}
	}
	
}
