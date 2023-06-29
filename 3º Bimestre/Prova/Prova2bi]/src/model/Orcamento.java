package model;

import repository.ExibirInterfacee;

import java.util.List;

public class Orcamento implements ExibirInterfacee {
    private static long idBase;
    long id;
    double valorTotal;
    private List<ItemPedido> Itens;

    public Orcamento() {
        this.id = idBase++;
    }


    public static long getIdBase() {
        return idBase;
    }

    public long getId() {
        return id;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public Orcamento() {
    }

    @Override
    public void exibir(Boolean completo) {

    }
    //A classe Orcamento deve poder adicionar itens, ou remover itens, durante a
    //adição ou remoção de um item o valor total do pedido deve ser alterado somando
    //ou subtraindo o valor do item.

}
