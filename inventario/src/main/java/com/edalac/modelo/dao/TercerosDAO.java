package com.edalac.modelo.dao;

import java.util.List;

import com.edalac.modelo.dto.TbTercero;
import com.edalac.modelo.util.exception.ExcepcionesDAO;

public interface TercerosDAO {
	
	public void guardarTercero(TbTercero tercero) throws ExcepcionesDAO;
	
	public TbTercero obtenerTercero(long idTercero) throws ExcepcionesDAO;
	public List<TbTercero> listarTercero() throws ExcepcionesDAO;

}
