package com.edalac.modelo.dto;
// default package
// Generated 14/11/2016 09:15:43 AM by Hibernate Tools 3.5.0.Final

/**
 * TbTipopersona generated by hbm2java
 */
public class TbTipopersona implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private long nbIdtipopersona;
	private String vrDescripcion;

	public TbTipopersona() {
	}

	public TbTipopersona(long nbIdtipopersona, String vrDescripcion) {
		this.nbIdtipopersona = nbIdtipopersona;
		this.vrDescripcion = vrDescripcion;
	}

	public long getNbIdtipopersona() {
		return this.nbIdtipopersona;
	}

	public void setNbIdtipopersona(long nbIdtipopersona) {
		this.nbIdtipopersona = nbIdtipopersona;
	}

	public String getVrDescripcion() {
		return this.vrDescripcion;
	}

	public void setVrDescripcion(String vrDescripcion) {
		this.vrDescripcion = vrDescripcion;
	}

}