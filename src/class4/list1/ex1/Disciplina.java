package class4.list1.ex1;

public class Disciplina {
    private String nome;
    private int carga;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public Disciplina(String nome, int carga) {
        this.nome = nome;
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nome='" + nome + '\'' +
                ", carga=" + carga +
                '}';
    }
}
