package com.ud24_SpringRestTarea.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ud24_SpringRestTarea.dto.Empleado;
import com.ud24_SpringRestTarea.dto.enumPuestos;
import com.ud24_SpringRestTarea.dao.IEmpleadoDAO;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

	//Utilizamos los metodos de la interface IEmpleadoDAO, es como si instaciaramos.
	@Autowired
	IEmpleadoDAO iEmpleadoDao;
	
	@Override 
	public List<Empleado> listarEmpleados() {
		
		return iEmpleadoDao.findAll();
	}

	@Override 
	public Empleado guardarEmpleado(Empleado empleado) {
		
		return iEmpleadoDao.save(empleado);		
	}

	@Override 
	public Empleado buscEmplXID(int id) {
		
		return iEmpleadoDao.findById(id).get();
	}

	@Override  
	public List<Empleado> listarEmpleadoXTrabajo(enumPuestos trabajo) {
		
		return iEmpleadoDao.findByTrabajo(trabajo);
	}

	@Override
	public void eliminarEmpleado(int id) {
		
		iEmpleadoDao.deleteById(id);		
	}	

}
