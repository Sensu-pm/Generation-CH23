package funciones;

public class Funciones { //Clase llamada Funciones

	//las funciones se pueden declarar en cualquier lugar de la clase
	public static int sumar(int num1, int num2) {
		int resultado = num1 + num2;
		return resultado;
	}//Cierre de sumar
	
	public static int restar(int num1, int num2) {
		int resultadoR = num1 - num2;
		return resultadoR;
	}//Cierre de restar
	
	public static int dividir(int num1, int num2) {
		int resultadoD = num1 / num2;
		return resultadoD;
	}//Cierre de dividir
	
	public static int multiplicar(int num1, int num2) {
		int resultadoM = num1 * num2;
		return resultadoM;
	}//Cierre de multiplicar
	
	//FUncion para imprimir asteriscos
	public static  void imprimirAsteriscos() {
		System.out.println("**************************");

	}//Cierre de imprimir asteriscos
	
	//Funcion para combinar distintos tipos de valores
	public static float sumaDecimal(float valor1, int valor2) {
		float resultadoDecimal = valor1 + valor2;
		return resultadoDecimal;

	}
	
	//Funcion que usa strings como argumenos
public static String awitaDeLimon(String ingrediente1, String ingrediente2, String ingrediente3) {
		String recetaCompletada = ingrediente1 + ingrediente2 + ingrediente3 ;
		return recetaCompletada;

	}
	
	//Este metodo tiene como funcion, ejecutar cosas	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Las invocaciones de la funcion se hacen generalmente dentro del metodo principal o main
		System.out.println("El resultado de la suma es : "+ sumar(5, 8));
		System.out.println("El resultado de la resta es : "+ restar(5, 8));
		System.out.println("El resultado de la division es : "+ dividir(5, 8));
		System.out.println("El resultado de la multiplicacion es : "+ multiplicar(5, 8));
		
		imprimirAsteriscos();
		
		System.out.println("El resultado de la suma decimal es: "+ sumaDecimal(5.7f, 5));
		
		
		System.out.println("Estos son los pasos para preparar awita de limon: "+ recetaCompletada("agua", "limon", "azucar"));
		
		//FUnciones de la biblioteca de matematicas (Math)
		double valorEjemplo = 7.65497834d;
		System.out.println("La raiz cuadrada de mi valor es : " + Math.sqrt(valorEjemplo));
		
		System.out.println("El seno de mi valor es : "+ Math.sin(valorEjemplo));
		
		System.out.println("La potencia de mi valor es : "+ Math.pow(valorEjemplo, 2));
		
		
		
	}//Cierre de todo main

	public  static String recetaCompletada(String string, String string2, String string3) {
		// TODO Auto-generated method stub
		return null;
	}
		

}
/*

Funciones 

    - No retornan valores: No devuelven nada, no se especifica nada, y no usamos la palabra return.
    
    - Si retornan valores: Se especifica el tipo de dato del argumento, el tipo de valor que regresa y se usa return para esto.


    - Sintaxis de las funciones que si retornan valores
    tipoDeRetorno nombreDeLaFuncion(tipoDeDato argumento1, tipoDeDato argumento2, ...) {
  // Cuerpo de la función
}

    - Sintaxis de las funciones que no retornan valores
    palabraReservada nombreDeLaFuncion(){
    //cuerpo de la funcion
     }
     */