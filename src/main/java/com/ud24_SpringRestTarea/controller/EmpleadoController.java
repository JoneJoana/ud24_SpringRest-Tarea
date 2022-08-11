package com.ud24_SpringRestTarea.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ud24_SpringRestTarea.dto.Empleado;
import com.ud24_SpringRestTarea.dto.enumPuestos;
import com.ud24_SpringRestTarea.service.EmpleadoServiceImpl;

@RestController
@RequestMapping("/api")
public class EmpleadoController {
	
	@Autowired
	EmpleadoServiceImpl empleadoServiceImpl;
	
	@GetMapping("/empleados")
	public List<Empleado> listarEmpleados(){
		return empleadoServiceImpl.listarEmpleados();
	}
	
	@GetMapping("/empleados/trabajo/{trabajo}")	
	public List<Empleado> listarEmpleadoXTrabajo(@PathVariable(name="trabajo") enumPuestos trabajo){
		return empleadoServiceImpl.listarEmpleadoXTrabajo(trabajo);
	}
	
	@GetMapping("/empleados/{id}")
	public Empleado buscEmplXID(@PathVariable(name="id") int id) {		
		return empleadoServiceImpl.buscEmplXID(id);
	}
	
	@PostMapping("/empleados")
	public Empleado guardarEmpleado(@RequestBody Empleado empleado) {
		return empleadoServiceImpl.guardarEmpleado(empleado);
	}
	
	@DeleteMapping("/empleados/{id}")
	public void eliminarEmpleado(@PathVariable(name="id") int id) {
		empleadoServiceImpl.eliminarEmpleado(id);
	}
	
	@PutMapping("/empleados/{id}")
	public Empleado guardarEmpleado(@PathVariable(name="id") int id, @RequestBody Empleado empleado) {
		Empleado empleado_selec = new Empleado();
		Empleado empleado_actualizado = new Empleado();
		
		empleado_selec = empleadoServiceImpl.buscEmplXID(id);
		
		empleado_selec.setTrabajo(empleado.getTrabajo());
		empleado_selec.setFechaAlta(empleado.getFechaAlta());	
		empleado_selec.setFechaBaja(empleado.getFechaBaja());
		empleado_selec.setSalario(empleado.getSalario());
		
		empleado_actualizado = empleadoServiceImpl.guardarEmpleado(empleado_selec);
		
		return empleado_actualizado;
	}
	
}
