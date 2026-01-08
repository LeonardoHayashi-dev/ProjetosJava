import java.util.Scanner;
public class SETernario {
    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);
        int nota1;

        System.out.println("Digite nota");

        nota1 = Integer.parseInt(nota.nextLine());

        String situacao = nota1 >= 8 ? "passou de ano" : "repetiu de ano";
        System.out.println("O aluno " + situacao);

    }
}
