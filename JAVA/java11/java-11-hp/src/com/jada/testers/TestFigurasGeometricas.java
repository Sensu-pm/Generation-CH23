package com.jada.testers;

import com.jada.clases.*;

public class TestFigurasGeometricas {
	public static void main(String[] args) {
		FigurasGeometricas rectangulo = new Rectangulo(10, 2);
		FigurasGeometricas circulo = new Circulo(2);
		FigurasGeometricas triangulo = new Triangulo(4,7);
		FigurasGeometricas cuadrado = new Cuadrado(5);
		
		
		
		
		System.out.println("El area del rectangulo es: "+rectangulo.areas());
		System.out.println("El area del circulo es: "+circulo.areas());
		System.out.println("El area del triangulo es: "+triangulo.areas());
		System.out.println("El area del cuadrado es: "+cuadrado.areas());

		
		System.out.println(rectangulo.toString());
		System.out.println(circulo.toString());
		System.out.println(triangulo.toString());
		System.out.println(cuadrado.toString());
		
		rectangulo.pedirDatos();
		System.out.println(rectangulo.toString());
		System.out.println(rectangulo.areas());
		
		
	}
}
