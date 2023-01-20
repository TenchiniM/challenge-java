package br.com.dio.javacore.classes;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

// Programa que recebe a temperatura media dos primeiros 6 meses do ano e armazena em uma List
public class Temperatura {
    Scanner leitor = new Scanner(System.in);
    List<Integer> temperatura = new ArrayList<>();

    public void pedirTemperatura() {
        for (int i = 0; i < 6; i++) {
            System.out.println("Insira as temperaturas dos primeiros 6 meses: ");
            temperatura.add(leitor.nextInt());
            System.out.println(temperatura);
        }
    }

    public void mediaTemperatura() {
        int soma = 0;
        System.out.println("Média Semestral: ");
        Iterator<Integer> iterator = temperatura.iterator();

        while (iterator.hasNext()) {
            int next = iterator.next();
            soma += next;
        }
        int media = (soma / temperatura.size());
        System.out.println(media);
        System.out.println("Temperaturas que ficaram acima da média: ");

        Iterator<Integer> iterator2 = temperatura.iterator();
        while (iterator2.hasNext()) {
            int next = iterator2.next();
            if (next <= media) {
                iterator2.remove();
                continue;
            }

        }
        System.out.println(temperatura);
    }

}
