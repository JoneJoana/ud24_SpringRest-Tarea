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
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	
	@Column(name = "nombre_completo")//no hace falta si se llama igual
	private String nombre_completo;	
	
	@Column(name = "puesto")//no hace falta si se llama igual
	private enumPuestos trabajo;
	
	@Column(name = "salario")//no hace falta si se llama igual
	private double salario;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaAlta;
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaBaja;
	
	//Constructores
	
	public Empleado() {	}	

	/**
	 * @param id
	 * @param nombre_completo
	 * @param trabajo
	 * @param fechaAlta
	 * @param fechaBaja;
	 */
	public Empleado(int id, String nombre, enumPuestos trabajo, Date fechaAlta, Date fechaBaja) {
		this.id = id;
		this.nombre_completo = nombre;
		this.trabajo = trabajo;
		this.salario = getSalario();
		this.fechaAlta = fechaAlta;
		this.fechaBaja = fechaBaja;
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

	public double getSalario() {
		return trabajo.getSalario();
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Date getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	//Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre_completo=" + nombre_completo + ", trabajo=" + trabajo + ", salario="
				+ salario + ", fechaAlta=" + fechaAlta + ", fechaBaja=" + fechaBaja + "]";
	}	
		
}