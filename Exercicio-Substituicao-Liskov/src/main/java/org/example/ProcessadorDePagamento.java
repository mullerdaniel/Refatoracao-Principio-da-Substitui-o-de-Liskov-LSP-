package org.example;

public class ProcessadorDePagamento {

    // METODO
    public double processar(Pedido pedido, EstrategiaDeFrete estrategia) {
        double valorFinal = estrategia.calcularValorFinal(pedido);

        // VERIFICADOR
        if (valorFinal < pedido.getValorBruto()) {
            throw new IllegalStateException(
                    "O valor final não pode ser menor que o valor bruto!"
            );
        }

        // RETORNAR
        return valorFinal;
    }
}