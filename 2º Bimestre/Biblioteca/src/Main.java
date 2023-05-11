public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("nome", new Dono("Alison", 356));

        biblioteca.addLivros (new Livros("O guia do mochileiro das galáxias", "Douglas Adams", 1979));
        biblioteca.addLivros (new Livros("Dom Casmurro", "Machado de Assis", 1899));
        biblioteca.addLivros (new Livros("O filho de mil anos", "Valter Hugo Mãe", 2011));
        biblioteca.addLivros (new Livros("Eu robô", "Issac Assimov", 1950));
        biblioteca.addLivros (new Livros("Cai o pano", "Agatha Christie", 1975));

        biblioteca.mostrarLivros();
    }
}

