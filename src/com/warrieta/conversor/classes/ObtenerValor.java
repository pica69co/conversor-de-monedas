package com.warrieta.conversor.classes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ObtenerValor {
    public static double valor(String mensaje, Scanner entrada) {
        double valor;

        do {
            try {
                System.out.println("Digite el valor " + mensaje);
                valor = entrada.nextDouble();
                if (valor == 0) {
                    System.out.println("Terminar?");
                    System.exit(0); // Cierra el programa inmediatamente
                }
                break; // Salida del loop si um valor válido es insertado
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, ingrese un valor válido. ");
                entrada.next(); // Limpia buffer del scanner
            }
        } while (true);

        return valor;
    }
}
