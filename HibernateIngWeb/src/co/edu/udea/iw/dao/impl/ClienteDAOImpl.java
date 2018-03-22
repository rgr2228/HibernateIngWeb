package co.edu.udea.iw.dao.impl;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

import co.edu.udea.iw.dao.ClienteDAO;
import co.edu.udea.iw.dao.DataSource;
import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.exception.DriverException;

public class ClienteDAOImpl implements ClienteDAO {

	@Override
	public void insertar(Cliente cliente) throws DriverException {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizar(Cliente cliente) throws DriverException {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Cliente cliente) throws DriverException {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Cliente> obtener() throws DriverException {
		Session session = null;
		DataSource ds = new DataSource();
		List<Cliente> clientes = null;
		try {
			session = ds.getSession();
			Criteria crit = session.createCriteria(Cliente.class).addOrder(Order.asc("nombre"));
			clientes = crit.list();
		}catch(HibernateException e) {
			throw new DriverException("Error consultando las ciudades",e);
		}
		return clientes;
	}

}
