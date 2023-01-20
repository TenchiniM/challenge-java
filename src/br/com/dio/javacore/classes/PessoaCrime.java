package br.com.dio.javacore.classes;

import java.util.*;

// 5 Perguntas para a vítima e se responder 2: suspeita, 3 e 4 : cumplice, 5 : Assasina, caso contrário, sera classificada como inocente.
public class PessoaCrime {
    Scanner leitor = new Scanner(System.in);
    List<Integer> crime = new ArrayList<>();

    public void fazerPerguntas() {
        System.out.println("Telefonou para a vítima ? (0 para : NÃO e 1 para : SIM )");
        crime.add(leitor.nextInt());
        System.out.println("Esteve no local do crime ? (0 para : NÃO e 1 para : SIM )");
        crime.add(leitor.nextInt());
        System.out.println("Mora perto da vitima ? (0 para : NÃO e 1 para : SIM )");
        crime.add(leitor.nextInt());
        System.out.println(" Devia para a vítima ? (0 para : NÃO e 1 para : SIM )");
        crime.add(leitor.nextInt());
        System.out.println(" Já trabalhou com a vítima ? (0 para : NÃO e 1 para : SIM )");
        crime.add(leitor.nextInt());

    }

    public void calcularEMostrar() {
        Iterator<Integer> iterator = crime.iterator();

            int soma = 0;
            for (Integer n : crime) {
                soma += n.intValue();
            }

            switch (soma ){
                case 0:
                    System.out.println("Inocente");
                    break;
                case 1:
                    System.out.println("Inocente");
                    break;
                case 2:
                    System.out.println("Suspeito");
                    break;
                case 3:
                    System.out.println("Cumplice");
                    break;
                case 4:
                    System.out.println("Cumplice");
                    break;
                case 5:
                    System.out.println("Assasina");
                    break;
            }
        }
    }