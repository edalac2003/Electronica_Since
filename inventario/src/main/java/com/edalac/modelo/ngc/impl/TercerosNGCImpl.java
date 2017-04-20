package com.edalac.modelo.ngc.impl;

import java.util.List;

import com.edalac.modelo.dao.TercerosDAO;
import com.edalac.modelo.dto.TbTercero;
import com.edalac.modelo.ngc.TercerosNGC;
import com.edalac.modelo.util.exception.ExcepcionesDAO;
import com.edalac.modelo.util.exception.ExcepcionesNGC;

public class TercerosNGCImpl implements TercerosNGC {
	
	ExcepcionesNGC expNgc;
	TercerosDAO tercerosDao;

	public void setTercerosDao(TercerosDAO tercerosDao) {
		this.tercerosDao = tercerosDao;
	}

	
	public void guardarTercero(TbTercero tercero) throws ExcepcionesNGC {
		if(tercero != null){
			try {
				tercerosDao.guardarTercero(tercero);
			} catch (ExcepcionesDAO e) {
				expNgc = new ExcepcionesNGC();
				expNgc.setMensajeTecnico(e.getMensajeTecnico());
				expNgc.setMensajeUsuario(e.getMensajeUsuario());
				throw expNgc;
			}
		}else{
			expNgc = new ExcepcionesNGC();
			expNgc.setMensajeUsuario("El Tercero no puede ser Nulo.");
//			throw expNgc;
		}
	}

	public TbTercero obtenerTercero(long idTercero) throws ExcepcionesNGC {
		TbTercero tercero = null;
		
		if(idTercero > 0){
			try {
				tercero = tercerosDao.obtenerTercero(idTercero);
			} catch (ExcepcionesDAO e) {
				expNgc = new ExcepcionesNGC();
				expNgc.setMensajeTecnico(e.getMensajeTecnico());
				expNgc.setMensajeUsuario(e.getMensajeUsuario());
				throw expNgc;
			}
		}else{
			expNgc = new ExcepcionesNGC();
			expNgc.setMensajeUsuario("ID de Tercero no Válido.");
			throw expNgc;
		}
		
		return tercero;
	}

	public List<TbTercero> listarTercero() throws ExcepcionesNGC {
		List<TbTercero> lista = null;
		
		try {
			lista = tercerosDao.listarTercero();
		} catch (ExcepcionesDAO e) {
			expNgc = new ExcepcionesNGC();
			expNgc.setMensajeTecnico(e.getMensajeTecnico());
			expNgc.setMensajeUsuario(e.getMensajeUsuario());
			throw expNgc;
		}
		
		return lista;
	}

}
