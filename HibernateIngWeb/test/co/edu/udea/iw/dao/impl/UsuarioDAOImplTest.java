package co.edu.udea.iw.dao.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import co.edu.udea.iw.dao.UsuarioDAO;
import co.edu.udea.iw.dto.Usuario;
import co.edu.udea.iw.exception.DriverException;

class UsuarioDAOImplTest {


	@Test
	void testObtener() {
		UsuarioDAO dao = null;
		List<Usuario> lista = null;
		try {
			dao = new UsuarioDAOImpl();
			lista = dao.obtener();
			assertTrue(lista.size()>0);
		}catch(DriverException e)
		{
			fail(e.getMessage());
		}
	}

}
