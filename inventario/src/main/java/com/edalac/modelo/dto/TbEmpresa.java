package com.edalac.modelo.dto;

/**
 * TbEmpresa generated by hbm2java
 */
public class TbEmpresa implements java.io.Serializable {

	private static final long serialVersionUID = 7906568110288567135L;
	private long nbIdempresa;
	private String vrNombreEmpresa;
	private String vrCodigoEmpresa;

	public TbEmpresa() {
	}

	public TbEmpresa(long nbIdempresa) {
		this.nbIdempresa = nbIdempresa;
	}

	public long getNbIdempresa() {
		return this.nbIdempresa;
	}

	public void setNbIdempresa(long nbIdempresa) {
		this.nbIdempresa = nbIdempresa;
	}

	public String getVrNombreEmpresa() {
		return this.vrNombreEmpresa;
	}

	public void setVrNombreEmpresa(String vrNombreEmpresa) {
		this.vrNombreEmpresa = vrNombreEmpresa;
	}

	public String getVrCodigoEmpresa() {
		return this.vrCodigoEmpresa;
	}

	public void setVrCodigoEmpresa(String vrCodigoEmpresa) {
		this.vrCodigoEmpresa = vrCodigoEmpresa;
	}

}
