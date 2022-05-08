package com.chisto.example.springboot.models;

public class Usuario {

	private String nombre;
	private String apellido1;
	private String email;

	public Usuario() {
	}
	
	public Usuario(String nombre, String apellido1, String email) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.email = email;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
