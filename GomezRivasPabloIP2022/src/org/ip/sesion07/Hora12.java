package org.ip.sesion07;

public class Hora12 extends Hora{
	
	public enum Meridiano { AM, PM }
	protected Meridiano mer;
	
	public Hora12(int hora, int minuto, Meridiano mer) {
		super(hora, minuto);
		this.mer = mer;
		if (hora>=1 && hora<=12) {
			this.hora = hora;
		} else {
			this.hora = 12;
		}		
	}
	
	public void incrementar() {
		if (minuto == 59) {
			minuto = 0;
			if (hora == 12) {
				hora = 1;
				if(mer == mer.AM) {
					mer = mer.PM;
				} else {
					mer = mer.AM;
				}
			} else {
				hora += 1;
			}
		} else {
			minuto += 1; 
		}
	}
	
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public void setHora(int hora) {
		if (hora>=1 && hora<=12) {
			this.hora = hora;
		}
	}
	
	@Override
	public String toString() {
		return "Hora del reloj12: " + hora + ":" + minuto + " " + mer;
	}
	
}
