package com.warrieta.conversor.classes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CodigoPais {
    public static String codigo(String mensaje , Scanner entrada) {
        String code;
        int opcion = -1;
        do {
            try {
                System.out.println(mensaje);
                opcion = entrada.nextInt();

                if (opcion == 0) {
                    System.out.println("Programa finalizado");
                    System.exit(0); // Cierra el programa inmediatamente
                } else if (opcion >= 1 && opcion <= 14) {
                    code = Menu.menuMoneda(opcion);
                    System.out.println("Seleccion: "+ Localizacion.localizando(code, 0).nombreMoneda());
                    return code;
                } else {
                    System.out.println("Opcion inválida! Por favor, seleccione una opcion de 1 a 14 o 0 para salir.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, intente de nuevo. ");
                entrada.next(); // Limpiar el buffer del scanner
            }
        } while (!(opcion >= 1 && opcion <= 14));
        return null; // algo salio mal, retornamos -null-
    }
}