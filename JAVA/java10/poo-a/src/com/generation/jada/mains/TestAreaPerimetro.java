package com.generation.jada.mains;

import com.generation.jada.clases.AreaPerimetro;
import com.generation.jada.clases.FigurasGeometricas;

public class TestAreaPerimetro {
public static void main(String[] args) {
	AreaPerimetro ap = new AreaPerimetro();
	FigurasGeometricas fg = new FigurasGeometricas();	
	fg.setArea(ap.areaCuadrado(5));
	System.out.println("Area Cuadrado---> "+ fg.getArea());
	
	fg.setPerimetro(ap.perimetroCuadrado(5));
	System.out.println("Perimetro del cuadrado --->"+ fg.getPerimetro());
	
	fg.setArea(ap.areaTriangulo(15, 10));
	System.out.println("Area del triangulo "+ fg.getArea());
	
	fg.setPerimetro(ap.perimetroTriangulo(15, 15, 15));
	System.out.println("Perimetro del triangulo "+fg.getPerimetro());
	
	fg.setArea(ap.areaCirculo(10, 3.14));
	System.out.println("Area de circulo"+ fg.getArea());
	
	fg.setPerimetro(ap.perimetroCirculo(20, 3.14));
	System.out.println("Perimetro del circulo "+fg.getPerimetro());
}
}
