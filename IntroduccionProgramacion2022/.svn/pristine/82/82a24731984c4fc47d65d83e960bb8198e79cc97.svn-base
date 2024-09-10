package org.ip.tema03.ejemplostema;

public class PasaObjetosMetodos {

	private static void cambiarNombre(Persona p) {
        //p = new Persona(); 		// nuevo valor al parametro
        p.setNombre("Antonio"); 	// aqui tendra otro valor
        System.out.println("El nombre en el metodo es: " + p.getNombre());
    }

	public static void main(String[] args) {
		Persona p = new Persona();	// creamos un objeto
		p.setNombre("Juan"); 		// le asignamos un valor
		System.out.println("El nombre antes del metodo es: " + p.getNombre());
		cambiarNombre(p);			// llamamos a un metodo para que cambie de valor
		System.out.println("El nombre despues del metodo es: " + p.getNombre());
	}
}
