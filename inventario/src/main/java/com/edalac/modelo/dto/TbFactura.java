package com.edalac.modelo.dto;
// default package
// Generated 14/11/2016 09:15:43 AM by Hibernate Tools 3.5.0.Final

import java.math.BigDecimal;

/**
 * TbFactura generated by hbm2java
 */
public class TbFactura implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private long nbIdFactura;
	private TbTercero tbTercero;
	private TbEmpresa tbEmpresa;
	private String vrNumeroFactura;
	private String dtFechaFactura;
	private String vrDescripcion;
	private BigDecimal nbValorTotal;
	private Long nbVendedor;
	private String vrTipoFactura;
	private Character vrEstadoFactura;

	public TbFactura() {
	}

	public TbFactura(long nbIdFactura) {
		this.nbIdFactura = nbIdFactura;
	}

	public long getNbIdFactura() {
		return this.nbIdFactura;
	}

	public void setNbIdFactura(long nbIdFactura) {
		this.nbIdFactura = nbIdFactura;
	}

	public TbTercero getTbTercero() {
		return this.tbTercero;
	}

	public void setTbTercero(TbTercero tbTercero) {
		this.tbTercero = tbTercero;
	}

	public TbEmpresa getTbEmpresa() {
		return this.tbEmpresa;
	}

	public void setTbEmpresa(TbEmpresa tbEmpresa) {
		this.tbEmpresa = tbEmpresa;
	}

	public String getVrNumeroFactura() {
		return this.vrNumeroFactura;
	}

	public void setVrNumeroFactura(String vrNumeroFactura) {
		this.vrNumeroFactura = vrNumeroFactura;
	}

	public String getDtFechaFactura() {
		return this.dtFechaFactura;
	}

	public void setDtFechaFactura(String dtFechaFactura) {
		this.dtFechaFactura = dtFechaFactura;
	}

	public String getVrDescripcion() {
		return this.vrDescripcion;
	}

	public void setVrDescripcion(String vrDescripcion) {
		this.vrDescripcion = vrDescripcion;
	}

	public BigDecimal getNbValorTotal() {
		return this.nbValorTotal;
	}

	public void setNbValorTotal(BigDecimal nbValorTotal) {
		this.nbValorTotal = nbValorTotal;
	}

	public Long getNbVendedor() {
		return this.nbVendedor;
	}

	public void setNbVendedor(Long nbVendedor) {
		this.nbVendedor = nbVendedor;
	}

	public String getVrTipoFactura() {
		return this.vrTipoFactura;
	}

	public void setVrTipoFactura(String vrTipoFactura) {
		this.vrTipoFactura = vrTipoFactura;
	}

	public Character getVrEstadoFactura() {
		return this.vrEstadoFactura;
	}

	public void setVrEstadoFactura(Character vrEstadoFactura) {
		this.vrEstadoFactura = vrEstadoFactura;
	}

}
