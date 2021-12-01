package com.programacion.springboot.di.app.models.services;


import org.springframework.stereotype.Component;

@Component("miserviciosimple")
 
public class Miservicio implements IServicio {
	
	public String operacion() {
		return " ejecutando algun proceso importante... simple"; 
	}
	
}	