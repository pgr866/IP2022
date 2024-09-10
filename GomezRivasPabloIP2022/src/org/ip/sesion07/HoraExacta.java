package org.ip.sesion07;

public class HoraExacta extends Hora implements Comparable {
	
	private int segundo;
	
	public HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto);
		if (segundo>=0 && segundo<=59) {
			this.segundo = segundo;
		} else {
			this.segundo = 0;
		}
	}
	
	public int getSegundo() {
		return segundo;
	}
	
	public void setSegundo(int segundo) {
		if (segundo>=0 && segundo<=59) {
			this.segundo = segundo;
		}
	}
	
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public void incrementar() {
		if (segundo == 59) {
			segundo = 0;
			if (minuto == 59) {
				minuto = 0;
				if(hora == 23) {
					hora = 0;
				}
			} else {
				minuto += 1;
			}
		} else {
			segundo += 1;
		}
	}
	
	@Override
	public String toString() {
		return hora + ":" + minuto + ":" + segundo;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HoraExacta other = (HoraExacta) obj;
		if (hora != other.hora)
			return false;
		if (minuto != other.minuto)
			return false;
		if (segundo != other.segundo)
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Object obj) {
		HoraExacta otro = (HoraExacta) obj;
		if (hora == otro.hora) {
			if (minuto == otro.minuto) {
				if (segundo == otro.segundo)
					return 0;
					else if (segundo < otro.segundo)
					return -1;
				else
					return 1;
			} else if (minuto < otro.minuto)
				return -1;
			else
				return 1;
		} else if (hora < otro.hora)
			return -1;
		else
			return 1;
	}
}
