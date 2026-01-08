import java.util.Scanner;
public class CondicionalSE2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int x;
        System.out.println("Digite um valor");
        x = Integer.parseInt(entrada.nextLine());
        if (x>=1 && x<=10) {
            System.out.println("Pertence ao intervalo de 0 a 10");

        } else {
            System.out.println("Não pertence ao intervalo de 0 a 10");
        }
    }
}
