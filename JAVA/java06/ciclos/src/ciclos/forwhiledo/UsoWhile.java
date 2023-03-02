package ciclos.forwhiledo;

import java.util.Scanner;

public class UsoWhile {
Scanner entrada = new Scanner(System.in);

	public void cicloW() {
		// TODO Auto-generated method stub
				int iterador = 0;
		while (iterador < 10) {
			System.out.println("Iterador "+ iterador);
			iterador = iterador +1;
		}

	}
	/* while uso centinela*/
	 public void centinelaW() {
		final int centinela = -1;
		System.out.print("Introduzca una nota: ");
		int nota = entrada.nextInt();
		while (nota != centinela) {
			System.out.println("La nota es: "+ nota);
			System.out.println("Introduzca una nota: "+ nota);
			 nota = entrada.nextInt();

	}
		System.out.println("Fin");
*/
	 }
		public void banderaW(){
			
			boolean valorb = false;
			while (!valorb) {
				System.out.print("Introduzca un valor númerico: ");
				int valorx = entrada.nextInt();
				if (valorx > 0 && valorx <= 5) {
					int potaxio = (int)Math.pow(valorx, 2);
					System.out.println("El resultado ---> "+ potaxio);
				}else {
					valorb = true ;
					System.out.println("Adios");
				}
			}
			
			
			
			
			
			//System.out.println("Hola soy el metodo estatico");
			//Math.pow(2, 2);
			//return 0.0;
		}

}