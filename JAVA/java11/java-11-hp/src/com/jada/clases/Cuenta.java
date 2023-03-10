package com.jada.clases;

public class Cuenta {
	private float saldo;
	private int numConsignaciones= 0;
	private int numRetiros = 0; 
	private float tasaAnual= .10f;
	private float comisionMensual = 0;

public Cuenta(float saldo, int numConsignaciones, int numRetiros, float tasaAnual, float comisionMensual) {
		super();
		this.saldo = saldo;
		this.tasaAnual = tasaAnual;
		
	}
	
	private void consignar() {
		return 
		

	}
	
	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getNumConsignaciones() {
		return numConsignaciones;
	}

	public void setNumConsignaciones(int numConsignaciones) {
		this.numConsignaciones = numConsignaciones;
	}

	public int getNumRetiros() {
		return numRetiros;
	}

	public void setNumRetiros(int numRetiros) {
		this.numRetiros = numRetiros;
	}

	public float getTasaAnual() {
		return tasaAnual;
	}

	public void setTasaAnual(float tasaAnual) {
		this.tasaAnual = tasaAnual;
	}

	public float getComisionMensual() {
		return comisionMensual;
	}

	public void setComisionMensual(float comisionMensual) {
		this.comisionMensual = comisionMensual;
	}
	

}
