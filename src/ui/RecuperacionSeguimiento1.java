package ui;

import java.util.Scanner;

public class RecuperacionSeguimiento1 {

	private Scanner escaner;

    // Declaracion de constantes 

	private RecuperacionSeguimiento1() {
		escaner = new Scanner(System.in);
	}
	
	
	public void run() // Aqui en el metodo run hacemos lo de nuestro metodo main. Solo entrada de datos, mensajes al usuario y mostrar salidas
	{   

		// Ejercicio 1
		int n1, n2, n3, paramIguales;
		
		System.out.println("Para el ejercicio #1 ingrese tres valores enteros: ");
		System.out.println("#1: ");
		n1 = escaner.nextInt();
		System.out.println("#2: ");
		n2 = escaner.nextInt();
		System.out.println("#3: ");
		n3 = escaner.nextInt();
		paramIguales = parametrosIguales (n1, n2, n3);
		System.out.println("Se ingresan "+n1+", "+n2+", "+n3+"; el resultado es "+paramIguales+".");
		//

		// Ejercicio 2
		String nombre, mensaje;
		int n0_1;

		System.out.println("");
		System.out.println("Para el ejercicio #2 ingrese su nombre por favor: ");
		escaner.nextLine();
		nombre = escaner.nextLine();
		System.out.println("Ahora ingrese un numero, si es 1 = saludo, 0 = adios: ");
		n0_1 = validacionE2(nombre);
		mensaje = mensajeResultado(n0_1, nombre);
		System.out.println(mensaje);
		//

		//Ejercicio 3
		String param1, param2, param3;
		int longCadena;

		System.out.println("");
		System.out.println("Para el ejercicio 3 se requiere que ingrese 3 palabras con el fin de determinar cuantas de estas tienen 4 o mas caracteres.");
		System.out.println("Ingrese la primera palabra: ");
		escaner.nextLine();
		param1 = escaner.nextLine();
		System.out.println("Ingrese la segunda palabra: ");
		param2 = escaner.nextLine();
		System.out.println("Ingrese la tercera palabra: ");
		param3 = escaner.nextLine();
		longCadena = longParametros(param1, param2, param3);
		System.out.println("Se ingresan "+param1+", "+param2+" y "+param3+", el resultado es "+longCadena+".");
		//

		//Ejercicio 4
		String palabra1, palabra2;
		boolean vOf;

		System.out.println("");
		System.out.println("Para el ejercicio 4 ingrese dos palabras y validaremos si el caracter de la posicion 2 es el mismo.");
		System.out.println("Palabra 1: ");
		palabra1 = validarPalabra(escaner);
		System.out.println("Palabra 2: ");
		palabra2 = validarPalabra(escaner);
		vOf = validarCaracter2(palabra1, palabra2);
		System.out.println("Se ingresan "+palabra1+" y "+palabra2+", el resutado es "+vOf+".");
		//

		// Ejercicio #5
		double a, b, c;
		String resultado;

		System.out.println("");
		System.out.println("Ahora, para el #5 se requiere de 3 numeros.");
		System.out.println("Con los cuales ecuación cuadrática de la forma: ax^2 + bx + c.");
		System.out.println("Ingrese el termino a de la ecuación: ");
		a = escaner.nextDouble();
		System.out.println("Ingrese el termino b de la ecuación: ");
		b = escaner.nextDouble();
		System.out.println("Ingrese el termino c de la ecuación: ");
		c = escaner.nextDouble();
		resultado = eCuadratica(a, b, c);
		System.out.println(resultado);
		//        
	}

	public static void main(String[] args) {
		RecuperacionSeguimiento1 mainApp = new RecuperacionSeguimiento1();
		mainApp.run();
	}

	public int parametrosIguales (int n1, int n2, int n3) {
		int i;
		
		i = 0;
		if (n1 == n2 && n1 == n3) {
			i+= 3;
		} else if (n1 == n2 || n1 == n3 || n2 == n3) {
			i+= 2;
		}

		return i;
	}

    /**
	 * Descripción: El método parametrosIguales permite evaluar si los numeros ingresados son el mismo o distintos
	 * @param: Los parametros son los tres números ingrrsados por el usuarios
	 * @return: devuelve el valor de i el cual aumenta dependiendo de la cantidad de números similares
	 */

	 public int validacionE2 (String nombre) {
		int n0_1;

			while (true) {
				n0_1 = escaner.nextInt();

				if (n0_1 == 1 || n0_1 == 0) {
					return n0_1;
				} else {
					System.out.println("Se ingresan "+nombre+" y "+n0_1+", el resultado es: Error, entradas inválidas.");
					System.out.println("Ingrese el numero nuevamente: ");
				}
		}
	 }
	 /**
	 * Descripción: El método validacionE2 permite evaluar si los numeros ingresados en el ejercicio 2 son 1 ó 0
	 * @param: El parametro es el nombre del usuario
	 * @return: devuelve el valor de n0_1 en el caso de que esta sea validado como 1 ó 0
	 */

