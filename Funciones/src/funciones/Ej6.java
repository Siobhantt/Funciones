package funciones;

import java.util.Scanner;

public class Ej6 {
/*Diseña una función con el siguiente prototipo:
boolean esPrimo(int n)
La función debe devolver true si n es primo y false en caso contrario. Diseña un método main() que pruebe el funcionamiento de dicha función.
*/
	static boolean esPrimo(int n) {
		boolean primo = true;
		
		for (int i = 2; i<n; i++) {
			
			if (i % n == 0) {
				primo = false;
			}
		}
	return primo;
	}
	public static void main(String[] args) {
		
		//Declaramos las variables
		int numUser;
		
		
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Dame un numero:");
		numUser = lee.nextInt();
	
		
		System.out.println(esPrimo(numUser));
		
		
		lee.close();
	}

}
