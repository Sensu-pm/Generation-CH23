package colecciones.jada;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MisCollections {

	public static void main(String[] args) {
		MisCollections c = new MisCollections();
		
		//imprimir(c.listaCollection());
		//imprimir(c.setCollections());
		//imprimir((Collection) c.mapCollections());
		
		mapCollections();
		//wrapperClass();

	}
	
	
	public static void mapCollections() {
		Map miMap = new HashMap();
		miMap.put("valor1", "Juan");
		miMap.put("valor2", "Maria");
		miMap.put("valor3", "Arturo");
		miMap.put("valor4", "Karla");
		
		imprimir(miMap.keySet());
		imprimir(miMap.values());

	}
	
	Set setCollections() {
		Set miSet = new HashSet();
		miSet.add("uno");
		miSet.add("dos");		
		miSet.add("tres");		
		miSet.add("cuatro");
		miSet.add("dos");
	
		
		//Ejemplos personales de Set
		miSet.remove("uno"); //debemos especificar cual queremos quitar
		System.out.println("tamaño de la lista" + miSet.size());
		
		//miSet.clear();
		
		boolean em= miSet.isEmpty(); //dice true si esta vacio, debemos especificar el tipo que nos regresara
		
		System.out.println(em);
		
		Object a[]=  miSet.toArray();
		for (int i = 0; i < a.length; i++) {
			System.out.println("Este es un areglo"+ a[i]);
		}
		return miSet;
	}
	
	
	
	private ArrayList listaCollection() {
		ArrayList miLista = new ArrayList();
		System.out.println(miLista+"tamaño de la lista "+ miLista.size());
		System.out.println("esta vacia "+miLista.isEmpty());
		
		miLista.add("1");
		miLista.add(0, 2);
		miLista.add(3);
		miLista.add(0, "patote");
		
		miLista.set(0, miLista);
		miLista.remove(2);
		
		System.out.println(miLista+"tamaño de la lista "+ miLista.size());
		System.out.println("esta vacia "+miLista.isEmpty());
		
		boolean e = miLista.contains(3);
		System.out.println("---->"+ e);
		
		return miLista;

	}
	
	
	
	private static void imprimir(Collection collection) {
		
		for (Object elementos : collection) {
			System.out.println("elementos "+ elementos);
		}

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
