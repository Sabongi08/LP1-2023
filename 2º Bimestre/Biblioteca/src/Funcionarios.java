public class Funcionarios {

    private String nome;
    private int cpf;

    //construtor:
    public Funcionarios(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    //get:
    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    //set:
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
