package pruebasJunit.jada.app;

public class Calculadora {
	public int sumar(int n1, int n2) {
		return (n1 + n2);

	}
	
	public int Restar(int n1, int n2) {
		return (n1 -  n2);
	}
		
	

	
	public double division(double d1, double d2) {
		return (d1/d2);
	}
	public double divisionByZero(double v1, double v2) {
		return (v1/v2);
		throw new ArithmeticException("**No se puede dividir por zero");
		
	}
	
	
	}
	
	

