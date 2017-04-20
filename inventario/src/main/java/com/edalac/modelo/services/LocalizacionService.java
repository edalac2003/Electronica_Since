package com.edalac.modelo.services;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.edalac.modelo.dto.TbCiudad;
import com.edalac.modelo.dto.TbDepartamento;
import com.edalac.modelo.dto.TbPais;
import com.edalac.modelo.ngc.LocalizacionNGC;
import com.edalac.modelo.util.exception.ExcepcionesNGC;

@RestController
@RequestMapping("/localizacion")
public class LocalizacionService {
	@Autowired
	LocalizacionNGC localizacionNgc;
	

	@RequestMapping(value="/listarPaises", method=RequestMethod.GET, produces="application/json")
	public @ResponseBody List<TbPais> listarPaises() throws Exception{
		List<TbPais> lista = null;
		
		lista = localizacionNgc.listarPaises();
		
		return lista;
	}
	
	@RequestMapping(value="/listarDptoxPais", method=RequestMethod.GET, produces="application/json")
	public @ResponseBody List<TbDepartamento> listarDptoxPais(@RequestParam(value="id") long idPais){
		List<TbDepartamento> lista = null;
		try {
			lista = localizacionNgc.listarDptoxPais(idPais);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	
	@RequestMapping(value="/listarCiudadesxDpto", method=RequestMethod.GET, produces="application/json")
	public @ResponseBody List<TbCiudad> listarCiudadesxDpto(@RequestParam(value="id") long idDpto){
		List<TbCiudad> lista = null;
		try {
			lista = localizacionNgc.listarCiudadxDpto(idDpto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	
	
	@RequestMapping(value="/listarCiudades", method=RequestMethod.GET, produces="application/json")
	public @ResponseBody List<TbCiudad> listarCiudades(){
		List<TbCiudad> lista = null;
		try {
			lista = localizacionNgc.listarCiudad();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return lista;
	}
}
