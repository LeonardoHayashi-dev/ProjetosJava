import java.util.Scanner;

public class ExemploExercicio {
    public static void main(String[] args) {

        float sal, vlrAum, novoSal;
        Scanner ler;
        ler = new Scanner(System.in);

        System.out.println("Digite o salario:");
        sal = ler.nextFloat();

        System.out.println("Digite o valor do aumento:");
        vlrAum = ler.nextFloat();

        novoSal = (sal + vlrAum);

        System.out.println("O novo salario é: "+ novoSal );



    }
}
