package co.edu.udea.iw.dao;

import java.util.List;

import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.exception.DriverException;

public interface ClienteDAO {
	public void insertar(Cliente cliente) throws DriverException;
	public void actualizar(Cliente cliente) throws DriverException;
	public void eliminar(Cliente cliente) throws DriverException;
	public List<Cliente> obtener()throws DriverException;
}
