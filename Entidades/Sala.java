package Entidades;

public class Sala {

    private Disciplinas disciplinaDestaque;
    public String nome;
    public double notaManha;
    public double notaTarde;

    public Sala (String nome, double notaManha, double notaTarde) {
        this.nome = nome;
        this.notaManha = notaManha;
        this.notaTarde = notaTarde;
    }

    public void showInfo (){
        System.out.println("Sala: " + nome);
        System.out.println("Média da manhã: " + notaManha);
        System.out.println("Média da tarde: " + notaTarde);
    }
    public double calcMedia () {
        return (notaManha + notaTarde) / 2;
    }
    public void Disciplina(String disciplinaDestaque){
        System.out.println("Disciplina de maior destaque da sala: "+ disciplinaDestaque);
    }
    public static void main(String[] args) {
        Sala classe1 = new Sala ("9° ano A", 7.8, 9.5);    
        classe1.showInfo();

        System.out.println("Média da sala: " + classe1.calcMedia());
    }
    

}
