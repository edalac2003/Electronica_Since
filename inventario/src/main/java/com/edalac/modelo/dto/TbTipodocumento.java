package com.edalac.modelo.dto;

/**
 * TbTipodocumento generated by hbm2java
 */
public class TbTipodocumento implements java.io.Serializable {

	private static final long serialVersionUID = 3019692666675506062L;
	private long ndIdTipoDocumento;
	private String vrDescripcion;
	private String vrNombre;

	public TbTipodocumento() {
	}

	public TbTipodocumento(long ndIdTipoDocumento, String vrDescripcion) {
		this.ndIdTipoDocumento = ndIdTipoDocumento;
		this.vrDescripcion = vrDescripcion;
	}

	public long getNdIdTipoDocumento() {
		return this.ndIdTipoDocumento;
	}

	public void setNdIdTipoDocumento(long ndIdTipoDocumento) {
		this.ndIdTipoDocumento = ndIdTipoDocumento;
	}

	public String getVrDescripcion() {
		return this.vrDescripcion;
	}

	public void setVrDescripcion(String vrDescripcion) {
		this.vrDescripcion = vrDescripcion;
	}

	public String getVrNombre() {
		return this.vrNombre;
	}

	public void setVrNombre(String vrNombre) {
		this.vrNombre = vrNombre;
	}
}
