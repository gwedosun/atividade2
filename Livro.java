public class Livro extends Material {
    private String autor;

    public Livro(String titulo, Integer ano, String autor) {
        super(titulo, ano);
        this.autor = autor;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void descricao() {
        System.out.println("Livro: " + getTitulo());
        System.out.println("Ano: " + getAnoPublicacao()); 
        System.out.println("Autor: " + getAutor()); 
    }
}