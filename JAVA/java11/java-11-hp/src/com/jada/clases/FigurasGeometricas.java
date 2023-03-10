package com.jada.clases;

public abstract class FigurasGeometricas {
	private String nombre;
	
	public FigurasGeometricas(String nombre) {
		this.nombre = nombre;
	}

	public abstract double areas(); //Una clase abstracta debe tener por lo menos un metodo abstracto

	@Override
	public String toString() {
		return "FigurasGeometricas [nombre=" + nombre+" "+areas() + "]";
	}

	public void pedirDatos() {
		// TODO Auto-generated method stub
		
	}

}
