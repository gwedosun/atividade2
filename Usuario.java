public class Usuario extends Pessoa {
    private Integer matricula;

    public Usuario(String nome, String email, Integer matricula) {
        super(nome, email); // Chamada do construtor da superclasse DEVE ser a primeira linha
        this.matricula = matricula;
    }

    public Integer getMatricula() {
        return this.matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    @Override
    public void exibirInfo(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("E-mail: " + this.getEmail());
        System.out.println("Matricula: " + this.matricula);
    }
}