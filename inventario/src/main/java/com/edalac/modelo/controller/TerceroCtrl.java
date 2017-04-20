package com.edalac.modelo.controller;

import java.util.List;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Cell;
import org.zkoss.zul.Grid;
import org.zkoss.zul.Label;
import org.zkoss.zul.Row;
import org.zkoss.zul.Rows;

import com.edalac.modelo.dto.TbTercero;
import com.edalac.modelo.ngc.TercerosNGC;
import com.edalac.modelo.util.exception.ExcepcionesNGC;

@SuppressWarnings("rawtypes")
public class TerceroCtrl extends GenericForwardComposer {

	private static final long serialVersionUID = 1L;
	private TercerosNGC terceroNgc;
	
	private Grid gridTerceros;
	private Rows rows;
	private Row row;
	
	
	private void cargarTerceros(){
		gridTerceros = new Grid();
		try {
			List<TbTercero> lista = terceroNgc.listarTercero();
			rows = new Rows();
			if(lista != null){
				
				for(TbTercero tercero : lista){
					row = new Row();
					Cell celdaCC = new Cell();
					Cell celdaNombres = new Cell();
					Cell celdaDepartamento = new Cell();
					Cell celdaCiudad = new Cell();
					Cell celdaTipoTercero = new Cell();
					celdaCC.appendChild(new Label(tercero.getNbNit().toString()));
					celdaNombres.appendChild(new Label(tercero.getVrApellidos()+" "+tercero.getVrNombres()));
					celdaDepartamento.appendChild(new Label(tercero.getTbCiudad().getTbDepartamento().getVrNombre()));
					celdaCiudad.appendChild(new Label(tercero.getTbCiudad().getVrNombre()));
					celdaTipoTercero.appendChild(new Label(tercero.getTbTipopersona().getVrDescripcion()));
					row.appendChild(celdaCC);
					row.appendChild(celdaNombres);
					row.appendChild(celdaDepartamento);
					row.appendChild(celdaCiudad);
					row.appendChild(celdaTipoTercero);
					rows.appendChild(row);
				}
				gridTerceros.appendChild(rows);
			}
		} catch (ExcepcionesNGC e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	@SuppressWarnings("unchecked")
	@Override
	public void doAfterCompose(Component comp) throws Exception {		
		super.doAfterCompose(comp);
		cargarTerceros();
	}
	
	public void setTerceroNgc(TercerosNGC terceroNgc) {
		this.terceroNgc = terceroNgc;
	}
}
