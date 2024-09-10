package org.ip.sesion07;

public class Hora {
	
	protected int hora;
	protected int minuto;
	
	public Hora(int hora, int minuto) {
		super();
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
	
	public void incrementar() {
		if (minuto == 59) {
			minuto = 0;
			if (hora == 23) {
				hora = 0;
			} else {
				hora += 1;
			}
		} else {
			minuto += 1; 
		}
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		if (hora>=0 && hora<=23) {
			this.hora = hora;
		}
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		if (minuto>=0 && minuto<=59) {
			this.minuto = minuto;
		}
	}

	@Override
	public String toString() {
		return "Hora del reloj: " + hora + ":" + minuto;
	}
	
}
