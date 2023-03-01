package tiposDeDatosYVariables;

public class EjerciciosFer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ejercicio 1
	int variable1 = 4;
	int variable2 = 10;
	int variable3 = 3;
	
	int multi = variable1 * variable3;
	int residuo= variable2 % variable3;
	System.out.println("La multiplicacion es: "+ multi);
	System.out.println("El residuo  es: "+ residuo);
	
	/*//Ejercicio 2
	boolean respuesta1 = true;
	boolean respuesta2 = false;
	
	boolean respuesta3 = respuesta2 == respuesta1;
	System.out.println(respuesta3);
	
	
	//Ejercicio 3
	
	 double peso = 82.5;
	 double precioDelOro = 120000;
	 long miPesoEnOro = (long) (peso * precioDelOro);
	 if( miPesoEnOro < precioDelOro)
		 System.out.println("Vale mas, un buen amor");*/
		 
	
	public class NumeroParImpar
	{
	    public static void main( String[] args )
	    {
	        int numero;
	        Scanner teclado = new Scanner( System.in );

	        System.out.printf( "Introduzca un número entero: " );
	        numero = teclado.nextInt();

	        if ( numero % 2 == 0 )
	        {
	            System.out.printf( "ES PAR" );
	        }
	        else
	        {
	            System.out.printf( "ES IMPAR" );
	        }
	    }
	}
	}
    

	

	   
	
	


