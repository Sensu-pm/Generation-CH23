package com.generation.jada.ManejoExcepciones;

import java.util.Scanner;

public class NoComprobadasExceptions {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		System.out.print("Introduzca un valor: ");
		int divisor ;
		
		try {
			divisor = Integer.parseInt(dato.next());
			int division = 10/divisor;
		System.out.println("---> "+ division);
		} catch (ArithmeticException e) { //Exception agarra caualquier excepcion, pero ArithmeticException solo de tipo aritmetico.
			System.out.println("Capturando la excepcion"+e.getMessage());
			
		} catch(NumberFormatException nfe) {
			System.out.println("El dato es un caracter "+nfe.getMessage());
		}finally {
			System.out.println("Este bloque es opcional, se ejecuta con o sin la exception");
		}
		System.out.println("continuamos con el flujo de la aplicacion ");
		
		
	}

}
