package com.ud24_SpringRestTarea.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ud24_SpringRestTarea.dto.Empleado;
import com.ud24_SpringRestTarea.dto.enumPuestos;

//interface que hereta de JPA repo dnde estan todas las funciones para 
//trabajar  con la bbdd. Empleado es de donde va a mapear, Integer el tipo de la PK
public interface IEmpleadoDAO extends JpaRepository<Empleado,Integer>{

	//listar clientes por campo nombre
	public List<Empleado> findByTrabajo(enumPuestos trabajo);
	
}