package co.edu.udea.iw.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

import co.edu.udea.iw.dao.DataSource;
import co.edu.udea.iw.dao.RolDAO;
import co.edu.udea.iw.dto.Rol;
import co.edu.udea.iw.exception.DriverException;

public class RolDAOImpl implements RolDAO {

	@Override
	public void insertar(Rol rol) throws DriverException {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizar(Rol rol) throws DriverException {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Rol rol) throws DriverException {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Rol> obtener() throws DriverException {
		Session session = null;
		DataSource ds = new DataSource();
		List<Rol> roles = null;
		try {
			session = ds.getSession();
			Criteria crit = session.createCriteria(Rol.class).addOrder(Order.asc("nombre"));
			roles = crit.list();
		}catch(HibernateException e) {
			throw new DriverException("Error consultando los roles",e);
		}
		return roles;
	}

}
