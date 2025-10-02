package org.example;

import java.io.IOException;

public class Funcion {

    public static void abrirAplicacion(String rutaApp) throws InterruptedException, IOException {
        System.out.println("Abrir Calculadora...");
        Process process =Runtime.getRuntime().exec(rutaApp);
        int codigoSalida = process.waitFor(); // espera a que termine
        System.out.println("El proceso terminó con código: " + codigoSalida);
    }
}

