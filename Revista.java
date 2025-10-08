public class Revista extends Material {
    private int edicao;

    public Revista(String titulo, Integer ano, int edicao) {
        super(titulo, ano);
        this.edicao = edicao;
    }

    public int getEdicao() {
        return this.edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    @Override
    public void descricao() {
        System.out.println("Livro: " + getTitulo());
        System.out.println("Ano: " + getAnoPublicacao()); 
        System.out.println("Autor: " + getEdicao()); 
    }
}