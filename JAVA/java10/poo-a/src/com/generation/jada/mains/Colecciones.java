package com.generation.jada.mains;
import java.util.*;
public class Colecciones {
	public static void main(String[] args) {
		List <String> coleccion = new ArrayList<String>();
		coleccion.add("colecciones");
		coleccion.add("cohorte23");
		
		/*
		coleccion.add(13); con <String> estamos parametrizando el arraylist
		coleccion.add(15.15);
		coleccion.add('a');*/
		
		for(int i=0; i< coleccion.size();i++) {
			System.out.println(coleccion.get(i));
		}
	
}
}
