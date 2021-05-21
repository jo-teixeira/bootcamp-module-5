package class4.list1.ex1;

public class Estudante {
    private String nome;
    private int idade;
    private int numeroMatricula;

    public Estudante(String nome, int idade, int numeroMatricula) {
        this.nome = nome;
        this.idade = idade;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", numeroMatricula=" + numeroMatricula +
                '}';
    }
}
