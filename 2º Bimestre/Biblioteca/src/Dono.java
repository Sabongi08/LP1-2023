public class Dono {
    private String nome;
    private int cpf;

    //construtores
    public Dono(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    //set e get
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
