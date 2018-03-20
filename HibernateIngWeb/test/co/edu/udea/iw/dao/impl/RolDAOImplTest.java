package co.edu.udea.iw.dao.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import co.edu.udea.iw.dao.RolDAO;
import co.edu.udea.iw.dto.Rol;
import co.edu.udea.iw.exception.DriverException;

class RolDAOImplTest {

	@Test
	void testObtener() {
		RolDAO dao = null;
		List<Rol> lista = null;
		try {
			dao = new RolDAOImpl();
			lista = dao.obtener();
			assertTrue(lista.size()>0);
		}catch(DriverException e)
		{
			fail(e.getMessage());
		}
	}

}
