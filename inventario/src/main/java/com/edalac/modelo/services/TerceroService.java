package com.edalac.modelo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.edalac.modelo.dto.TbTercero;
import com.edalac.modelo.ngc.TercerosNGC;
import com.edalac.modelo.util.exception.ExcepcionesNGC;

@RestController
@RequestMapping("/terceros")
public class TerceroService {
	@Autowired
	TercerosNGC tercerosNgc;
	
	@RequestMapping(value="/listarTerceros", method=RequestMethod.GET, produces="application/json")
	public @ResponseBody List<TbTercero> listarTerceros(){
		List<TbTercero> lista = null;
		try {
			lista = tercerosNgc.listarTercero();
		} catch (ExcepcionesNGC e) {
		}
		
		return lista;
	}

}
