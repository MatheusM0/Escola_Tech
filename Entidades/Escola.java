package Entidades;

public class Escola {

    
    public void realizarChamada() {
        System.out.println("Realizando chamada na escola");
    }

    public void chamarMinistrarAula(Professor professor) {
        professor.ministrarAula();
    }

    public void organizarEvento() {
        System.out.println("Organizando evento na escola");
    }

    public static void main(String[] args) {
        
        Escola escola = new Escola();
        escola.realizarChamada();

        escola.organizarEvento();

        Professor professor = new Professor("João", 35, 12345, "Matemática");

        escola.chamarMinistrarAula(professor);

        professor.chamarRealizarChamada(escola);
    }
}
