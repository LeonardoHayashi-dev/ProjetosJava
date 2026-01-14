package Exercicio2;
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
        System.out.println("Insira a primeira nota do aluno");
        alunos[0].nota1 = entrada.nextInt();
        System.out.println("Insira a segunda nota do aluno");
        alunos[0].nota2 = entrada.nextInt();
        alunos[0].media = (alunos[0].nota1 + alunos[0].nota2) / 2;
        if (alunos[0].media>=7) {
        System.out.println("O Aluno " + alunos[0].nome +" idade : "+ alunos[0].idade + " está aprovado na materia: "+ alunos[0].materia + " com a media: " + alunos[0].media);
        } else {
            System.out.println("O Aluno " + alunos[0] + " está reprovado");
        }

        System.out.println("Registro segundo aluno:");
        alunos[1] = new Aluno();
        System.out.println("Insira o nome do aluno");
        alunos[1].nome = entrada.next();
        System.out.println("Insira a idade do aluno");
        alunos[1].idade = entrada.nextInt();
        System.out.println("Insira a matéria");
        alunos[1].materia = entrada.next();
        System.out.println("Insira a primeira nota do aluno");
        alunos[1].nota1 = entrada.nextInt();
        System.out.println("Insira a segunda nota do aluno");
        alunos[1].nota2 = entrada.nextInt();
        alunos[1].media = (alunos[1].nota1 + alunos[1].nota2) / 2;
        if (alunos[1].media>=7) {
            System.out.println("O Aluno " + alunos[1].nome +" idade : "+ alunos[1].idade + " está aprovado na materia: "+ alunos[1].materia + " com a media: " + alunos[1].media);
        } else {
            System.out.println("O Aluno " + alunos[1] + " está reprovado");
        }


        System.out.println("Registro terceiro aluno:");
        alunos[2] = new Aluno();
        System.out.println("Insira o nome do aluno");
        alunos[2].nome = entrada.next();
        System.out.println("Insira a idade do aluno");
        alunos[2].idade = entrada.nextInt();
        System.out.println("Insira a matéria");
        alunos[2].materia = entrada.next();
        System.out.println("Insira a primeira nota do aluno");
        alunos[2].nota1 = entrada.nextInt();
        System.out.println("Insira a segunda nota do aluno");
        alunos[2].nota2 = entrada.nextInt();
        alunos[2].media = (alunos[2].nota1 + alunos[2].nota2) / 2;
        if (alunos[2].media>=7) {
            System.out.println("O Aluno " + alunos[2].nome +" idade : "+ alunos[2].idade + " está aprovado na materia: "+ alunos[2].materia + " com a media: " + alunos[2].media);
        } else {
            System.out.println("O Aluno " + alunos[2] + " está reprovado");
        }

        System.out.println("Registro quarto aluno:");
        alunos[3] = new Aluno();
        System.out.println("Insira o nome do aluno");
        alunos[3].nome = entrada.next();
        System.out.println("Insira a idade do aluno");
        alunos[3].idade = entrada.nextInt();
        System.out.println("Insira a matéria");
        alunos[3].materia = entrada.next();
        System.out.println("Insira a primeira nota do aluno");
        alunos[3].nota1 = entrada.nextInt();
        System.out.println("Insira a segunda nota do aluno");
        alunos[3].nota2 = entrada.nextInt();
        alunos[3].media = (alunos[3].nota1 + alunos[3].nota2) / 2;
        if (alunos[3].media>=7) {
            System.out.println("O Aluno " + alunos[3].nome +" idade : "+ alunos[3].idade + " está aprovado na materia: "+ alunos[3].materia + " com a media: " + alunos[3].media);
        } else {
            System.out.println("O Aluno " + alunos[3] + " está reprovado");
        }

        System.out.println("Registro quinto aluno:");
        alunos[4] = new Aluno();
        System.out.println("Insira o nome do aluno");
        alunos[4].nome = entrada.next();
        System.out.println("Insira a idade do aluno");
        alunos[4].idade = entrada.nextInt();
        System.out.println("Insira a matéria");
        alunos[4].materia = entrada.next();
        System.out.println("Insira a primeira nota do aluno");
        alunos[4].nota1 = entrada.nextInt();
        System.out.println("Insira a segunda nota do aluno");
        alunos[4].nota2 = entrada.nextInt();
        alunos[4].media = (alunos[4].nota1 + alunos[4].nota2) / 2;
        if (alunos[1].media>=7) {
            System.out.println("O Aluno " + alunos[4].nome +" idade : "+ alunos[4].idade + " está aprovado na materia: "+ alunos[4].materia + " com a media: " + alunos[4].media);
        } else {
            System.out.println("O Aluno " + alunos[4] + " está reprovado");
        }

        System.out.println("Registro sexto aluno:");
        alunos[5] = new Aluno();
        System.out.println("Insira o nome do aluno");
        alunos[5].nome = entrada.next();
        System.out.println("Insira a idade do aluno");
        alunos[5].idade = entrada.nextInt();
        System.out.println("Insira a matéria");
        alunos[5].materia = entrada.next();
        System.out.println("Insira a primeira nota do aluno");
        alunos[5].nota1 = entrada.nextInt();
        System.out.println("Insira a segunda nota do aluno");
        alunos[5].nota2 = entrada.nextInt();
        alunos[5].media = (alunos[5].nota1 + alunos[5].nota2) / 2;
        if (alunos[5].media>=7) {
            System.out.println("O Aluno " + alunos[5].nome +" idade : "+ alunos[5].idade + " está aprovado na materia: "+ alunos[5].materia + " com a media: " + alunos[5].media);
        } else {
            System.out.println("O Aluno " + alunos[5] + " está reprovado");
        }
    }
}
