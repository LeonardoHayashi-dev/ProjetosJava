import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        String nome;
        int nota1, nota2, nota3;

        Scanner ler;
        ler = new Scanner(System.in);

        System.out.println("digite o nome do aluno:");
        nome = ler.next();

        System.out.println("digite a primeira nota:");
        nota1 = ler.nextInt();

        System.out.println("digite a segunda nota:");
        nota2 = ler.nextInt();

        System.out.println("digite a terceira nota:");
        nota3 = ler.nextInt();

        System.out.println("O aluno " + nome + " tem a media de: " + (nota1 + nota2 + nota3) / 3);
        
    }
}
