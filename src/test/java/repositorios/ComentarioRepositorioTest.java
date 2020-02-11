package repositorios;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import modelos.Comentario;

public class ComentarioRepositorioTest {

	private static ComentarioRepositorio comentarioRepositorio;
	private static Comentario primerComentario;

	@BeforeAll
	static void setup() {
		primerComentario = new Comentario(1L, 1L, 1L, "Agregado en carga inicial", new Date());
		comentarioRepositorio = mock(ComentarioRepositorio.class);
	}

	@Test
	@DisplayName("given crear mocked method " + "when crear invoked " + "then mocked value returned")
	public void testCrearComentario() {
		when(comentarioRepositorio.crear(primerComentario)).thenReturn("OK");
		String creado = comentarioRepositorio.crear(primerComentario);
		assertEquals("OK", creado);
		verify(comentarioRepositorio).crear(primerComentario);
	}

	@Test
	@DisplayName("given actualizar mocked method " + "when actualizar invoked " + "then mocked value returned")
	public void testActualizarComentario() {
		primerComentario.setDetalle("Actualizado en prueba");
		when(comentarioRepositorio.actualizar(primerComentario)).thenReturn("OK");
		String actualizado = comentarioRepositorio.actualizar(primerComentario);
		assertEquals("OK", actualizado);
		verify(comentarioRepositorio).actualizar(primerComentario);
	}

	@Test
	@DisplayName("given listarTodosLosComentarios mocked method " +
	"when listarTodosLosComentarios invoked " + "then mocked value returned")
	public void testListarTodosLosComentarios() {
		List<Comentario> mockRespuesta = new ArrayList<>();
	//	when(comentarioRepositorio.listarTodosLosComentarios()).thenReturn(mockRespuesta);
		List<Comentario> listarRes =
		comentarioRepositorio.listarTodosLosComentarios();
		assertEquals(mockRespuesta, listarRes);
		verify(comentarioRepositorio).listarTodosLosComentarios();
		}

}
