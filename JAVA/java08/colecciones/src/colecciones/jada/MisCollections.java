package colecciones.jada;

public class MisCollections {

	public static void main(String[] args) {
		
		wrapperClass();

	}
	
	static void wrapperClass() {
		//byte, short, char, long, float, int, double
		
		byte numeroB = 127;
		System.out.println("Tamaño de un byte "+ Byte.SIZE);
		System.out.println("Valor Max "+Byte.MAX_VALUE);
		System.out.println("Valor min "+ Byte.MIN_VALUE);
		System.out.println("----->"+numeroB);
		
		int numeroI = 2147483647;
		System.out.println("Tamaño de un entero: "+Integer.BYTES);
		System.out.println("Tamaño de un entero: "+Integer.SIZE);
		System.out.println("Valor Max "+Integer.MAX_VALUE);
		System.out.println("Valor min "+ Integer.MIN_VALUE);
		System.out.println("----->"+numeroI);
		
		
		short numeroS = 32767;
		System.out.println("Tamaño de un short: "+Short.BYTES);
		System.out.println("Tamaño de un short: "+Short.SIZE);
		System.out.println("Valor Max "+Short.MAX_VALUE);
		System.out.println("Valor min "+ Short.MIN_VALUE);
		System.out.println("----->"+numeroS);
		
		


	}
	
	

}
