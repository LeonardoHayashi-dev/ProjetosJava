import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

        double vlrApl, taxJur, rendimento;
        Scanner ler;
        ler = new Scanner(System.in);

        System.out.println("Digite o valor da aplicação:");
        vlrApl = ler.nextDouble();

        System.out.println("Digite a taxa de juros:");
        taxJur = ler.nextDouble();

        rendimento = vlrApl * taxJur;

        System.out.println("O rendimento da aplicação é de:" + rendimento);


    }
}
