package class4.list1.ex1;

import java.util.ArrayList;

public class Turma {
    private int ano;
    private String identificador;
    private ArrayList<Estudante> estudantes = new ArrayList<>();
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public Turma(int ano, String identificador) {
        this.ano = ano;
        this.identificador = identificador;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public ArrayList<Estudante> getEstudantes() {
        return estudantes;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void addEstudante(Estudante estudante) {
        this.estudantes.add(estudante);
    }

    public void addDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }
}
