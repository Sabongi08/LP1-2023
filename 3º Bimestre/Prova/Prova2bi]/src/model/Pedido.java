package model;

import repository.ExibirInterfacee;

public class Pedido extends Orcamento implements ExibirInterfacee{
    String dataEntrega;
    boolean entregue;

    public Pedido() {
    }

    public void entregar() {

    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    @Override
    public void exibir(Boolean completo) {

    }
}
