package org.ip.tema03.ejerciciosresueltos;

public class Camion extends Vehiculo {

	private Remolque remolque;

	public Camion(String marca, String modelo, String matricula) {
		super(marca, modelo, matricula);
		this.remolque = null;
	}

	public Remolque getRemolque() {
		return remolque;
	}

	public void setRemolque(Remolque remolque) {
		this.remolque = remolque;
	}

	public void ponerRemolque(Remolque remolque) {
		setRemolque(remolque);
	}

	public void quitarRemolque() {
		this.remolque = null;
	}

	@Override
	public String toString() {
		if (remolque != null)
			return "Camion => " + super.toString() + ". Lleva un " + remolque.toString();
		else
			return "Camion => " + super.toString();
	}

	@Override
	public void acelerar(double cantidad) throws DemasiadoRapidoException {
		if ((remolque != null) && ((cantidad + getVelocidad()) > 100))
			throw new DemasiadoRapidoException("Camion demasiado rapido");
		super.acelerar(cantidad);
	}

	@Override
	public void frenar(double cantidad) throws DemasiadoRapidoException {
		if ((remolque != null) && ((cantidad - getVelocidad()) < 0))
			throw new DemasiadoRapidoException("Camion se para repentinamente");
		super.frenar(cantidad);
	}
}
