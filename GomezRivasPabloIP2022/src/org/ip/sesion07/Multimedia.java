package org.ip.sesion07;

public class Multimedia {
	
	public enum Formato { wav, mp3, midi, avi, mov, mpg, cdAudio, dvd }
	
	protected Formato formato;
	private String titulo;
	private String autor;
	private double duracion;
	
	public Multimedia(String titulo, String autor, Formato formato, double duracion) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.formato = formato;
		this.duracion = duracion;
	}
	
	public Multimedia(Multimedia objeto) {
		super();
		this.titulo = objeto.titulo;
		this.autor = objeto.autor;
		this.formato = objeto.formato;
		this.duracion = objeto.duracion;
	}

	public Formato getFormato() {
		return formato;
	}

	public void setFormato(Formato formato) {
		this.formato = formato;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Objeto Multimedia [titulo: " + titulo + ", de: " + autor + ", con formato: " + formato + ", duracion: " + duracion + " min.seg]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Multimedia other = (Multimedia) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}	
	
}
