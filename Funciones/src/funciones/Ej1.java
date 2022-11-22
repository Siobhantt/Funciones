package funciones;

import java.util.Scanner;

public class Ej1 {
/*Diseña la función eco() a la que se le pasa como parámetro de entrada un número n, y muestra por pantalla n veces el mensaje “Eco…”.
 *  Desde el método main() lee un número introducido por el usuario por teclado y pasa este número como parámetro en la llamada a la función.*/
	
	/*Definimos la funcion llamada eco, y le asignamos el tipo entero y de nombre le pondremos num*/
				static void eco(int num) {
					for (int i =1; i <= num; i++) { /*Iniciamos un for que vaya desde uno hasta menor o igual ue el numero que se va a introducir y vamos incrementando en cada vuelta*/
			
					System.out.println("Eco...");//La instruccion será que imprima eco
					}
				}
	
				public static void main(String[] args) {
		
					//Decclaramos una variable, en este caso ec
		int eco = 0;
		
		//Inicamos el Scanner
		Scanner lee = new Scanner(System.in);
		 
		//Imprimimos el mensaje para que usuario introduzca el numero y lo guardamos en la variable eco
		System.out.println("Por favor introduzca un numero: ");
		eco = lee.nextInt();
		 
		//llamamos a la funcion y esta se ejecutará las veces que tenga guardada la variable eco que fue donde el usuario introdujo el numero
		eco(eco);
		
		
		//cerramos el Scanner
		lee.close();
	}
	
}
