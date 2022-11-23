package funciones;

import java.util.Scanner;

public class Ej5 {
/*Crear una función que devuelva un tipo booleano que indique si el carácter que se pasa como parámetro de entrada corresponde con una vocal.
 *  Diseña un método main() que pruebe el funcionamiento de dicha función.*/
	
	static boolean esVocal (String letra) {
		boolean resultado = false;
		
		if (letra.equals("a")||letra.equals("e")||letra.equals("i")||letra.equals("o")||letra.equals("u")) {
			
			resultado = true;
		}
			return resultado;
	}
	public static void main(String[] args) {
		//Declaramos la variables
		boolean es;
		String letraUser;
		
		//iniciamos el Scanner
		Scanner lee = new Scanner(System.in);
		 
		System.out.println("Por favor introduzca una letra: ");
		letraUser = lee.nextLine();
		
		es = esVocal(letraUser);
		
		System.out.println("La letra introducida es vocal? : " + es);
	}

}
