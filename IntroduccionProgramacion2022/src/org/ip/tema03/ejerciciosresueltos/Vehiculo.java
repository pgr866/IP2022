package org.ip.tema03.ejerciciosresueltos;

public class Vehiculo {

	private String marca;
	private String modelo;
	private String matricula;
	private double velocidad;

	public Vehiculo(String marca, String modelo, String matricula, double velocidad) {
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.velocidad = velocidad;
	}

	public Vehiculo(String marca, String modelo, String matricula) {
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.velocidad = 0.0;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public String toString() {
		return "El vehiculo con marca:" + marca + ", modelo:" + modelo + " y matricula:" + matricula
				+ " va a una velocidad de:" + velocidad + " km/h";
	}

	public void acelerar(double cantidad) throws DemasiadoRapidoException {
		if ((velocidad + cantidad) > 120)
			throw new DemasiadoRapidoException("Limite de velocidad sobrepasado por el vehiculo");
		velocidad += cantidad;
	}

	public void frenar(double cantidad) throws DemasiadoRapidoException {
		if ((velocidad - cantidad) < 0)
			throw new DemasiadoRapidoException("El vehiculo se para repentinamente");
		velocidad -= cantidad;
	}
}
