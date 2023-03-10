package hilos.jada.pruebas;

import hilos.jada.formarunnable.Hilo2;

public class TestRunnable {
	public static void main(String[] args) {
		Hilo2 ht= new Hilo2 ("Luffy");
		Thread st = new Thread(ht);
		st.start();
		
		new Thread(new Hilo2("Sanji")).start();
		new Thread(new Hilo2("Zoro")).start();

	}
}
