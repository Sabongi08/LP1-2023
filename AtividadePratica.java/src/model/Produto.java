package model;

import model.Itens;

public class Produto extends Itens {
    private int estoque;

    public Produto(long id, String nome, double preço) {
        super(id, nome, preço);
    }
    
}
