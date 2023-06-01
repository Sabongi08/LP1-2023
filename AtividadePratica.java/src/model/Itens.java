package model;

public abstract class Itens {
    private static long idBase;
    private long  id;
    private String  nome;
    private double preço;


    public Itens(long id, String nome, double preço) {
        this.id = id;
        this.nome = nome;
        this.preço = preço;
        this.id = idBase;
        idBase = getIdBAse() + 1;
    }

    public static long getIdBAse() {
        return idBase;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreço() {
        return preço;
    }

    public static void setIdBAse(long idBAse) {
        Itens.idBase = idBAse;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }
}

