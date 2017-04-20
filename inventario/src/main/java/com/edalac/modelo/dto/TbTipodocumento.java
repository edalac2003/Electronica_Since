package com.edalac.modelo.dto;
// default package
// Generated 19/04/2017 11:44:33 PM by Hibernate Tools 3.5.0.Final

import java.util.HashSet;
import java.util.Set;

/**
 * TbTipodocumento generated by hbm2java
 */
public class TbTipodocumento implements java.io.Serializable {

	private long ndIdTipoDocumento;
	private String vrDescripcion;
	private String vrNombre;
	private Set tbTerceros = new HashSet(0);

	public TbTipodocumento() {
	}

	public TbTipodocumento(long ndIdTipoDocumento, String vrDescripcion) {
		this.ndIdTipoDocumento = ndIdTipoDocumento;
		this.vrDescripcion = vrDescripcion;
	}

	public TbTipodocumento(long ndIdTipoDocumento, String vrDescripcion, String vrNombre, Set tbTerceros) {
		this.ndIdTipoDocumento = ndIdTipoDocumento;
		this.vrDescripcion = vrDescripcion;
		this.vrNombre = vrNombre;
		this.tbTerceros = tbTerceros;
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

	public Set getTbTerceros() {
		return this.tbTerceros;
	}

	public void setTbTerceros(Set tbTerceros) {
		this.tbTerceros = tbTerceros;
	}

}
