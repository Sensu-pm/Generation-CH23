package ciclos.forwhiledo;

public class UsoFor {
	public void cicloFor() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("el iterador --->"+ i);
		}

	}
	
	public void letrasfor() {
		for (int i = 'A'; i <= 'Z'; i++) {
			
			char letra = (char) i;
			System.out.println();
			System.out.println("Soy ----> "+ letra + ", ");
		}
		

	}

}
