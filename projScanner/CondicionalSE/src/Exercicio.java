import java.util.Scanner;
public class Exercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double saldo = 500.00;
        double saque;
        double deposito;
        int escolha;

        System.out.println("Menu Sistema Bancário");
        System.out.println("Escolha uma das opçoes: 1 para ver, 2 para sacar dinheiro, 3 para depositar dinheiro");
        escolha = Integer.parseInt(entrada.nextLine());

        switch (escolha) {
            case 1:
                System.out.println("o saldo é de: R$" + saldo);
                break;

            case  2:
                System.out.println("Quanto de dinheiro deseja sacar?");
                saque =  entrada.nextDouble();
                if (saque<=saldo) {
                    System.out.println("Pode sacar o valor: R$" + saque);
                    saldo = saldo - saque;
                    System.out.println("Novo saldo: R$" + saldo);
                }else {
                    System.out.println("Valor excede o saldo.");
                } break;
            case 3:
                System.out.println("Quanto deseja depositar?");
                deposito = entrada.nextDouble();
                if (deposito >= 1) {
                    saldo = (saldo + deposito);
                    System.out.println("Deposito feito com sucesso");
                    System.out.println("Novo saldo: R$" + saldo);
                } else {
                    System.out.println("Valor inválido");
                }
                break;

        }
    }
}
