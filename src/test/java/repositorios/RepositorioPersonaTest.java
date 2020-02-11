package repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;

import modelos.Persona;

public class RepositorioPersonaTest {

	private RepositorioPersona repositorioPersona = mock(RepositorioPersona.class);

//	@Test
//	@DisplayName("given crearPersona mocked method when crearPersona invoked then mocked value returned")
//	public void testCrearPersona() {
//		Persona pepe = new Persona("1-2", "Pepe");
//		when(repositorioPersona.crearPersona(pepe)).thenReturn("OK");
//		String crearPersonaRes = repositorioPersona.crearPersona(pepe);
//		assertEquals("OK", crearPersonaRes);
//		verify(repositorioPersona).crearPersona(pepe);
//	}
//
//	@Test
//	@DisplayName("given actualizarPersona mocked method when ActualizarPersona invoked then mocked value returned")
//	public void testActualizarPersona() {
//		Persona pepe = new Persona("1-2", "Pepe");
//		when(repositorioPersona.actualizarPersona(pepe)).thenReturn("OK");
//		String crearPersonaRes = repositorioPersona.actualizarPersona(pepe);
//		assertEquals("OK", crearPersonaRes);
//		verify(repositorioPersona).actualizarPersona(pepe);
//	}
//
//	@Test
//	@DisplayName("given eliminarPersona mocked method when eliminarPerso invoked then mocked value returned")
//	public void testEliminarPersona() {
//		Persona sam = new Persona("1-4", "Sam");
//		when(repositorioPersona.eliminarPersona(sam)).thenReturn("OKOK");
//		String eliminarRes = repositorioPersona.eliminarPersona(sam);
//		//verify(repositorioPersona).eliminarPersona(sam);
//		assertEquals("OKOK", eliminarRes);
//		
//	}

}
