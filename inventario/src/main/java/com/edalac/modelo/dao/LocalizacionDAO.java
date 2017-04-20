package com.edalac.modelo.dao;

import java.util.List;

import com.edalac.modelo.dto.TbCiudad;
import com.edalac.modelo.dto.TbDepartamento;
import com.edalac.modelo.dto.TbPais;
import com.edalac.modelo.util.exception.ExcepcionesDAO;

public interface LocalizacionDAO {

	public TbPais obtenerPaisId(long idPais) throws ExcepcionesDAO;
	public TbDepartamento obtenerDptoxId(long idDpto) throws ExcepcionesDAO;
	public TbCiudad obtenerCiudadxId(long idCiudad) throws ExcepcionesDAO;
	
	public List<TbPais> listarPaises() throws ExcepcionesDAO;	
	public List<TbDepartamento> listarDptoxPais(TbPais pais) throws ExcepcionesDAO;
	public List<TbCiudad> listarCiudadxDpto(TbDepartamento dpto) throws ExcepcionesDAO;
	
	public List<TbDepartamento> listarDpto() throws ExcepcionesDAO;
	public List<TbCiudad> listarCiudad() throws ExcepcionesDAO;
}
