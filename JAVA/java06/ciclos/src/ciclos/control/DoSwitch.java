package ciclos.control;

import java.util.Scanner;

import ciclos.forwhiledo.UsoWhile;

public class DoSwitch {
	public void controlador() {
		Scanner s = new Scanner(System.in);
		Menus mp = new Menus();
		UsoWhile uw = new UsoWhile();
		
		int opcion = 0;
		do {
			mp.menuPrincipal();
			System.out.println("Introduzca una opcion : ");
			 opcion = s.nextInt();
			 switch (opcion) {
			case 1:
				uw.cicloW();
				break;
				switch (opcion) {
			case 2:
			    uw.centinelaW();
				break;
				switch (opcion) {
			case 3:
				uw.banderaW()
				break;

			default:
				break;
			}
			 
		} while (opcion !=7);

	}

}
