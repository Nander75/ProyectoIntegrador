package com.dam.model;

public class DatosUsuarioPI {

	private String usuario;
	private String password;
	
	public DatosUsuarioPI(String usuario, String password) {
		this.usuario = usuario;
		this.password = password;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getPassword() {
		return password;
	}
}
