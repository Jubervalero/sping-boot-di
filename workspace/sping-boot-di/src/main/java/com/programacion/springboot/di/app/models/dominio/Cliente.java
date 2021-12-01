package com.programacion.springboot.di.app.models.dominio;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cliente {
	@Value("{$cliente.nombre$}")
	private String nombre;
	
	@Value("{$cliente.apellido$}")
	private String apellido;
	
	@Value("{$cliente.nit$}")
	private Integer nit;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getNit() {
		return nit;
	}

	public void setNit(Integer nit) {
		this.nit = nit;
	}

}
