package funciones;

import java.util.Scanner;

public class Ej5 {
/*Crear una función que devuelva un tipo booleano que indique si el carácter que se pasa como parámetro de entrada corresponde con una vocal.
 *  Diseña un método main() que pruebe el funcionamiento de dicha función.*/
	
	static boolean esVocal (String letra) {
		//Iniciamos una funcion donde la comparacion la iniciaremos a false para que todo lo que no este en el if sea falso
		boolean comparacion = false;
		/*Iniciamos un if donde si cumple que el string es alguna de las vocales la variable comparacion cambie a true*/
		if (letra.equals("a")||letra.equals("e")||letra.equals("i")||letra.equals("o")||letra.equals("u")) {
			
			comparacion = true;
		}
		//Solicitamos que la funcion devuelva comparacion
			return comparacion;
	}
	public static void main(String[] args) {
		//Declaramos la variables donde la variable es nos dará el resultado de la comparacion
		boolean es;
		String letraUser;//y en letra user guasrdaremos lo que introducirá el usuario
		
		//iniciamos el Scanner
		Scanner lee = new Scanner(System.in);
		 
		//imprimimos la solicitud y leemos lo que introducirá el usuario
		System.out.println("Por favor introduzca una letra: ");
		letraUser = lee.nextLine();
		
		//En la variable del resultado en este caso "es" llamamos la funcion y le metemos como parametro lo que introducirá el usuario
		es = esVocal(letraUser);
		
		System.out.println("La letra introducida es vocal? : " + es);
	
	//cerramos el scanner
		lee.close();
	
	}

}
