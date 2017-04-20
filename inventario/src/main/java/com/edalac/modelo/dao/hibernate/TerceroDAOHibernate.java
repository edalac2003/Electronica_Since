package com.edalac.modelo.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.edalac.modelo.dao.TercerosDAO;
import com.edalac.modelo.dto.TbTercero;
import com.edalac.modelo.util.exception.ExcepcionesDAO;

public class TerceroDAOHibernate extends HibernateDaoSupport implements TercerosDAO {
	Session session = null;
	Criteria criteria = null;
	Transaction tx = null;
	
	ExcepcionesDAO expDao;
	
	public void guardarTercero(TbTercero tercero) throws ExcepcionesDAO {
		
		try {
			session = getSession();
			tx = session.beginTransaction();			
			session.saveOrUpdate(tercero);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			expDao = new ExcepcionesDAO();
			expDao.setMensajeTecnico(e.getMessage());
			expDao.setMensajeUsuario("Se presentaron problemas al intentar guardar el registro de Tercero.");
			throw expDao;
		}finally{
			session.close();
		}
	}


	public TbTercero obtenerTercero(long idTercero) throws ExcepcionesDAO {
		TbTercero tercero = null;
		
		try{
			session = getSession();
			criteria = session.createCriteria(TbTercero.class).add(Restrictions.eq("nbIdpersona", idTercero));
			tercero = (TbTercero)criteria.uniqueResult();					
		}catch (HibernateException e) {
			expDao = new ExcepcionesDAO();
			expDao.setMensajeTecnico(e.getMessage());
			expDao.setMensajeUsuario("Se presentaron problemas al intentar obtener registro del Tercero.");
			throw expDao;
		}finally{
			session.close();
		}
		
		return tercero;
	}

	public List<TbTercero> listarTercero() throws ExcepcionesDAO {
		List<TbTercero> lista = null;
		
		try{
			session = getSession();
			criteria = session.createCriteria(TbTercero.class);
			lista = criteria.list();
		}catch (HibernateException e) {
			expDao = new ExcepcionesDAO();
			expDao.setMensajeTecnico(e.getMessage());
			expDao.setMensajeUsuario("Se presentaron problemas al intentar obtener listado de Terceros.");
			throw expDao;
		}finally {
			session.close();
		}
		
		return lista;
	}

}
