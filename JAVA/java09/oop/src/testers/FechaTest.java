package testers;

import oop.clases.Fecha;

public class FechaTest {
	public static void main(String[] args) {
		Fecha f = new Fecha(0, 0, 0);
		f.setDia(6);
		f.setMes(3);
		f.setAnio(2023);
		System.out.println(f.diaMesAño());
	}

}
