package com.sergiojimenez.model;

import java.util.UUID;

public class Banco {

	private String idBanco;
	private String nombre;

	public Banco() {
		this.idBanco = UUID.randomUUID().toString();
	}

	public String getIdBanco() {
		return idBanco;
	}

	public void setIdBanco(String idBanco) {
		this.idBanco = idBanco;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}