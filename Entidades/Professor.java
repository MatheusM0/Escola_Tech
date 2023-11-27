package Entidades;

public class Professor extends Funcionario {
    protected String curso;


    public Professor(String nome, int idade, int matricula, String curso){
        super(nome, idade, matricula);
        this.curso = curso;
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


    public String getCurso() {
        return curso;
    }


    public void setCurso(String curso) {
        this.curso = curso;
    }

    
}
