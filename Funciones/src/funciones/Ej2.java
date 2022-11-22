package funciones;

import java.util.Scanner;

public class Ej2 {
/*Escribe una función a la que se le pasen dos enteros y muestre todos los números comprendidos entre ellos.
 *  Desde el método main() lee los dos números enteros, los cuales deben introducirlos el usuario, y pásalos como parámetros de entrada de la función.*/
	
	static void entreNumeros (int valor1, int valor2) {
		for (int i = valor1+1  ; i < valor2 ; i++) {
			
			System.out.println(i);
		}
		
	}
	public static void main(String[] args) {
		//Declaramos las variables de los valores 1 y 2 que debe introducir el usuario
		
		int num1, num2;
		
		//Iniciamos el Scanner
		Scanner lee = new Scanner(System.in);
		
		//Imprimimos la solicitud
		System.out.println("Por favor introduzca el primer valor: ");
		num1 = lee.nextInt();
				
		System.out.println("Por favor introduzca el segundo valor: ");
		num2 = lee.nextInt();
		
		//llamamos a la funcion
		
		entreNumeros(num1, num2);
	
	//Cerramos el Scanner
		lee.close();
	}

}
