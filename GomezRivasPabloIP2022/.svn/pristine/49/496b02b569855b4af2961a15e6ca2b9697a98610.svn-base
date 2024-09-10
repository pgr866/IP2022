package org.ip.sesion08;

public class Alumno implements Comparable {
	
	private String idPersonal;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private AsignaturaNota[] notasFinales;
	private int numAsignaturas;
	private double notaMediaFinal;
	
	public Alumno(String idPersonal, String nombre, String primerApellido, String segundoApellido, AsignaturaNota[] notasFinales) {
		
		super();
		this.idPersonal = idPersonal;
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		
		this.notasFinales = new AsignaturaNota[notasFinales.length];
		for(int i=0;i<this.notasFinales.length;i++) {
			this.notasFinales[i] = new AsignaturaNota(notasFinales[i].getAsignatura(), notasFinales[i].getNota());
		}
		this.numAsignaturas = notasFinales.length;
	}

	public Alumno(String idPersonal, String nombre, String primerApellido, String segundoApellido) {
		
		super();
		this.idPersonal = idPersonal;
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.numAsignaturas = 0;
		
	}
	
	public Alumno(Alumno alumno) {

		super();
		this.idPersonal = alumno.idPersonal;
		this.nombre = alumno.nombre;
		this.primerApellido = alumno.primerApellido;
		this.segundoApellido = alumno.segundoApellido;
		
		this.notasFinales = new AsignaturaNota[alumno.notasFinales.length];
		for(int i=0;i<this.notasFinales.length;i++) {
			this.notasFinales[i] = new AsignaturaNota(alumno.notasFinales[i].getAsignatura(), alumno.notasFinales[i].getNota());
		}
		this.numAsignaturas = alumno.numAsignaturas;
	}

	public String getIdPersonal() {
		return idPersonal;
	}

	public void setIdPersonal(String idPersonal) {
		this.idPersonal = idPersonal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public AsignaturaNota[] getNotasFinales() {
		return notasFinales;
	}

	public void setNotasFinales(AsignaturaNota[] notasFinales) {
		
		this.notasFinales = new AsignaturaNota [notasFinales.length];
		for(int i=0;i<this.notasFinales.length;i++) {
			this.notasFinales[i] = new AsignaturaNota (notasFinales[i].getAsignatura(), notasFinales[i].getNota());
		}
	}

	public int getNumAsignaturas() {
		this.numAsignaturas = this.notasFinales.length;
		return numAsignaturas;
	}

	public double getNotaMediaFinal() {
		double suma = 0;
		for(int i=0;i<notasFinales.length;i++) {
			suma += notasFinales[i].getNota();
		}
		notaMediaFinal = suma / (double) notasFinales.length;
		return notaMediaFinal;
	}

	public boolean pasarDeCurso() {
		int contador = 0;
		
		for(int i=0;i<notasFinales.length;i++) {
			if(notasFinales[i].getNota()<5)
				contador += 1;
		}
		
		if(contador>2)
			return false;
		else
			return true;
	}
	
	public String obtenerListadoNotasAsignaturas() {
		
		String obtenerListadoNotasAsignaturas = "Asignaturas y Notas:" + "\n";
		for(int i=0;i<notasFinales.length;i++) {
			if(i==notasFinales.length - 1)
				obtenerListadoNotasAsignaturas += "  " + notasFinales[i].toString();
			else
				obtenerListadoNotasAsignaturas += "  " + notasFinales[i].toString() + "\n";
		}
		return obtenerListadoNotasAsignaturas;
	}
	
	@Override
	public String toString() {
		String notas = "[";
		for(int i=0;i<notasFinales.length;i++) {
			if(i==notasFinales.length-1)
				notas += notasFinales[i] + "]";
			else
				notas += notasFinales[i] + "; ";
		}
		return "Alumno:" + "\n"
				+ "  idPersonal: " + idPersonal + "\n"
				+ "  Nombre: " + nombre + "\n"
				+ "  Primer Apellido: " + primerApellido + "\n"
				+ "  Segundo Apellido: " + segundoApellido + "\n"
				+ "  Numero de asignaturas: " + getNumAsignaturas() + "\n"
				+ "  Nota Media Final: " + getNotaMediaFinal() + "\n"
				+ "  " + notas;
	}
	
	@Override
	public boolean equals(Object obj) {
		Alumno otro = (Alumno) obj;
		
		if(this.nombre == otro.nombre && this.primerApellido == otro.primerApellido && this.segundoApellido == otro.segundoApellido)
			return true;
		else
			return false;
	}

	public int compareTo(Object obj) {
		Alumno otro = (Alumno) obj;
		
		if(this.equals(otro))
			return 0;
		if(this.getNotaMediaFinal() > otro.getNotaMediaFinal())
			return 1;
		
		return -1;		
	}

}
