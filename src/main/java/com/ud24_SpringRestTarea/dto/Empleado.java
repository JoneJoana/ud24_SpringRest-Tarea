package com.ud24_SpringRestTarea.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="empleado")//en caso que la tabla sea diferente
public class Empleado {

	//Atributos de entidad cliente
	@Id
	//busca ultimo valor e incrementa desde id final de db
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nombre_completo")//no hace falta si se llama igual
	private String nombre_completo;	
	
	@Column(name = "trabajo")//no hace falta si se llama igual
	private enumPuestos trabajo;
	
	@Column(name = "salario")//no hace falta si se llama igual
	private int salario;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_alta")
	private Date fecha_alta;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_baja")
	private Date fecha_baja;
	
	//Constructores
	public Empleado() {	}	
	
	/**
	 * @param nombre_completo
	 * @param trabajo
	 * @param fechaAlta
	 * @param fechaBaja;
	 */
	public Empleado(String nombre, enumPuestos trabajo, Date fechaAlta, Date fechaBaja) {
		this.nombre_completo = nombre;				
		this.fecha_alta = new Date();
		this.fecha_baja = fechaBaja;							
		this.trabajo = trabajo;
		this.salario = trabajo.getSalario();			
	}
	
	//Getters y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre_completo() {
		return nombre_completo;
	}

	public void setNombre_completo(String nombre_completo) {
		this.nombre_completo = nombre_completo;
	}

	public enumPuestos getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(enumPuestos trabajo) {
		this.trabajo = trabajo;
	}

	public int getSalario() {
		return salario;
	}
	
	public void setSalario(int salario) {
		this.salario = salario;
	}

	public Date getFechaAlta() {
		return fecha_alta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fecha_alta = fechaAlta;
	}
	
	public Date getFechaBaja() {
		return fecha_baja;
	}
	
	public void setFechaBaja(Date fechaBaja) {
		this.fecha_baja = fechaBaja;
	}

	
	//Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre_completo=" + nombre_completo + ", trabajo=" + trabajo + ", salario="
				+ salario + ", fechaAlta=" + fecha_alta + ", fechaBaja="+ fecha_baja + "]";
	}	
		
}