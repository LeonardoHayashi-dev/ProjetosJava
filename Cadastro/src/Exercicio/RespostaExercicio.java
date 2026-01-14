package Exercicio;
import java.util.Scanner;

public class RespostaExercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Aluno alunos[] = new Aluno[6];

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Registro do aluno:");
            alunos[i] = new Aluno();
            System.out.println("Insira o nome do aluno");
            alunos[i].nome = entrada.next();
            System.out.println("Insira a idade do aluno");
            alunos[i].idade = entrada.nextInt();
            System.out.println("Insira a matéria");
            alunos[i].materia = entrada.next();
            System.out.println("Insira a nota1 do aluno");
            alunos[i].nota = entrada.nextInt();
        }
        System.out.println("\n--- LISTA DE ALUNOS ---");

        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null) {
                System.out.println("Aluno " + (i + 1));
                System.out.println("Nome: " + alunos[i].nome);
                System.out.println("Idade: " + alunos[i].idade);
                System.out.println("Matéria: " + alunos[i].materia);
                System.out.println("Nota: " + alunos[i].nota);
                System.out.println("----------------------");
            }
        }
        entrada.close();
    }
}
