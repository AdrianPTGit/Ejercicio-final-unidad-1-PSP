package org.example;  // Paquete donde se encuentra la clase Main

import java.io.IOException;
import java.util.Scanner; // Importamos Scanner para leer datos por teclado

// Clase principal del programa
public class Main {
    // Método main: punto de entrada de la aplicación
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner teclado = new Scanner(System.in); // Objeto para leer entradas del usuario por consola

        int opcion = 0; // Variable donde se guardará la opción elegida por el usuario

        // Bucle que se repetirá hasta que el usuario pulse la opción 4 (Salir)
        do {
            // Menú de opciones que se muestra en pantalla
            System.out.println("**********¿QUE APLICACIÓN QUIERES EJECUTAR?*************");
            System.out.println("1. Calculadora");
            System.out.println("2. Notepad");
            System.out.println("3. Firefox");
            System.out.println("4. Salir");
            System.out.println("Escribe un numero.");

            opcion = teclado.nextInt(); // Leemos la opción del usuario

            // Dependiendo de la opción elegida, ejecutamos una acción
            switch (opcion){
                case 1:
                    // Opción 1: abrir la calculadora de Windows
                    System.out.println("Abrir Calculadora...");
                    String rutaCalculadora = "C:\\Windows\\System32\\calc.exe\n"; // Ruta del ejecutable
                    Funcion.abrirAplicacion(rutaCalculadora); // Llamada al método que abre la aplicación
                    break;
                case 2:
                    // Opción 2: abrir el Bloc de notas (Notepad)
                    System.out.println("Abrir Notepad:");
                    String rutaNoteapad = "Notepad.exe"; // Ruta del ejecutable
                    Funcion.abrirAplicacion(rutaNoteapad);
                    break;
                case 3:
                    // Opción 3: abrir el navegador Firefox
                    System.out.println("Abrir Firefox");
                    String rutaFirefox = "C:\\Program Files\\Mozilla Firefox\\firefox.exe\n"; // Ruta del ejecutable
                    Funcion.abrirAplicacion(rutaFirefox);
                    break;
                case 4:
                    // Opción 4: salir del programa
                    System.out.println("Cerrar programa...");
                    break; // Sale del switch (y como la condición del bucle será falsa, termina el programa)
                default:
                    // Si el usuario introduce un número distinto de 1, 2, 3 o 4
                    System.out.println("Opcion no valida. Escribe otro numero");
            }

        } while (opcion != 4); // El bucle continuará hasta que el usuario escriba 4 (Salir)
    }
}
