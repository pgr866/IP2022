package org.ip.sesion08;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ArrayAlumnosTestJUnit5 {

	Alumno [] arrayAlumnos;

	@Before
	public void setUp() throws Exception {
		arrayAlumnos = new Alumno[5];

		Alumno alumno1 = new Alumno("12345678A", "Juan", "Lopez", "Lopez");
		AsignaturaNota [] asigaturaNota = new AsignaturaNota[5];
		asigaturaNota[0] = new AsignaturaNota("IP", 7.5);
		asigaturaNota[1] = new AsignaturaNota("Fis", 4.5);
		asigaturaNota[2] = new AsignaturaNota("OGE", 5.5);
		asigaturaNota[3] = new AsignaturaNota("ALMD", 6.0);
		asigaturaNota[4] = new AsignaturaNota("Cal", 6.5);
		alumno1.setNotasFinales(asigaturaNota);

		Alumno alumno2 = new Alumno("87654321Z", "Maria", "Garcia", "Sanchez");
		asigaturaNota[0].setNota(8.5);
		asigaturaNota[1].setNota(3.0);
		asigaturaNota[2].setNota(6.0);
		asigaturaNota[3].setNota(4.7);
		asigaturaNota[4].setNota(3.5);
		alumno2.setNotasFinales(asigaturaNota);

		asigaturaNota[0].setNota(9.5);
		asigaturaNota[1].setNota(7.0);
		asigaturaNota[2].setNota(6.0);
		asigaturaNota[3].setNota(8.3);
		asigaturaNota[4].setNota(5.5);
		Alumno alumno3 = new Alumno("33333333C", "Luis", "Perez", "Hernandez", asigaturaNota);

		Alumno alumno4 = new Alumno(alumno3);
		alumno4.setIdPersonal("44444444D");
		alumno4.setNombre("Isabel");
		asigaturaNota[0].setNota(9.0);
		asigaturaNota[1].setNota(6.5);
		asigaturaNota[2].setNota(7.5);
		asigaturaNota[3].setNota(6.8);
		asigaturaNota[4].setNota(7.3);
		alumno4.setNotasFinales(asigaturaNota);

		asigaturaNota[0].setNota(7.5);
		asigaturaNota[1].setNota(5.0);
		asigaturaNota[2].setNota(5.0);
		asigaturaNota[3].setNota(5.3);
		asigaturaNota[4].setNota(4.5);
		Arrays.sort(asigaturaNota);
		Alumno alumno5 = new Alumno("55555555C", "Alvaro", "Jimenez", "Ramos", asigaturaNota);

		arrayAlumnos[0] = alumno1;
		arrayAlumnos[1] = alumno2;
		arrayAlumnos[2] = alumno3;
		arrayAlumnos[3] = alumno4;
		arrayAlumnos[4] = alumno5;
	}

	@Test
	public void testA_Alumno4GetDatosPersonalesAcademicos() {
		assertEquals("44444444D", arrayAlumnos[3].getIdPersonal());
		assertEquals("Isabel", arrayAlumnos[3].getNombre());
		assertEquals("Perez", arrayAlumnos[3].getPrimerApellido());
		assertEquals("Hernandez", arrayAlumnos[3].getSegundoApellido());
		assertTrue("Error: el numero de asignaturas del alumno[3] deberia ser 5 y es " + arrayAlumnos[3].getNumAsignaturas(),  arrayAlumnos[3].getNumAsignaturas() == 5);
		AsignaturaNota [] asigaturaNota = new AsignaturaNota[arrayAlumnos[3].getNumAsignaturas()];
		asigaturaNota[0] = new AsignaturaNota("IP", 9.0);
		asigaturaNota[1] = new AsignaturaNota("Fis", 6.5);
		asigaturaNota[2] = new AsignaturaNota("OGE", 7.5);
		asigaturaNota[3] = new AsignaturaNota("ALMD", 6.8);
		asigaturaNota[4] = new AsignaturaNota("Cal", 7.3);
		assertTrue(Arrays.equals(asigaturaNota, arrayAlumnos[3].getNotasFinales()));
		assertTrue("Error: La nota media del alumno[3] deberia ser 7.42 y es " + arrayAlumnos[3].getNotaMediaFinal(), arrayAlumnos[3].getNotaMediaFinal() == 7.42);
	}

	@Test
	public void testB_Alumno3NotaMediaFinal() {
		assertTrue("Error: La nota media del alumno[2] deberia ser 7.26 y es " + arrayAlumnos[2].getNotaMediaFinal(), arrayAlumnos[2].getNotaMediaFinal() == 7.26);
	}

	@Test
	public void testC_Alumno1ObtenerListadoAsignaturas() {
		String salida = arrayAlumnos[0].obtenerListadoNotasAsignaturas();
		String salidaEsperada = "Asignaturas y Notas:" + "\n"
			  + "  (IP, 7.5)" + "\n"
			  + "  (Fis, 4.5)" + "\n"
			  + "  (OGE, 5.5)" + "\n"
			  + "  (ALMD, 6.0)" + "\n"
			  + "  (Cal, 6.5)";
		assertEquals(salida, salidaEsperada);
	}

	@Test
	public void testD_Alumno5ObtenerListadoAsignaturas() {
		String salida = arrayAlumnos[4].obtenerListadoNotasAsignaturas();
		String salidaEsperada = "Asignaturas y Notas:" + "\n"
			+ "  (Cal, 4.5)" + "\n"
			+ "  (Fis, 5.0)" + "\n"
			+ "  (OGE, 5.0)" + "\n"
			+ "  (ALMD, 5.3)" + "\n"
			+ "  (IP, 7.5)";
		assertEquals(salida, salidaEsperada);
	}

	@Test
	public void testE_Alumno1toString() {
		String salida = arrayAlumnos[0].toString();
		String salidaEsperada = "Alumno:" + "\n"
			+ "  idPersonal: 12345678A" + "\n"
			+ "  Nombre: Juan" + "\n"
			+ "  Primer Apellido: Lopez" + "\n"
			+ "  Segundo Apellido: Lopez" + "\n"
			+ "  Numero de asignaturas: 5" + "\n"
			+ "  Nota Media Final: 6.0" + "\n"
			+ "  [(IP, 7.5); (Fis, 4.5); (OGE, 5.5); (ALMD, 6.0); (Cal, 6.5)]";
		assertEquals(salida, salidaEsperada);
	}

	@Test
	public void testF_Alumno1PasarCurso() {
		assertTrue(arrayAlumnos[0].pasarDeCurso());
		assertTrue("Error: El alumno[0] no pasa de curso y deberia hacerlo\n" + arrayAlumnos[0].toString(), arrayAlumnos[0].pasarDeCurso());
	}

	@Test
	public void testG_Alumno2PasarCurso() {
		assertFalse(arrayAlumnos[1].pasarDeCurso());
		assertFalse("Error: El alumno[1] pasa de curso y no deberia\n" + arrayAlumnos[1].toString(), arrayAlumnos[1].pasarDeCurso());
	}

	@Test
	public void testH_AlumnosPasanCurso() {
		int alumnosNoPasanCurso = 0;
		int alumnosPasanCurso = 0;
		for (int i = 0; i < arrayAlumnos.length; i++) {
			if (arrayAlumnos[i].pasarDeCurso())
				alumnosPasanCurso++;
			else
				alumnosNoPasanCurso++;
		}
		assertTrue("Error: Deberian pasar de curso 4 alumnos y pasan " + alumnosPasanCurso, alumnosPasanCurso == 4);
		assertTrue("Error: Deberian no pasar de curso 1 alumno y no pasan " + alumnosNoPasanCurso, alumnosNoPasanCurso == 1);
	}

	@Test
	public void testI_AlumnosEquals() {
		assertFalse(arrayAlumnos[2].equals(arrayAlumnos[3]));
		Alumno alumnoTemp = new Alumno(arrayAlumnos[0]);
		assertTrue(alumnoTemp.equals(arrayAlumnos[0]));
	}

	@Test
	public void testJ_AlumnosCompareTo() {
		assertTrue(arrayAlumnos[2].compareTo(arrayAlumnos[3]) == -1);
		assertTrue(arrayAlumnos[3].compareTo(arrayAlumnos[2]) == 1);
		Alumno alumnoTemp = new Alumno(arrayAlumnos[0]);
		assertTrue(alumnoTemp.compareTo(arrayAlumnos[0]) == 0);
	}

	@Test
	public void testK_NotaMediaFinalGrupo() {
		double suma = 0.0;
		for (int i = 0; i < arrayAlumnos.length; i++) {
			suma += arrayAlumnos[i].getNotaMediaFinal();
		}
		double media = suma / (double) arrayAlumnos.length;
		assertTrue("Error: la nota media del grupo esperada deberia ser 6.256 y es" + media,  media == 6.256);
	}
}
