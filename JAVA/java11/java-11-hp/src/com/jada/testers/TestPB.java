package com.jada.testers;

import com.jada.clases.AlumnoB;
import com.jada.clases.PersonaP;

public class TestPB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlumnoB a = new AlumnoB(123, 8.5, "Armando", 20);
		PersonaP b= new PersonaP("Pedro", 30);
		System.out.println(a.getNombre());
		System.out.println(a.getPromedio());
		System.out.println(a.toString());
		a.mostrarDatos();
		a.mostrarDatos("Lara");

	}

}
