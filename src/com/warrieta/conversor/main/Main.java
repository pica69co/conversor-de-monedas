package com.warrieta.conversor.main;

import com.warrieta.conversor.classes.Menu;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static com.warrieta.conversor.classes.Conversor.realizarConversion;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcion;
        Menu menu = new Menu();
        System.out.println("***** Bienvenido a Conversor de monedas *****");
        System.out.println("Seleccione 1 para iniciar | 0 para salir:");

        do {
            try {
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        realizarConversion(entrada,menu);
                        System.out.println("Nueva conversion?");
                        System.out.println("1 - continuar  0 - salir" );
                        break;
                    case 0:
                        System.out.println("Programa finalizado");
                        break;
                    default:
                        System.out.println("Opcion inválida! Por favor, seleccione una opcion válida.");
                        System.out.println("Seleccione 1 para reiniciar o 0 para salir.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, intente de nuevo ");
                entrada.next(); // Limpia el buffer del scanner
                opcion = -1; // Define opcion como -1 para continuar el loop
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        } while (opcion != 0); // Repetir hasta que el usuario seleccione salir (0)
        System.out.println("Gracias por usar este programa");

        entrada.close();

    }
}
