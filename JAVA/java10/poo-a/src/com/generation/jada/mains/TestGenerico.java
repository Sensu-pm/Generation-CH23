package com.generation.jada.mains;

import com.generation.jada.clases.ClaseGenerica;

public class TestGenerico {
	public static void main(String[] args) {
		ClaseGenerica <Integer> intObj = new ClaseGenerica<Integer>(55);
		ClaseGenerica <String> caracteresObj = new ClaseGenerica<String>("Prueba");
		
		intObj.claseTipo();
		caracteresObj.claseTipo();
	}

}
