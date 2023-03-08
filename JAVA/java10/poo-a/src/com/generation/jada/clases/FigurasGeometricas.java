package com.generation.jada.clases;

public class FigurasGeometricas {
	private double perimetro;
	private double area;
	
	//Constructor vacio. Inicializa variables
	public FigurasGeometricas() {
		
	}
//El constructor sobrecargado, inicializa miembros de datos de la clase
	public FigurasGeometricas(double perimetro, double area) {
		
		this.perimetro = perimetro;
		this.area = area;
	}
	public double getPerimetro() {
		return perimetro;
	}
	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	
	
	public class Taco {
		private String tipoDeTortilla;
		private String guisado;
		private int numeroDeTortilla;
		private String tamañoDeTortilla;
		private float precio;
		//aributos
		public Taco() {
			
		}
		public Taco(String tipoDeTortilla, String guisado, int numeroDeTortilla, String tamañoDeTortilla, float precio) {
			super();
			this.tipoDeTortilla = tipoDeTortilla;
			this.guisado = guisado;
			this.numeroDeTortilla = numeroDeTortilla;
			this.tamañoDeTortilla = tamañoDeTortilla;
			this.precio = precio;
		}
		
		public String getTipoDeTortilla() {
		return tipoDeTortilla;
		}
		public void setTipoDeTortilla(String tipoDeTortilla) {
			this.tipoDeTortilla = tipoDeTortilla;
		}
		public String getGuisado() {
			return guisado;
		}
		public void setGuisado(String guisado) {
			this.guisado = guisado;
		}
		public int getNumeroDeTortilla() {
			return numeroDeTortilla;
		}
		public void setNumeroDeTortilla(int numeroDeTortilla) {
			this.numeroDeTortilla = numeroDeTortilla;
		}
		public String getTamañoDeTortilla() {
			return tamañoDeTortilla;
		}
		public void setTamañoDeTortilla(String tamañoDeTortilla) {
			this.tamañoDeTortilla = tamañoDeTortilla;
		}
		public float getPrecio() {
			return precio;
		}
		public void setPrecio(float precio) {
			this.precio = precio;
		}
	

	

}
