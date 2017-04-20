package com.edalac.modelo.ngc;

import java.util.List;

import com.edalac.modelo.dto.TbTercero;
import com.edalac.modelo.util.exception.ExcepcionesNGC;

public interface TercerosNGC {

	public void guardarTercero(TbTercero tercero) throws ExcepcionesNGC;
	
	public TbTercero obtenerTercero(long idTercero) throws ExcepcionesNGC;
	public List<TbTercero> listarTercero() throws ExcepcionesNGC;
	
}
