package hilos.jada.formathread;

import java.util.Iterator;

public class Hilo1 extends Thread {

	public Hilo1(String name) {
		super(name);

	}

	@Override
	public void run() {

		super.run();
		System.out.println("se inicia el Thread o Hilo " + this.getName());
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

		System.out.println("Termina el Thread o Hilo " + this.getName());

	}

}
