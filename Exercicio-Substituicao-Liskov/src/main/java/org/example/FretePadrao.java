package org.example;

public class FretePadrao implements EstrategiaDeFrete {

    // VARIAVEL
    private double valorFrete;

    public FretePadrao(double valorFrete) {

        this.valorFrete = valorFrete;
    }

    @Override
    public double calcularValorFinal(Pedido pedido) {

        return pedido.getValorBruto() + valorFrete;
    }
}