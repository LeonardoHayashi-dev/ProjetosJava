import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {

        double sal, aum;
        Scanner ler;
        ler = new Scanner(System.in);

        System.out.println("Digite o salario:");
        sal = ler.nextDouble();

        aum = sal * 0.15;

        System.out.println("O novo salario é: "+(sal + aum));






    }
}
