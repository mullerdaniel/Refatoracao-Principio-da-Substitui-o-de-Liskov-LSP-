package org.example;

public class Main {
    public static void main(String[] args) {

        // OBJETOS
        Pedido pedido1 = new Pedido(550.0);
        Pedido pedido2 = new Pedido(125.0);

        EstrategiaDeFrete fretePadrao = new FretePadrao(25.0);
        EstrategiaDeFrete freteGratis = new FreteGratis();

        ProcessadorDePagamento processador = new ProcessadorDePagamento();

        double somaTotal1 = processador.processar(pedido1, fretePadrao);
        System.out.println("Primeiro Pedido com o Frete Padrão: R$ " + somaTotal1);

        double somaTotal2 = processador.processar(pedido2, freteGratis);
        System.out.println("Segundo Pedido com o Frete Grátis: R$ " + somaTotal2);

    }
}