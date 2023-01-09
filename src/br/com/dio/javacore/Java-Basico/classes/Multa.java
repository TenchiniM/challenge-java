package br.com.dio.javacore.classes;

import java.util.Scanner;

public class Multa {
    public void verificarMulta() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual a velocidade ?");
        int velocidadeAtual = leitor.nextInt();
        if (velocidadeAtual > 60) {
            System.out.println("Foi multado");
        }else {
            System.out.println("Nao foi multado");
        }


    }


}
