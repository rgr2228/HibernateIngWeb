package co.edu.udea.iw.dao;

import java.util.List;

import co.edu.udea.iw.dto.Usuario;
import co.edu.udea.iw.exception.DriverException;

public interface UsuarioDAO {
	public void insertar(Usuario usuario) throws DriverException;
	public void actualizar(Usuario usuario) throws DriverException;
	public void eliminar(Usuario  usuario) throws DriverException;
	public List<Usuario> obtener()throws DriverException;
}
