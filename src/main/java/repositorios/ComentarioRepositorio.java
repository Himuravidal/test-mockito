package repositorios;

import java.util.ArrayList;
import java.util.List;

import modelos.Comentario;

public class ComentarioRepositorio {

	private List<Comentario> db = new ArrayList<>();

	public String crear(Comentario comentario) {
		if (comentario != null) {
			db.add(comentario);
		} else {
			throw new NullPointerException();
		}
		return "OK";
	}

	public String actualizar(Comentario comentario) {
		if (comentario != null) {
			db.add(comentario);
		} else {
			throw new NullPointerException();
		}
		return "OK";
	}

	public List<Comentario> listarTodosLosComentarios() {
		return db;
	}

}
