package com.edalac.modelo.util.exception;

public class ExcepcionesDAO extends Exception {

	private static final long serialVersionUID = 1L;
	private String mensajeTecnico;
	private String mensajeUsuario;
	
	public ExcepcionesDAO() {
		super();
	}
	
	public ExcepcionesDAO(String message) {
		super(message);
	}
	
	public ExcepcionesDAO(Throwable cause) {
		super(cause);
	}

	public String getMensajeTecnico() {
		return mensajeTecnico;
	}

	public void setMensajeTecnico(String mensajeTecnico) {
		this.mensajeTecnico = mensajeTecnico;
	}

	public String getMensajeUsuario() {
		return mensajeUsuario;
	}

	public void setMensajeUsuario(String mensajeUsuario) {
		this.mensajeUsuario = mensajeUsuario;
	}
	
	
	
}
