package clases;

import java.util.Scanner;

public class NuevoHola {
	private String nombre;
	//Para inicializar la variable obj de tipo string
	//Usamos el metodo constructor
	
	public NuevoHola(String nombre) {
		this.nombre = nombre;
	}
	public void saludo() {
		System.out.print("Hola desde Java con sts de nuez "+ this.nombre);
		
	}

	public void saludoConNombre() {
		System.out.print("Hola, tu eres " + this.nombre);
	}

}
