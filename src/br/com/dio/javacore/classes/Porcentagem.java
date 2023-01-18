package br.com.dio.javacore.classes;

import java.util.Scanner;

//Você foi contratado para criar um gerenciador de pacotes.
// Porém, o que restou para você fazer foi o contador de porcentagem de download dos pacotes.
// Mas como o espaço para essa informação ficou pequeno, a empresa optou por fazer uma escala de 10 – 1.
// Então a escala será 1 = 10%, 2 = 20%, 3 = 30% e etc.
// Para cada 10% de download, o programa deve printar, em sequência e sem espaços, uma barra “/”.
public class Porcentagem {
    public String calcularPorcentagem() {
        Scanner leitor = new Scanner(System.in);
        String barra = "/";
        System.out.println("insira a porcentagem");
        String num1 = leitor.next();
       int num2 = Integer.valueOf(num1);
        switch (num2) {
            case 1:
                barra = "/";
                System.out.println(barra);
                return barra;
            case 2:
                barra = "//";
                System.out.println(barra);
                return barra;
            case 3:
                barra = "///";
                System.out.println(barra);
                return barra;
            case 4:
                barra = "////";
                System.out.println(barra);
                return barra;
            case 5:
                barra = "/////";
                System.out.println(barra);
                return barra;
            case 6:
                barra = "//////";
                System.out.println(barra);
                return barra;
            case 7:
                barra = "///////";
                System.out.println(barra);
                return barra;
            case 8:
                barra = "////////";
                System.out.println(barra);
                return barra;
            case 9:
                barra = "/////////";
                System.out.println(barra);
                return barra;
            case 10:
                barra =  "//////////";
                System.out.println(barra);
                return barra;

        }
        return barra;
    }
}
