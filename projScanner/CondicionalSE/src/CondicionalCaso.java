import java.util.Scanner;
public class CondicionalCaso {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x;
        System.out.println("Digite um valor");
        x = Integer.parseInt(entrada.nextLine());

        switch (x) {
            case 1:
                System.out.println("O valor é 1");
                break;
            case 2:
                System.out.println("O valor é 2");
                break;
            case 3:
                System.out.println("O valor é 3");
                break;
            case 4:
                System.out.println("O valor é 4");
                break;
            default:
                System.out.println("O valor Desconhecido");
                break;
        }

    }
}
