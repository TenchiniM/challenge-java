package br.com.dio.javacore.classes;

import java.util.Scanner;

//Seu sobrinho começou a ganhar mesada dos pais.
// No auge dos seus 8 anos recebendo 50 reais por mês,
// ele quer saber quanto terá se juntar
// todo o dinheiro, sem gastar nada, durante alguns meses.
//  E você, como um bom tio com habilidades de programação,
//  vai criar um programa que com as entradas do seu sobrinho vai calcular automaticamente a quantidade
//  de dinheiro que ele terá em X meses.
public class Sobrinho {
    public int leitor() {

        Scanner leitor = new Scanner(System.in);
        System.out.println("insira a quantidade de meses que voce ira guardar: ");
        int entrada = leitor.nextInt();
        int mesada = 50;
        int valorFinal = 0;
        valorFinal = mesada * entrada;
        System.out.println("Entrada: " + entrada);
        System.out.println("Você terá: " + valorFinal + " Reais ");

        return valorFinal;
    }
}
