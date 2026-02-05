package cap6lab3;

public class Aluno {

    private String nome;

    public static int contadorDeAlunos = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimeAluno() {
        System.out.println("Nome do aluno: " + nome);
    }
}