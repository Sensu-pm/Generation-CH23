package hilos.jada.pruebas;

import hilos.jada.formathread.Hilo1;

public class TestThread {
	public static void main(String[] args) {
		Thread h = new Hilo1("Naruto");
		h.start();
		Thread h0 = new Hilo1("Sasuke");
		h0.start();
		Thread h1 = new Hilo1 ("Sakura");
		h1.start();
		
		
		System.out.println(h.getState());
	}

}
