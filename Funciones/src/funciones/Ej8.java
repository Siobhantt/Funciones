package funciones;

import java.util.Scanner;

public class Ej8 {
/*Diseñar la función calculadora(), a la que se le pasan dos números reales (operandos) y qué operación se desea realizar con ellos.
 *  Las operaciones disponibles son sumar, restar, multiplicar o dividir.
 *   Estas se especifican mediante un número: 1 para la suma, 2 para la resta, 3 para la multiplicación y 4 para la división.
 *    La función devolverá el resultado de la operación mediante un número real.
 *  Diseña un método main() que pruebe el funcionamiento de dicha función.*/
	
	static double calculadora (int opcion, double n, double n1) {
	
		double resultado=0;
		
		switch (opcion) {
		case 1 ->{
			resultado = n + n1;
		}
		
		case 2 -> {
			resultado = n - n1;
		}
		
		case 3 -> {
			resultado = n * n1; 
		}
		case 4 -> {
			resultado = n / n1;
		}
		default -> {
			System.err.println("ERROR, OPCION NO DISPONIBLE");
			resultado = 0;
		}
		}
		
		return resultado;
	}
	
	public static void main(String[] args) {
		//devlaramos las variables
		
		double numero1, numero2;
		int opcion;
		
		double resultado;
		
		//Iniciamos el Scanner
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Por favor introduzca el primer numero: ");
		numero1 = lee.nextDouble();
		
		System.out.println("Por favor introduzca el segundo numero: ");
		numero2 = lee.nextDouble();
		
		System.out.println("Las opciones de la calculadora disponibles son : ");
		System.out.println("1 para suma\n2 para resta\n3 para multiplicar\n4 para dividir.");
		
		System.out.println("Introduzca la opcion: ");
		opcion = lee.nextInt();
		
		resultado = calculadora(opcion, numero1, numero2);
		
		if (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4) {
			System.out.println(resultado);
		}
		
		
		//cerramos el scanner
		lee.close();

	}

}
