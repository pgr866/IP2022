package org.ip.sesion08;

public class AsignaturaNota implements Comparable{
	
	private String asignatura;
	private double nota;
	
	public AsignaturaNota() {
		
		super();
		this.asignatura = null;
		this.nota = 0;
	}
	
	public AsignaturaNota(String asignatura, double nota) {
		
		super();
		this.asignatura = asignatura;
		this.nota = nota;
		
	}
	
	public AsignaturaNota(String asignatura) {
		
		super();
		this.asignatura = asignatura;
		this.nota = 0;
		
	}
	
	public AsignaturaNota(AsignaturaNota asignaturaNota) {
		
		super();
		this.asignatura = asignaturaNota.asignatura;
		this.nota = asignaturaNota.nota;
		
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "(" + this.asignatura + ", " + this.nota + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		AsignaturaNota otro = (AsignaturaNota) obj;
		if(this.nota == otro.nota)
			return true;
		return false;
	}

	public int compareTo(Object obj) {
		AsignaturaNota otro = (AsignaturaNota) obj;
		if(this.equals(otro))
			return 0;
		if(this.nota > otro.nota)
			return 1;
		return -1;
	}
	
}
