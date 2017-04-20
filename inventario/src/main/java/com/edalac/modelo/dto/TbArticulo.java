package com.edalac.modelo.dto;
// default package
// Generated 19/04/2017 11:44:33 PM by Hibernate Tools 3.5.0.Final

import java.util.HashSet;
import java.util.Set;

/**
 * TbArticulo generated by hbm2java
 */
public class TbArticulo implements java.io.Serializable {

	private long nbIdarticulo;
	private TbEmpresa tbEmpresa;
	private String vrCodigoArticulo;
	private String vrDescripcion;
	private Long nbCantidad;
	private Long nbStockminimo;
	private Long nbStockmaximo;
	private Boolean nbEstado;
	private Set tbDetalleFacturas = new HashSet(0);

	public TbArticulo() {
	}

	public TbArticulo(long nbIdarticulo, String vrCodigoArticulo) {
		this.nbIdarticulo = nbIdarticulo;
		this.vrCodigoArticulo = vrCodigoArticulo;
	}

	public TbArticulo(long nbIdarticulo, TbEmpresa tbEmpresa, String vrCodigoArticulo, String vrDescripcion,
			Long nbCantidad, Long nbStockminimo, Long nbStockmaximo, Boolean nbEstado, Set tbDetalleFacturas) {
		this.nbIdarticulo = nbIdarticulo;
		this.tbEmpresa = tbEmpresa;
		this.vrCodigoArticulo = vrCodigoArticulo;
		this.vrDescripcion = vrDescripcion;
		this.nbCantidad = nbCantidad;
		this.nbStockminimo = nbStockminimo;
		this.nbStockmaximo = nbStockmaximo;
		this.nbEstado = nbEstado;
		this.tbDetalleFacturas = tbDetalleFacturas;
	}

	public long getNbIdarticulo() {
		return this.nbIdarticulo;
	}

	public void setNbIdarticulo(long nbIdarticulo) {
		this.nbIdarticulo = nbIdarticulo;
	}

	public TbEmpresa getTbEmpresa() {
		return this.tbEmpresa;
	}

	public void setTbEmpresa(TbEmpresa tbEmpresa) {
		this.tbEmpresa = tbEmpresa;
	}

	public String getVrCodigoArticulo() {
		return this.vrCodigoArticulo;
	}

	public void setVrCodigoArticulo(String vrCodigoArticulo) {
		this.vrCodigoArticulo = vrCodigoArticulo;
	}

	public String getVrDescripcion() {
		return this.vrDescripcion;
	}

	public void setVrDescripcion(String vrDescripcion) {
		this.vrDescripcion = vrDescripcion;
	}

	public Long getNbCantidad() {
		return this.nbCantidad;
	}

	public void setNbCantidad(Long nbCantidad) {
		this.nbCantidad = nbCantidad;
	}

	public Long getNbStockminimo() {
		return this.nbStockminimo;
	}

	public void setNbStockminimo(Long nbStockminimo) {
		this.nbStockminimo = nbStockminimo;
	}

	public Long getNbStockmaximo() {
		return this.nbStockmaximo;
	}

	public void setNbStockmaximo(Long nbStockmaximo) {
		this.nbStockmaximo = nbStockmaximo;
	}

	public Boolean getNbEstado() {
		return this.nbEstado;
	}

	public void setNbEstado(Boolean nbEstado) {
		this.nbEstado = nbEstado;
	}

	public Set getTbDetalleFacturas() {
		return this.tbDetalleFacturas;
	}

	public void setTbDetalleFacturas(Set tbDetalleFacturas) {
		this.tbDetalleFacturas = tbDetalleFacturas;
	}

}
