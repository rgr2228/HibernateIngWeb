package co.edu.udea.iw.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;

import co.edu.udea.iw.dao.DataSource;
import co.edu.udea.iw.dao.UsuarioDAO;
import co.edu.udea.iw.dto.Usuario;
import co.edu.udea.iw.exception.DriverException;

public class UsuarioDAOImpl implements UsuarioDAO {

	@Override
	public void insertar(Usuario usuario) throws DriverException {
		Session session = null;
		Transaction tx = null;
		DataSource ds = new DataSource();
		try {
			session = ds.getSession();
			tx = session.beginTransaction();
			session.save(usuario);
			tx.commit();
		}catch(HibernateException e) {
			throw new DriverException("Error al insertar usuario",e);
		}
	}

	@Override
	public void actualizar(Usuario usuario) throws DriverException {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Usuario usuario) throws DriverException {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Usuario> obtener() throws DriverException {
		Session session = null;
		DataSource ds = new DataSource();
		List<Usuario> usuarios = null;
		try {
			session = ds.getSession();
			Criteria crit = session.createCriteria(Usuario.class).addOrder(Order.asc("nombre"));
			usuarios = crit.list();
		}catch(HibernateException e) {
			throw new DriverException("Error consultando los usuarios",e);
		}
		return usuarios;
	}

}
