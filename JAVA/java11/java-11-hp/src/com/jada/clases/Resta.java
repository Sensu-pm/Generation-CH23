package com.jada.clases;

public class Resta implements OperacionesAritmeticas, Mensajes {
	double a;
	double b;

	public Resta() {
		
	}
	
	public Resta(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	

	@Override
	public double restar() {

		return this.a-this.b;
	}
	@Override
	public double sumar() {

		return 0;
	}

	@Override
	public double multiplicar() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double dividir() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void mensaje() {
		// TODO Auto-generated method stub
		System.out.println("Hola, soy una suma. ");
		
	}

}