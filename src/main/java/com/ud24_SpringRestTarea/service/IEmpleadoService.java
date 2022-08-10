package com.ud24_SpringRestTarea.service;

import com.ud24_SpringRestTarea.dto.Empleado;
import com.ud24_SpringRestTarea.dto.enumPuestos;

import java.util.List;

public interface IEmpleadoService {
	
	//Metodos del CRUD
	public List<Empleado> listarEmpleados(); //ALL -  GET
	
	public Empleado guardarEmpleado(Empleado empleado); //CREATE || UPDATE
	
	public Empleado buscEmplXID(int id); //READ, SOLO 1 REGISTRO O NINGUNO
	
	public List<Empleado> listarEmpleadoXTrabajo(enumPuestos trabajo); // GET
		
	public void eliminarEmpleado(int id);  //DELETE
	
}
