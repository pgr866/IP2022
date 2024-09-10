package org.ip.sesion07;

public class Pelicula extends Multimedia{
	
	private String actorPrincipal;
	private String actrizPrincipal;
	
	
	public Pelicula(String titulo, String autor, Formato formato, double duracion, String actor, String actriz) {
		super(titulo, autor, formato, duracion);
		if (actor == null) {
			this.actorPrincipal = "";
		} else {
			this.actorPrincipal = actor;	
		}
		
		if (actriz == null) {
			this.actrizPrincipal = "";
		} else {
			this.actrizPrincipal = actriz;	
		}
	}
	
	public Pelicula(Pelicula pelicula) {
		super(pelicula.getTitulo(), pelicula.getAutor(), pelicula.getFormato(), pelicula.getDuracion());
		this.actorPrincipal = pelicula.actorPrincipal;
		this.actrizPrincipal = pelicula.actrizPrincipal;
	}

	public String getActorPrincipal() {
		return actorPrincipal;
	}

	public void setActorPrincipal(String actorPrincipal) {
		this.actorPrincipal = actorPrincipal;
	}

	public String getActrizPrincipal() {
		return actrizPrincipal;
	}

	public void setActrizPrincipal(String actrizPrincipal) {
		this.actrizPrincipal = actrizPrincipal;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + "  Pelicula {protagonizada por: {" + actorPrincipal + " y " + actrizPrincipal + "}";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pelicula other = (Pelicula) obj;
		if (actorPrincipal == null) {
			if (other.actorPrincipal != null)
				return false;
		} else if (!actorPrincipal.equals(other.actorPrincipal))
			return false;
		if (actrizPrincipal == null) {
			if (other.actrizPrincipal != null)
				return false;
		} else if (!actrizPrincipal.equals(other.actrizPrincipal))
			return false;
		return true;
	}
	
}
