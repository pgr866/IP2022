package org.ip.tema03.ejerciciosresueltos;

public class Hora {

	private int hora;
	private int minuto;

	public Hora(int hora, int minuto) {
		if ((hora < 0) || (hora > 23) || (minuto < 0) || (minuto > 59)) {
			throw new IllegalArgumentException();
		}
		else {
			this.hora = hora;
			this.minuto = minuto;
		}
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	@Override
	public String toString() {
		return (hora < 10 ? "0" : "") + hora + ":" + (minuto < 10 ? "0" : "") + minuto;
	}

}
