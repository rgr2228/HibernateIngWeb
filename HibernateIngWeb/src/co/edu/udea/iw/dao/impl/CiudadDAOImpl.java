package co.edu.udea.iw.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

import co.edu.udea.iw.dao.CiudadDAO;
import co.edu.udea.iw.dao.DataSource;
import co.edu.udea.iw.dto.Ciudad;
import co.edu.udea.iw.exception.DriverException;

public class CiudadDAOImpl implements CiudadDAO {

	@Override
	public void insertar(Ciudad ciudad) throws DriverException {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizar(Ciudad ciudad) throws DriverException {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Ciudad ciudad) throws DriverException {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Ciudad> obtener() throws DriverException {
		Session session = null;
		DataSource ds = new DataSource();
		List<Ciudad> ciudades = null;
		try {
			session = ds.getSession();
			Criteria crit = session.createCriteria(Ciudad.class).addOrder(Order.asc("nombre"));
			ciudades = crit.list();
		}catch(HibernateException e) {
			throw new DriverException("Error consultando las ciudades",e);
		}
		return ciudades;
	}

}
