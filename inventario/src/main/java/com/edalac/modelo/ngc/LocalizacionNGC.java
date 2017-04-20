package com.edalac.modelo.ngc;

import java.util.List;

import com.edalac.modelo.dto.TbCiudad;
import com.edalac.modelo.dto.TbDepartamento;
import com.edalac.modelo.dto.TbPais;
import com.edalac.modelo.util.exception.ExcepcionesNGC;

public interface LocalizacionNGC {

	public List<TbPais> listarPaises() throws ExcepcionesNGC;
	public List<TbDepartamento> listarDptoxPais(Long idPais) throws ExcepcionesNGC;
	public List<TbCiudad> listarCiudadxDpto(Long idDpto) throws ExcepcionesNGC;
	
	public List<TbDepartamento> listarDpto() throws ExcepcionesNGC;
	public List<TbCiudad> listarCiudad() throws ExcepcionesNGC;
	
}
