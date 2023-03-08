package com.generation.jada.clases;

public class Taco {
	private String tipoDeTortilla;
	private String guisado;
	private int numeroDeTortilla;
	private String tamañoDeTortilla;
	private float precio;

	// aributos
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

	@Override
	public String toString() {

		return "Taco [tipoDeTortilla=" + tipoDeTortilla + ", guisado= " + guisado + ", numero de tortillas"
				+ numeroDeTortilla + ", Tamaño de tortilla =" + tamañoDeTortilla + ", precio =" + precio + "]";
	}

}
