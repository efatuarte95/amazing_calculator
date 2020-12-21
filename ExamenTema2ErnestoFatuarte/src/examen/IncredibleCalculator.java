package examen;

import java.util.Scanner;

public class IncredibleCalculator {

    public static void main(String[] args) {

    	int num1, num2;
        System.out.println("Selecciona la operación que prefieras realizar: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir (división entera)");
        System.out.println("5. Dividir (división con decimales)");

        int opcion = leerEnteroEntrada();


        switch (opcion) {
            case 1: //Sumar. Debes leer dos numeros enteros de entrada e imprimir su suma
            		System.out.println("Introduzca el primer número:");
	        		num1 = leerEnteroEntrada();
            		System.out.println("Introduzca el segundo número:");
	        		num2 = leerEnteroEntrada();
            		System.out.println("El resultado de sumar " + num1 + " " + num2 + " es " + suma(num1, num2));
                    break;
            case 2: // Restar. Debes leer dos números enteros de entrada e imprimir su resta
	            	System.out.println("Introduzca el primer número:");
	        		num1 = leerEnteroEntrada();
	        		System.out.println("Introduzca el segundo número:");
	        		num2 = leerEnteroEntrada();
	        		System.out.println("El resultado de restar " + num1 + " y " + num2 + " es " + resta(num1, num2));
                    break;
            case 3: // Multiplicar. Debes leer dos números enteros de entrada e imprimir su producto.
	            	System.out.println("Introduzca el primer número:");
	        		num1 = leerEnteroEntrada();
	        		System.out.println("Introduzca el segundo número:");
	        		num2 = leerEnteroEntrada();
	        		System.out.println("El resultado de multiplicar " + num1 + " y " + num2 + " es " + multiplicacion(num1, num2));
                    break;
            case 4: // Multiplicar. Debes leer dos números enteros de entrada e imprimir su división entera.
	            	System.out.println("Introduzca el primer número:");
	        		num1 = leerEnteroEntrada();
	        		System.out.println("Introduzca el segundo número:");
	        		num2 = leerEnteroEntrada();
	        		System.out.printf("El resultado de dividir " + num1 + " y " + num2 + " es %.0f", divisionEntera(num1, num2));
	                break;
            case 5: // Multiplicar. Debes leer dos números enteros de entrada e imprimir su división con decimales.
	            	System.out.println("Introduzca el primer número:");
	        		num1 = leerEnteroEntrada();
	        		System.out.println("Introduzca el segundo número:");
	        		num2 = leerEnteroEntrada();
	        		System.out.printf("El resultado de dividir " + num1 + " y " + num2 + " es %.2f", divisionConDecimales(num1, num2));
	                break;
        }

    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    public static int divisionEntera(int a, int b) {
        return a / b;
    }

    public static double divisionConDecimales(int a, int b) {
        return a / (b * 1.0);
    }

    public static int leerEnteroEntrada() {
        try {
            Scanner sc = new Scanner(System.in);
            int result = Integer.parseInt(sc.next());
            sc.close();
            return result;
        } catch (NumberFormatException ex) {
            System.err.println("Lo que has introducido no es un número entero!");
            System.exit(1);
            return -1;
        }

    }

}