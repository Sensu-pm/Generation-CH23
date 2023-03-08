package com.generation.jada.mains;

import com.generation.jada.clases.Taco;

public class TacoTest {
	public static void main(String[] args) {
		Taco t=new Taco();
		
		t.setGuisado("Lengua en salsa verde");
		t.setNumeroDeTortilla(2);
		t.setTipoDeTortilla("Maiz");
		t.setTamañoDeTortilla("grande");
		t.setPrecio(30);
		System.out.println("Orden de tacos: "+t.getGuisado()+"con tortilla de "+ t.getTipoDeTortilla()+ "tamaño"+t.getTamañoDeTortilla()+"con "+t.getNumeroDeTortilla()+"piezas, a solo" +t.getPrecio());
		
		
		t.toString();
		System.out.println(t.toString());
		
	}
}