	 public String mensajeResultado(int n0_1, String nombre) {
		String mensaje;
		
		if (n0_1 == 1) {
			mensaje = ("Se ingresan "+nombre+" y "+n0_1+", el resultado es: Hola "+nombre+".");
			
		} else{
			mensaje = ("Se ingresan "+nombre+" y "+n0_1+", el resultado es: Adios "+nombre+".");
			
		}
		return mensaje;
	 }
	 /**
	 * Descripción: El método mensajeResultado permite evaluar dependiendo de si es 0 ó 1 para saludar o despedirse
	 * @param: El parametro es el nombre del usuario y el número ingresado previamente el cual indica si es 0 ó 1
	 * @return: devuelve el valor de n0_1 en el caso de que esta sea validado como 1 ó 0
	 */

	 public int longParametros (String param1, String param2, String param3) {
		int i;

		i = 0;
		if (param1.length() >= 4) {
			i+= 1;
		}
		if (param2.length() >= 4) {
			i+= 1;
		}
		if (param3.length() >= 4) {
			i+= 1;
		}
		return i;
	 }
	 /**
	 * Descripción: El método longParametros permite medir la longitud de las palabras ingresadas y lleva un contador dependiendo de la cantidad de palabras que cumplan el requisito
	 * @param: Los parametros son las 3 palabras ingresadas por el usuario
	 * @return: devuelve el valor de i el cual es un contador de veces que una palabra tiene más de 4 caracteres
	 */

	 public String validarPalabra(Scanner escaner){
		String palabra; 

		while (true) {
			palabra = escaner.nextLine();

			if (palabra.length()>=3 ){
				return palabra;
			} else {
				System.out.println("Palabra no valida, debe ser por lo menos de 3 caracteres.");
				System.out.println("Ingrese la palabra nuevamente: ");
			}
		}
	 }
	 /**
	 * Descripción: El método validarPalabra evalúa si la palabra ingresada tiene más de 3 caracteres lo cual es necesario para llevar a cabo el resto del código
	 * @param: El parámetro es el escanor mismo puesto que devuelve una palabra que recibe dentro del mismo método
	 * @return: Devuelve la palabra que cumple con las características requeridas
	 */
	
	 public boolean  validarCaracter2(String palabra1, String palabra2){
		boolean vOf;
		 
		if (palabra1.charAt(2) == palabra2.charAt(2)){
			vOf = true;
	 	} else{
			vOf = false;
		}
		return vOf;
	 }
	 /**
	 * Descripción: El método validarCaracter2 evalúa si una condición es verdadera o falsa si no se cumple
	 * @param: Los parámetros son las 2 palabras ingresadas por el usuario las cuales evalúa
	 * @return: Devuelve el valor de la afirmación como verdaro o falso
	 */
	
	 public String eCuadratica (double a,double b, double c) {
		double opDentroRaiz, raiz, positivo, negativo;
		String resultadoDoble;

		opDentroRaiz = Math.pow(b,2)-4*a*c;
		raiz = Math.sqrt(opDentroRaiz);
		positivo = resultPositivo(a, b, raiz);
		negativo = resultNegativo(a, b, raiz);

		resultadoDoble = ("Las raices de la ecuacion cuadratica "+a+"x^2+"+b+"x+"+c+" son: X = "+positivo+", X´ = "+negativo+".");
		return resultadoDoble;
	 }
	 /**
	 * Descripción: El método eCuadratica realiza el proceso para calcular las raices de una formula cuadrática
	 * @param: Los parámetros son 3 números pertenecientes a a, b y c según la fórmula
	 * @return: Devuelve el resultado escrito formal de los cálculos
	 */

	public double resultPositivo (double a,double b, double raiz) {
		double positivo;

		positivo = (-b+raiz)/(2*a);
		return positivo;
	}
	/**
	 * Descripción: El método resultPositivo calcula la versión del + de la fórmula cuadrática
	 * @param: Los parámetros son a, b y el resultado de la raís, pues le permite completar lo que falta de la operación
	 * @return: Devuelve el resultado de los cálculos
	 */

	public double resultNegativo (double a,double b, double raiz) {
		double negativo;

		negativo = (-b-raiz)/(2*a);
		return negativo;
	}
	/**
	 * Descripción: El método resultNegativo calcula la versión del - de la fórmula cuadrática
	 * @param: Los parámetros son a, b y el resultado de la raís, pues le permite completar lo que falta de la operación
	 * @return: Devuelve el resultado de los cálculos
	 */
}