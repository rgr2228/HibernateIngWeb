package co.edu.udea.iw.dao;

import java.util.List;

import co.edu.udea.iw.dto.Rol;
import co.edu.udea.iw.exception.DriverException;

public interface RolDAO {

	public void insertar(Rol rol) throws DriverException;
	public void actualizar(Rol rol) throws DriverException;
	public void eliminar(Rol rol) throws DriverException;
	public List<Rol> obtener()throws DriverException;
}
