package br.com.dio.javacore.test;

import br.com.dio.javacore.classes.Temperatura;
//Programa que recebe a temperatura media dos primeiros 6 meses do ano e armazena em uma List
public class TemperaturaTest {
    public static void main(String[] args) {
        Temperatura temp = new Temperatura();
        temp.pedirTemperatura();
        temp.mediaTemperatura();
    }
}
