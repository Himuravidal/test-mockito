package modelos;

import java.util.Date;

public class Comentario {

	private Long id;
	private Long usuarioId;
	private Long albumId;
	private String detalle;
	private Date fecha;
	
	private String algo;
	private String nada;

	public Comentario(Long id, Long usuarioId, Long albumId, String detalle, Date fecha) {
		super();
		this.id = id;
		this.usuarioId = usuarioId;
		this.albumId = albumId;
		this.detalle = detalle;
		this.fecha = fecha;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}

	public Long getAlbumId() {
		return albumId;
	}

	public void setAlbumId(Long albumId) {
		this.albumId = albumId;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
