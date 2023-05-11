import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    private String dono;
    private List<Biblioteca> livros = new ArrayList();
    private List<Biblioteca>funcionarios =new ArrayList();

    public Biblioteca(String nome, String dono) {
        this.nome = nome;
        this.dono = dono;
    }

    //set e get
    public String getNome() {
        return nome;
    }

    public String getDono() {
        return dono;
    }

    public List<Biblioteca> getLivros() {
        return livros;
    }

    public List<Biblioteca> getFuncionarios() {
        return funcionarios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setLivros(List<Biblioteca> livros) {
        this.livros = livros;
    }

    public void setFuncionarios(List<Biblioteca> funcionarios) {
        this.funcionarios = funcionarios;
    }
}
