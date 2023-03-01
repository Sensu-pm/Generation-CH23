package control;

import java.security.PublicKey;
import java.util.Scanner;

public class EstructuraIf {
	Scanner entrada = new Scanner(System.in);
    public void controlIf() {
        // TODO Auto-generated method stub
        /*
        if (condition) {
            
        }
        */
        long nota = 4;
        if (nota > 5) {
            System.out.print("Nota aprobada " + nota);
        }
        System.out.print("continua el control de flujo...");
        
        
        if (nota >= 5) {
            System.out.print("Nota aprobada " + nota);
        } else {
            System.out.print("Nota no aprobada " + nota);
        }
        
       
    }
  /*  public void divisible() {
    	// TODO Auto-generated method stub
    	System.out.print("Introduzca un primer numero: ");
    	int dato1 = entrada.nextInt();
    	System.out.print("Introduzca un segundo numero: ");
    	int dato2 = entrada.nextInt();
    	if (dato1 % dato2 ==0) {
    		System.out.print(dato1 + " Es divisible entre "+ dato2);
    	} else {
    		System.out.println(dato1 + " No es divisible entre "+ dato2);
    	}
    	*/
    	
    /*public void compara() {
    		System.out.print("Introduzca el valor 1: ");
        	int valor1 = entrada.nextInt();
        	System.out.print("Introduzca el valor 2: ");
        	int valor2 = entrada.nextInt();
    		
        	if (valor1 > valor2) {
        		System.out.println(valor1+" Es mas grande que "+ valor2);
        	}else {
        		System.out.println(valor2+" Es mas grande que "+ valor1);
        	}
    	}
    	*/
   public void anidado() {
	// TODO Auto-generated method stub
	   
   		System.out.print("Introduzca el valor 1: ");
       	int valor1 = entrada.nextInt();
   		
       	if (valor1>0) {
       		System.out.println(valor1+" Es un numero positivo");
       	}else if (valor1 <0){
       		System.out.println(valor1+" Es un numero negativo");
       	} else {
       		System.out.println("El 0 es neutro");
       	}
}


}
   
    
    
