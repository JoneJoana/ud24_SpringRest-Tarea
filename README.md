U24_SpringRest

Creacion de un proyecto Spring utilizando Maven

EndPoints API

get list todos los empleados
/api/empleados

get empleado por trabajo
/api/empleados/trabajo/{trabajo}

posibles puestos de trabajo: 
PROGR_JUNIOR, PROGR_MIDDLE, PROGR_SENIOR, RRHH, 
TEAMLEAD, TECHLEAD, PROJECT_MANAGER

get empleado por ID
/api/empleados/{id}

post empleado - pasar body JSON
/api/empleados

delete empleado
/api/empleados/{id}

put - actualizar empleado - pasar body JSON
/api/empleados/{id}
