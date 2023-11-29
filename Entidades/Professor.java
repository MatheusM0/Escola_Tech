package Entidades;

public class Professor extends Funcionario {
    protected String disciplina;


    public Professor(String nome, int idade, int matricula, String disciplina){
        super(nome, idade, matricula);
        this.disciplina = disciplina;
    }

    
    public void ministrarAula(){
        System.out.println("Ministrando aula de "+disciplina);
    }

    public void aplicarProva(){
        System.out.println("Aplicando prova de "+disciplina);
    }

    public void avaliarAluno(String nomeAluno, double nota){
        System.out.println("Avaliando o aluno " + nomeAluno + " na disciplina de " + disciplina + ". Nota: " + nota);
    }
    
}
