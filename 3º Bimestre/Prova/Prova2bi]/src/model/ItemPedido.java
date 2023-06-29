package model;

import repository.ExibirInterfacee;

public class ItemPedido implements ExibirInterfacee {
    public static long IdBase;
    long id;
    String peca;
    String modelo;
    String tamanho;
    double valor;



    public ItemPedido(String peca, String modelo, String tamanho, double valor) {
        this.peca = peca;
        this.modelo = modelo;
        this.tamanho = tamanho;
        this.valor = valor;
        this.id = IdBase++;
    }

    public static long getIdBase() {
        return IdBase;
    }

    public String getPeca() {
        return peca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public double getValor() {
        return valor;
    }

    public static void setIdBase(long idBase) {
        IdBase = idBase;
    }

    public void setPeca(String peca) {
        this.peca = peca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    public String add() {
        return "Item{" +
                "id=" + id +
                ", valor=" + valor +
                '}';
    }


}
