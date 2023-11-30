public class Aluno extends Disciplinas {

    private String nome;
    private double nota1;
    private double nota2;
    private String disciplina;

    public Aluno(String nome, double nota1, double nota2, String disciplina) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.disciplina = disciplina;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Disciplina: " + disciplina);
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Matheus", 8.5, 9.0, "Ambiente de Dados");

        aluno1.exibirInformacoes();

        System.out.println("Média: " + aluno1.calcularMedia());
    }
}
