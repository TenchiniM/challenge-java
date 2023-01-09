package br.com.dio.javacore.classes;

import java.util.Scanner;

public class Gertrudes {
    //Sua tia Gertrudes é uma leitora assídua.
    // E ela gostaria de ter um aplicativo que dissesse para ela, de acordo com o número de páginas de um livro, quanto tempo ela levaria para ler lendo apenas 3 páginas por dia.
    // Como você está aprendendo Java, você se disponibilizou para ajudá-la com esse desenvolvimento.

    public void tempoPagina(){
        Scanner leitor = new Scanner(System.in);
        int paginas = leitor.nextInt();
        int paginasLidas = 3;
        int restante = paginas/ paginasLidas;
        System.out.println(restante + " dias");
    }
}
