package funciones;

import java.util.Scanner;

public class Ej4 {
/*Diseñar una función que recibe como parámetros dos números enteros y devuelve el máximo de ambos.
 *  Diseña también una función main() que lea los dos números de teclado (los pida al usuario) y llame a la función.
 *  Desde el método main() se debe recoger el valor devuelto por la función en una variable y mostrar el valor de dicha variable por pantalla.*/
	
	static int maxNum(int num1, int num2) {
	
		int max=0;//Iniciamos max a 0 para que no de error
	
		if (num1 > num2) { //Iniciamos un if donde si num1 es mayor a num2 pues max será equivalente a num1
			max = num1;
		}
		
		else {
			max = num2; //en caso contrario max será equivalente a num2
		}
	
		return max;//Solicitamos a la funcion que devuelva max
	}
	public static void main(String[] args) {
		
		//Una vez en el main declaramos los 2 parametros y una variable donde guardaremos el resultado de la funcion
		//Declaramos las variables que vamos a necesitar
		
	int num1, num2, numeroMax;
	
	//Iniciamos el Scanner
	Scanner lee = new Scanner(System.in);
	
	System.out.println("Por favor introduzca el primer numero: ");
	num1 = lee.nextInt();
	
	System.out.println("Por favor introduzca el segundo numero: ");
	num2 = lee.nextInt();
	
	//En numeroMax guardaremos lo que devolverá la funcion, que será el mayor de los 2 parametros que le hemos dado
	numeroMax = maxNum(num1, num2);
	
	//Imprimimos la variable
	System.out.println("El numero maximo de los 2 introducidos es: " + numeroMax);
	
	//cerramos el scanner
	lee.close();
	}

}
