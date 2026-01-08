import java.util.Scanner;
public class Desafio {
    public static void main(String[] args) {
        Scanner convite = new Scanner(System.in);
        int idade;

        System.out.println("Digite a idade");
        idade = Integer.parseInt(convite.nextLine());

        if (idade>=18) {
            System.out.println("Pode entrar no PankaDão!");
        } else {
            System.out.println("Não pode entrar de menor");
        }
    }
}
