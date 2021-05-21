package class4.list1.ex1;

public class Ex1 {
    public static void main(String[] args) {
        Estudante joao = new Estudante("João", 18, 1);
        Estudante jose = new Estudante("José", 21, 2);

        Disciplina programacao = new Disciplina("Programação", 360);
        Disciplina oop = new Disciplina("OOP", 240);

        Turma bootcamp = new Turma(1, "A");

        bootcamp.addEstudante(joao);
        bootcamp.addEstudante(jose);
        bootcamp.addDisciplina(programacao);
        bootcamp.addDisciplina(oop);

        System.out.println(bootcamp.getEstudantes());
        System.out.println(bootcamp.getDisciplinas());
    }
}
