package com.warrieta.conversor.classes;

import java.io.IOException;

public class ImprimirValores {
    public static void imprimir(double valorEntrada, String baseCode, String targetCode) throws IOException, InterruptedException {
        System.out.println("El valor de "
                + Localizacion.localizando(baseCode, valorEntrada).valorFormateado()
                + " "
                + " (" + Localizacion.localizando(baseCode, 0).nombreMoneda() + ") equivale a: " + Localizacion.localizando(targetCode, Api.iniciaApi(baseCode, targetCode, valorEntrada)).valorFormateado() + " (" + Localizacion.localizando(targetCode, 0).nombreMoneda() + ")");
    }
}