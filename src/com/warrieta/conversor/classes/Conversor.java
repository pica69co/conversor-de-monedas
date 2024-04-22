package com.warrieta.conversor.classes;

import java.io.IOException;
import java.util.Scanner;

public class Conversor {
    public static void realizarConversion(Scanner entrada, Menu menu) throws IOException, InterruptedException {
        String baseCode;
        String targetCode;
        String nombreMonedaOrigen ;
        String nombreMonedaDestino ;

        menu.mostraMenu();
        do{
            // Seleccion de moneda origen

            baseCode = CodigoPais.codigo("Seleccione la moneda de origen (0 para salir):", entrada);
            nombreMonedaOrigen = Localizacion.localizando(baseCode, 0).nombreMoneda();
            // Seleccion de moneda destino

            targetCode = CodigoPais.codigo("Seleccione la moneda de destino (0 para salir):", entrada);
            nombreMonedaDestino =Localizacion.localizando(targetCode, 0).nombreMoneda();
            if (baseCode.equals(targetCode)){
                System.out.println("seleccione monedas diferentes");
            }
        }while (baseCode.equals(targetCode));

        // Obtencion del valor a ser convertido

        ImprimirValores.imprimir(ObtenerValor.valor(
                        "a convertir de " + nombreMonedaOrigen + " para " + nombreMonedaDestino + " (0 para salir):", entrada),
                baseCode, targetCode);
    }
}