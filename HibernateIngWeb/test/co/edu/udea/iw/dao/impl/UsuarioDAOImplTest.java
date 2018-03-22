package co.edu.udea.iw.dao.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import co.edu.udea.iw.dao.UsuarioDAO;
import co.edu.udea.iw.dto.Rol;
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
			for(Usuario usuario: lista){
				System.out.println(usuario.getNombre()+ ":" + usuario.getRol().getNombre());
			}
		}catch(DriverException e)
		{
			fail(e.getMessage());
		}
	}
	
	@Test
	void testInsertar() {
		UsuarioDAO dao = null;
		Usuario usuario = null;
		Rol rol = null;
		try {
			dao = new UsuarioDAOImpl();
			usuario = new Usuario();
			usuario.setLogin("rgr2228");
			usuario.setNombre("Raul");
			usuario.setApellidos("Gomez");
			usuario.setContrasena("123");
			rol = new Rol();
			rol.setCodigo("ADM");
			rol.setNombre("Administrador");
			usuario.setRol(rol);
			dao.insertar(usuario);
		}catch(DriverException e) {
			fail(e.getMessage());
		}
	}

}
