package funciones;

import java.util.Scanner;

public class Ej7 {
/*Escribe una función a la que se le pase como parámetro un número entero y devuelva el número de divisores primos que tiene. 
 * Utiliza para ello la función que definiste en el ejercicio anterior, esPrimo().
 *  Diseña un método main() que pruebe el funcionamiento de dicha función.*/
	
	static int divisoresPrimos (int n) {
		
		int cuentaDivisor=0; //Establecemos es divisior a 0 que será nuestro contador
		
		for (int i = 2 ; i <= n ; i++) { /*Iniciamos un for que empiece en 2 hasta igual o menor a n y se incrementará en 1*/
			
			if (n%i ==0 && Ej6.esPrimo(i)) {//si n modulo i es igual a 0(O sea, si "i" es divisor) e "i" es primo entonces al cuenta  
			//se le incrementa 1
				cuentaDivisor++; 
			}
		
			}
		return cuentaDivisor; //solicitamos que devuelva la cuenta total
	}
	
	public static void main(String[] args) {
		//Declaramos la variable donde se guardará lo que introducirá el usuario
		int numUser;
		
		//iniciamos el scanner
		Scanner lee = new Scanner(System.in);
		
		//imprimimos la solicitud
		System.out.println("Por favor introduzca un numero: ");
		//leemos el numero
		numUser = lee.nextInt();
		
		//Imprimimos la funcion con el parametro equivalente al numero introducido por el usuario
		System.out.println(divisoresPrimos(numUser));
		
		//Cerramos el Scanner
		lee.close();

	}

}
