package com.jada.clases;

public class Cuadrado extends FigurasGeometricas {
	private double lado;
	
	public Cuadrado(double lado) {
		super("cuadrado");
		this.lado = lado;
		
	}

		@Override
		public double areas() {
			return lado * lado;
		}

		public double getlado() {
			return lado;
		}

		public void setBase(double lado) {
			this.lado = lado;
		}

		
		
		
	}