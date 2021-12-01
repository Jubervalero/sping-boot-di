package com.programacion.springboot.di.app.models.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("miserviciocomplejo")
@Primary
public class Miserviciocomplejo implements IServicio {
	
	public String operacion() {
		return " ejecutando algun proceso importante... complicado"; 
	}
	
}	