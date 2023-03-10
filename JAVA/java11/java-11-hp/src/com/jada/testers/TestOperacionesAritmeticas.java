package com.jada.testers;

import javax.swing.plaf.multi.MultiButtonUI;

import com.jada.clases.Division;
import com.jada.clases.Mensajes;
import com.jada.clases.Multiplicacion;
import com.jada.clases.OperacionesAritmeticas;
import com.jada.clases.Resta;
import com.jada.clases.Suma;

public class TestOperacionesAritmeticas {
	
	
public static void main(String[] args) {
	Suma s= new Suma(5,2);
	OperacionesAritmeticas ss= new Suma(10,3);
	Mensajes sss= new Suma();
	
	Resta r= new Resta(6, 2);
	OperacionesAritmeticas rr = new Resta(9,3);
	
	Multiplicacion m= new Multiplicacion(7, 3);
	OperacionesAritmeticas mm= new Multiplicacion(9, 4);
	
	Division d= new Division(30, 3);
	OperacionesAritmeticas dd= new Division(16, 4);
	
	System.out.println("Suma"+ s.sumar());
	System.out.println("Operaciones aritmeticas "+ss.sumar());
	s.mensaje();
	sss.mensaje();
	System.out.println("Resta"+r.restar());
	System.out.println("Resta"+rr.restar());
	
	System.out.println("Multiplicacion"+m.multiplicar());
	System.out.println("Multiplicacion"+mm.multiplicar());
	
	System.out.println("Division"+d.dividir());
	System.out.println("Division"+dd.dividir());
}
}
