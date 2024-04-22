package com.warrieta.conversor.classes;

import java.text.NumberFormat;
import java.util.Locale;

public class Localizacion {
    public static MonedaInfo localizando(String code, double valor) {
        String lengua = "";
        String pais = "";
        String moneda = "";
        switch (code) {
            case "BRL":
                lengua = "pt";
                pais = "BR";
                moneda = "Real Brasil";
                break;
            case "USD":
                lengua = "en";
                pais = "US";
                moneda = "Dolar Americano";
                break;
            case "EUR":
                lengua = "de";
                pais = "DE";
                moneda = "Euro";
                break;
            case "GBP":
                lengua = "en";
                pais = "GB";
                moneda = "Libra esterlina";
                break;
            case "JPY":
                lengua = "ja";
                pais = "JP";
                moneda = "Yen";
                break;
            case "AUD":
                lengua = "en";
                pais = "AU";
                moneda = "Dolar Australiano";
                break;
            case "CHF":
                lengua = "fr";
                pais = "CH";
                moneda = "Franco Suizo";
                break;
            case "CAD":
                lengua = "en";
                pais = "CA";
                moneda = "Dolar Canadiense";
                break;
            case "CNY":
                lengua = "sh";
                pais = "CN";
                moneda = "Renminbi / Yuan";
                break;
            case "ARS":
                lengua = "es";
                pais = "AR";
                moneda = "Peso Argentino";
                break;
            case "TRY":
                lengua = "tr";
                pais = "TR";
                moneda = "Lira Turca";
                break;
            case "BOB":
                lengua = "es";
                pais = "BO";
                moneda = "Boliviano boliviano";
                break;
            case "CLP":
                lengua = "es";
                pais = "CL";
                moneda = "Peso Chileno";
                break;
            case "COP":
                lengua = "en";
                pais = "CO";
                moneda = "Peso colombiano";
                break;
        }
        Locale locale = new Locale(lengua, pais);
        String valorFormateado = NumberFormat.getCurrencyInstance(locale).format(valor);
        return new MonedaInfo(moneda, valorFormateado);
    }
}
