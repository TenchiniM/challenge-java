package br.com.dio.javacore.test;

import br.com.dio.javacore.classes.Doces;

//Uma lojinha de doces tem muitos clientes por ser ao lado de uma escola.
// Para aumentar as vendas o dono resolveu colocar uma máquina onde os clientes,
// principalmente as crianças que estão muito acostumadas com a tecnologia,
// poderiam colocar suas moedas e receber dois doces aleatórios. Cada 1 real irá render 2 doces aleatórios.

public class DocesTest {
    public static void main(String[] args) {
        Doces doc = new Doces();
        doc.quantidadeDeDoces();
    }
}
