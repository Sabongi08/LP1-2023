import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    private Dono dono;
    private static List<Livros> livros = new ArrayList();
    private List<Funcionarios>funcionarios = new ArrayList();

    public Biblioteca(String nome, Dono dono) {
        this.nome = nome;
        this.dono = dono;
    }

    //set e get
    public String getNome() {
        return nome;
    }

    public Dono getDono() {
        return dono;
    }

    public List<Livros> getLivros() {
        return livros;
    }

    public List<Funcionarios> getFuncionarios() {
        return funcionarios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setDono(Dono dono) {
        this.dono = dono;
    }

    public void setLivros(List<Livros> livros) {
        this.livros = livros;
    }

    public void setFuncionarios(List<Funcionarios> funcionarios) {
        this.funcionarios = funcionarios;
    }
    public void addLivros(Livros livros){
        this.livros.add(livros);
    }
    public void addFuncionarios(Funcionarios funcionarios){
        this.funcionarios.add(funcionarios);
    }

    public void mostrarLivros (){
        for (Livros livro: this.livros) {
            System.out.println("Nome do livro: " + livro.getNome() + "    -    Nome do autor: " + livro.getAutor() + "    -   Ano de publicação: " + livro.getAno());
        }
    }
    public void mostrarFuncionarios (){
        for (Funcionarios funcionarios: this.funcionarios) {
            System.out.println("Nome do funcionário:" + funcionarios.getNome());
        }
    }
}
