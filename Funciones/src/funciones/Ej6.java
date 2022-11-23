package funciones;

import java.util.Scanner;

public class Ej6 {
/*Diseña una función con el siguiente prototipo:
boolean esPrimo(int n)
La función debe devolver true si n es primo y false en caso contrario. Diseña un método main() que pruebe el funcionamiento de dicha función.
*/
	/*En este caso iniciamos una funcion que determine si un numero es primo o no*/
	static boolean esPrimo(int n) {
		boolean primo = true; //declaramos este boolean llamado primo que equivale a true
		
		//Iniciamos un for que empiece a contar a partir de 2 puesto que antes no hay numeros primos
		//Ira de i(2) a n -1 y la i se irá incrementando en 1
		for (int i = 2; i<n; i++) {
			
			//En cada vuelta del for va a dividir el numero introducido entre i, si en algun caso resulta ser 0 pues el numero no es primo
			if (n % i == 0) {
				//entonces nuestro boolean pasa a ser false
				primo = false;
			}
		}
	return primo;//solicitamos que devuelva primo
	}
	public static void main(String[] args) {
		
		//Declaramos las variables, en esta guardaremos lo que va a introducir el usuario
		int numUser;
		
		//Iniciamos el Scanner
		Scanner lee = new Scanner(System.in);
		
		//Imprimimos las solicitud
		System.out.println("Por favor introduzca un numero:");
		numUser = lee.nextInt();
	
		//Imprimimos la respuesta con la funcion dentro que nos dira si es primo o no
		System.out.println("El numero introducido por el usuario es primo?" + esPrimo(numUser));
		
		//cerramos el Scanner
		lee.close();
	}

}
