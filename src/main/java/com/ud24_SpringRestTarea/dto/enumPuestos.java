package com.ud24_SpringRestTarea.dto;

public enum enumPuestos {
	//las opciones de puesto/trabajo tiene ya un atributo de salario predeterminado
	PROGR_JUNIOR(1000), PROGR_MIDDLE(1500), PROGR_SENIOR(1800), RRHH(1300), 
	TEAMLEAD(2200), TECHLEAD(2100), PROJECT_MANAGER(3000);
	
	private int salario;
	
	public String getName() {
		return name();
	}
		
	private enumPuestos (int salario){
		this.salario = salario;
	}
	
	public int getSalario() {
		return salario;
	}	
	
	
}
