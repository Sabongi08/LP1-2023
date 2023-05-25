public abstract class Gastos {
    private String nome;
    private double valor;

    public Gastos(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void mudarValor (double valor){
        this.valor = valor;
    }

}

