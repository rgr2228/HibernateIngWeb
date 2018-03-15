package co.edu.udea.iw.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import co.edu.udea.iw.exception.DriverException;

/**
 * 
 * @author raul.gomezr
 *
 */

public class DataSource {
	
	private final String RESOURCE = "co/edu/udea/iw/dao/hibernate.cfg.xml";
	
	public Session getSession() throws DriverException {
		SessionFactory sessionFactory = null;
		Configuration configuration = new Configuration();
		try {
			if(sessionFactory == null) {
				configuration.configure(RESOURCE);
				sessionFactory = configuration.buildSessionFactory();
			}
			return sessionFactory.openSession();
		}catch(HibernateException e) {
			throw new DriverException(e);
		}
	}
	
}
