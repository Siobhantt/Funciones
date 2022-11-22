package funciones;

import java.util.Scanner;

public class Ej3 {
/*Realiza una función que calcule y muestre el área y el volumen de un cilindro, según se especifique.
 *  Para distinguir un caso de otro se le pasará como opción un número: 
 *  1 (para el área) o 2 (para el volumen).
 *   Además, hay que pasarle a la función el radio de la base y la altura del cilindro.
 *    Desde el método main(), habrá que solicitarle al usuario la opción (1 ó 2), el radio de la base y la altura del cilindro. 
 *    A continuación, llamará a la función con estos parámetros. Las funciones para calcular el áre y el volumen de un cilindro son:
*/
	
	/*Creamos una funcion donde solicitaremos la opcion, la altura y el radio*/
	static void areaVolumen (char opcion, double altura, double radio) {
		//Creamos el area y el volumen porque es lo que queremos obtener
		double area =0, volumen=0;
		
		//Iniciamos un if donde si la opcion es 1 pues utilizamos la formula para obtener el area e imprimimos el resultado
		if (opcion == 1) {
			area = 2 * Math.PI * radio * (altura + radio);
		System.out.println("El area del cilindro es: " + area);
		
		}
		/*Y en caso de que la opcion sea 2 utilizamos la formula para encontra el volumen*/
		else if (opcion ==2) {
			volumen = Math.PI * radio*radio*altura;
		System.out.println("El volumen del cilindro es: " + volumen);
		}
		
	}
	public static void main(String[] args) {
	//Declaramos la variable opcion donde guardaremos pues la opcion
		
		/*Una vez en el main creamos la variables donde guardaremos la opcion del usuario y el radio y la alturaque nos va a introducir*/
		char opcionUser;
		double radio, altura;
		
	//Iniciamos el Scanner
		Scanner lee = new Scanner(System.in);
		
		//Imprimimos las solicitudes, donde guardaremos la opcion, la altura y el radio
		
		System.out.println("Por favor introduzca la opcion de lo que necesita obtener.");
		System.out.println("1 para area, 2 para volumen.");
		
		//Aqui casteamos el Sscanner para que se adapte a la variable de tipo char
		opcionUser = (char) lee.nextInt();
		
		System.out.println("Por favor introduzca la altura: ");
		altura = lee.nextDouble();
		
		
		System.out.println("Por favor introduzca el radio: ");
		radio = lee.nextDouble();
		
		
		//llamamos la funcion
		
		areaVolumen(opcionUser, altura, radio);
		
		//cerramos el Scanner
		lee.close();
	}

}
