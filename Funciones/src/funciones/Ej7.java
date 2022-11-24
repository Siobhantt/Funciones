package funciones;

import java.util.Scanner;

public class Ej7 {
/*Escribe una función a la que se le pase como parámetro un número entero y devuelva el número de divisores primos que tiene. 
 * Utiliza para ello la función que definiste en el ejercicio anterior, esPrimo().
 *  Diseña un método main() que pruebe el funcionamiento de dicha función.*/
	
	static int divisoresPrimos (int n) {
		int esDivisor=0;
		
		for (int i = 1 ; i < n ; i++) {
			if (n%i ==0) {
			
				esDivisor = n; 
			}
		
			}
		return esDivisor;
	}
	
	public static void main(String[] args) {
		int numUser;
		
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Por favor introduzca un numero: ");
		
		numUser = lee.nextInt();
		
		System.out.println(divisoresPrimos(numUser));
		
		
		

	}

}
