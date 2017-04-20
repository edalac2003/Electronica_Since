package com.edalac.modelo.ngc.impl;

import java.util.List;

import com.edalac.modelo.dao.LocalizacionDAO;
import com.edalac.modelo.dto.TbCiudad;
import com.edalac.modelo.dto.TbDepartamento;
import com.edalac.modelo.dto.TbPais;
import com.edalac.modelo.ngc.LocalizacionNGC;
import com.edalac.modelo.util.exception.ExcepcionesDAO;
import com.edalac.modelo.util.exception.ExcepcionesNGC;

public class LocalizacionNGCImpl implements LocalizacionNGC {
	ExcepcionesNGC expNgc;
	List<TbPais> listaPais = null;
	List<TbDepartamento> listaDpto = null;
	List<TbCiudad> listaCiudad = null;	
	
	LocalizacionDAO localizacionDao;

	public void setLocalizacionDao(LocalizacionDAO localizacionDao) {
		this.localizacionDao = localizacionDao;
	}

	
	public List<TbPais> listarPaises() throws ExcepcionesNGC {		
		try {
			listaPais = localizacionDao.listarPaises();
		} catch (ExcepcionesDAO e) {
			expNgc = new ExcepcionesNGC();
			expNgc.setMensajeTecnico(e.getMensajeTecnico());
			expNgc.setMensajeUsuario(e.getMensajeUsuario());
			throw expNgc;
		}

		return listaPais;
	}
	
	public List<TbDepartamento> listarDptoxPais(Long idPais) throws ExcepcionesNGC {
		TbPais pais = null;		
		
		try {
			if(idPais != null){
				pais = localizacionDao.obtenerPaisId(idPais);
				if(pais != null){
					listaDpto = localizacionDao.listarDptoxPais(pais);
				}else{
					expNgc = new ExcepcionesNGC();
					expNgc.setMensajeUsuario("No se ha encontrado el Pais.");
					throw expNgc;
				}
			}else{
				expNgc = new ExcepcionesNGC();
				expNgc.setMensajeUsuario("Debe ingresar un ID válido.");
				throw expNgc;
			}			
		} catch (ExcepcionesDAO e) {
			expNgc = new ExcepcionesNGC();
			expNgc.setMensajeUsuario(e.getMensajeUsuario());
			expNgc.setMensajeTecnico(e.getMensajeTecnico());
			throw expNgc;
		}
		return listaDpto;
	}

	public List<TbCiudad> listarCiudadxDpto(Long idDpto) throws ExcepcionesNGC {
		TbDepartamento dpto = null;
		
		try {
			if(idDpto != null && idDpto > 0){
				dpto = localizacionDao.obtenerDptoxId(idDpto);
				if(dpto != null){
					listaCiudad = localizacionDao.listarCiudadxDpto(dpto);
				}else{
					expNgc = new ExcepcionesNGC();
					expNgc.setMensajeUsuario("No se encontró el Depatamento.");
					throw expNgc;
				}				
			}else{
				expNgc = new ExcepcionesNGC();
				expNgc.setMensajeUsuario("Debe ingresar un ID válido.");
				throw expNgc;
			}
		} catch (ExcepcionesDAO e) {
			expNgc = new ExcepcionesNGC();
			expNgc.setMensajeTecnico(e.getMensajeTecnico());
			expNgc.setMensajeUsuario(e.getMensajeUsuario());
			throw expNgc;
		}
		
		return listaCiudad;
	}

	public List<TbDepartamento> listarDpto() throws ExcepcionesNGC {
		
		try {
			listaDpto = localizacionDao.listarDpto();
		} catch (ExcepcionesDAO e) {
			expNgc = new ExcepcionesNGC();
			expNgc.setMensajeTecnico(e.getMensajeTecnico());
			expNgc.setMensajeUsuario(e.getMensajeUsuario());
			throw expNgc;
		}
		
		return listaDpto;
	}

	
	public List<TbCiudad> listarCiudad() throws ExcepcionesNGC {		
		try {
			listaCiudad = localizacionDao.listarCiudad();
		} catch (ExcepcionesDAO e) {
			expNgc = new ExcepcionesNGC();
			expNgc.setMensajeTecnico(e.getMensajeTecnico());
			expNgc.setMensajeUsuario(e.getMensajeUsuario());
			throw expNgc;
		}
		
		return listaCiudad;
	}

}
