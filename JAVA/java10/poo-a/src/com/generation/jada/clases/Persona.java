package com.generation.jada.clases;

public class Persona {
	private String nombre;
	private int edad;
	private int nss;
	//aributos
	public Persona() {
		
	}
	
	//Constructor vacio
	public Persona(String nombre, int edad, int nss) {
		this.nombre = nombre;
		this.edad = edad;
		this.nss = nss;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getNss() {
		return nss;
	}
	public void setNss(int nss) {
		this.nss = nss;
	}

}
