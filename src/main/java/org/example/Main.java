package org.example;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
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
                    Process process =Runtime.getRuntime().exec(rutaCalculadora);
                    int codigoSalida = process.waitFor(); // espera a que termine
                    System.out.println("El proceso terminó con código: " + codigoSalida);
                    break;
                case 2:
                    System.out.println("Abrir Notepad:");
                    String rutaNoteapad="Notepad.exe";
                    Process process1=Runtime.getRuntime().exec(rutaNoteapad);
                    int codigoSalida1 = process1.waitFor(); // espera a que termine
                    System.out.println("El proceso terminó con código: " + codigoSalida1);
                    break;
                case 3:
                    System.out.println("Abrir Firefox");
                    String rutaFirefox="C:\\Program Files\\Mozilla Firefox\\firefox.exe\n";
                    Process process2=Runtime.getRuntime().exec(rutaFirefox);
                    int codigoSalida2 = process2.waitFor(); // espera a que termine
                    System.out.println("El proceso terminó con código: " + codigoSalida2);
                    break;
                default:
                    System.out.println("Opcion no valida. Escribe otro numero");
            }


        }while (opcion != 3);



    }
}