/*import java.util.Scanner;

public class NumeroParImpar
{
    public static void main( String[] args )
    {
        int numero;
        Scanner teclado = new Scanner( System.in );

        System.out.print( "Introduzca un número entero: " );
        numero = teclado.nextInt();

        if ( numero % 2 == 0 )
        {
            System.out.print( "ES PAR" );
        }
        else
        {
            System.out.print( "ES IMPAR" );
        }
    }
}
*/


import java.util.Scanner;

public class NumeroParImpar
{
    public static void main( String[] args )
    {
    	
        byte centigrados = 1;
        double fahrenheit = (centigrados * 1.8) + 32;
        double kelvin = centigrados + 273.15;

        System.out.println("1 centigrado a fahrenheit es" + fahrenheit);

        System.out.println("1 centigrado a kelvin es" + kelvin);

        /*
         * ºF = ºC x 1.8 + 32 formula para convertir grados centigrados a fahrenheit K =
         * ºC + 273.15
         */
        int numero;
        Scanner teclado = new Scanner( System.in );

        System.out.print( "Introduzca la temperaura en Fahrenheit: " );
        numero = teclado.nextInt();

        double centigrados1 = (numero / 1.8) -32;
            System.out.print( "en Centigrados es :"+ centigrados1 );
        double kelvin1 = (numero - 32)/1.8  + 273.15;
            System.out.print( "en Kelvin es :"+ kelvin1 );
        }
    }
