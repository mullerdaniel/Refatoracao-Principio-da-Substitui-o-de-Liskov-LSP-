package org.example;

// IMPLEMENTANDO CLASSE ESTRATEGIA DE FRETE
public class FreteGratis implements EstrategiaDeFrete {

    @Override
    public double calcularValorFinal(Pedido pedido) {

        return pedido.getValorBruto();
    }
}