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

		//Ejercicio 4
		String palabra1, palabra2;
		boolean vOf;

		System.out.println("");
		System.out.println("Para el ejercicio 4 ingrese dos palabras y validaremos si el caracter de la posicion 2 es el mismo: ");
		escaner.nextLine();
		System.out.println("Palabra 1: ");
		palabra1 = validarPalabra(escaner);
		System.out.println("Palabra 2: ");
		palabra2 = validarPalabra(escaner);
		vOf = validarCaracter2(palabra1, palabra2);
		System.out.println("Se ingresan "+palabra1+" y "+palabra2+", el resutado es "+vOf+".");
		//

		// Ejercicio #5
		System.out.println("Ahora, para el #5 se requiere de 3 numeros.");
		System.out.println("Con los cuales ecuación cuadrática de la forma: ax^2 + bx + c");
		
		


        // Metodo pow de Math
        /*double a = 2;
        double b = 3;
        System.out.println(Math.pow(a, b));*/
        

        // Declaracion de info a pedir del usuario 
        
        // Pedir info al usuario 

        // Declaracion de salidas calculadas 
       
        // Calculo de salidas mediante metodos 
        

        // Mostramos las salidas al usuario
        
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
	 * Descripción: El método parametrosIguales permite evaluar si los numeros ingresados son el mismo
	 * @param 
	 * @return 
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

	 public String mensajeResultado(int n0_1, String nombre) {
		String mensaje;
		
		if (n0_1 == 1) {
			mensaje = ("Se ingresan "+nombre+" y "+n0_1+", el resultado es: Hola "+nombre+".");
			
		} else{
			mensaje = ("Se ingresan "+nombre+" y "+n0_1+", el resultado es: Hola "+nombre+".");
			
		}
		return mensaje;
	 }

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
	
	 public boolean  validarCaracter2(String palabra1, String palabra2){
		boolean vOf;
		 
		if (palabra1.charAt(2) == palabra1.charAt(2)){
			vOf = true;
	 	} else{
			vOf = false;
		}
		return vOf;
	 }
	
}