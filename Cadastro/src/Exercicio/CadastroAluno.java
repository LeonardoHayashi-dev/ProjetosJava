package Exercicio;
import java.util.Scanner;

public class CadastroAluno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Aluno alunos[] = new Aluno[6];

        System.out.println("Registro primeiro aluno:");
        alunos[0] = new Aluno();
        System.out.println("Insira o nome do aluno");
        alunos[0].nome = entrada.next();
        System.out.println("Insira a idade do aluno");
        alunos[0].idade = entrada.nextInt();
        System.out.println("Insira a matéria");
        alunos[0].materia = entrada.next();
        System.out.println("Insira a nota1 do aluno");
        alunos[0].nota = entrada.nextInt();

        System.out.println("Registro segundo aluno:");
        alunos[1] = new Aluno();
        System.out.println("Insira o nome do aluno");
        alunos[1].nome = entrada.next();
        System.out.println("Insira a idade do aluno");
        alunos[1].idade = entrada.nextInt();
        System.out.println("Insira a matéria");
        alunos[1].materia = entrada.next();
        System.out.println("Insira a nota1 do aluno");
        alunos[1].nota = entrada.nextInt();

        System.out.println("Registro terceiro aluno:");
        alunos[2] = new Aluno();
        System.out.println("Insira o nome do aluno");
        alunos[2].nome = entrada.next();
        System.out.println("Insira a idade do aluno");
        alunos[2].idade = entrada.nextInt();
        System.out.println("Insira a matéria");
        alunos[2].materia = entrada.next();
        System.out.println("Insira a nota1 do aluno");
        alunos[2].nota = entrada.nextInt();

        System.out.println("Registro quarto aluno:");
        alunos[3] = new Aluno();
        System.out.println("Insira o nome do aluno");
        alunos[3].nome = entrada.next();
        System.out.println("Insira a idade do aluno");
        alunos[3].idade = entrada.nextInt();
        System.out.println("Insira a matéria");
        alunos[3].materia = entrada.next();
        System.out.println("Insira a nota1 do aluno");
        alunos[3].nota = entrada.nextInt();

        System.out.println("Registro quinto aluno:");
        alunos[4] = new Aluno();
        System.out.println("Insira o nome do aluno");
        alunos[4].nome = entrada.next();
        System.out.println("Insira a idade do aluno");
        alunos[4].idade = entrada.nextInt();
        System.out.println("Insira a matéria");
        alunos[4].materia = entrada.next();
        System.out.println("Insira a nota1 do aluno");
        alunos[4].nota = entrada.nextInt();


        System.out.println("Registro sexto aluno:");
        alunos[5] = new Aluno();
        System.out.println("Insira o nome do aluno");
        alunos[5].nome = entrada.next();
        System.out.println("Insira a idade do aluno");
        alunos[5].idade = entrada.nextInt();
        System.out.println("Insira a matéria");
        alunos[5].materia = entrada.next();
        System.out.println("Insira a nota1 do aluno");
        alunos[5].nota = entrada.nextInt();

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
