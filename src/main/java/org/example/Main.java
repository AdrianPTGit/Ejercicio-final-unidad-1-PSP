package org.example;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);

        int opcion=0;
        do {
            System.out.println("**********¿QUE AOLCACIÓN QUIERES EJECUTAR?*************");
            System.out.println("1. Calculadora");
            System.out.println("2. Notepad");
            System.out.println("3. Firefox");
            System.out.println("Escribe un numero.");
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Abrir Calculadora...");
                    String rutaCalculadora ="C:\\Windows\\System32\\calc.exe\n";
                    Runtime.getRuntime().exec(rutaCalculadora);
                    break;
                case 2:
                    System.out.println("Abrir Notepad:");
                    String rutaNoteapad="Notepad.exe";
                    Runtime.getRuntime().exec(rutaNoteapad);
                    break;
                case 3:
                    System.out.println("Abrir Firefox");
                    String rutaFirefox="C:\\Program Files\\Mozilla Firefox\\firefox.exe\n";
                    Runtime.getRuntime().exec(rutaFirefox);
                    break;
                default:
                    System.out.println("Opcion no valida. Escribe otro numero");
            }


        }while (opcion != 3);



    }
}