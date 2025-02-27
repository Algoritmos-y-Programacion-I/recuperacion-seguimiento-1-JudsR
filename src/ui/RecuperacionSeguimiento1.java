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
		int n1, n2, n3, paramIguales;
		
		System.out.println("Para el ejercicio #1 ingrese tres valores enteros: ");
		System.out.println("#1: ");
		n1 = escaner.nextInt();
		System.out.println("#2: ");
		n2 = escaner.nextInt();
		System.out.println("#3: ");
		n3 = escaner.nextInt();
		paramIguales = parametrosIguales (n1, n2, n3);
		System.out.println("Se ingresan "+n1+", "+n2+", "+n3+"; el resultado es "+paramIguales);

        // Metodo pow de Math
        double a = 2;
        double b = 3;
        System.out.println(Math.pow(a, b));
        

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
	

	
}