import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        // --- CADASTRO DO PRIMEIRO CLIENTE ---
        System.out.println("Cadastro do Cliente 1:");
        System.out.print("Nome: ");
        String nome1 = ler.nextLine();

        System.out.print("CPF: ");
        String cpf1 = ler.nextLine();

        System.out.print("Endereco: ");
        String end1 = ler.nextLine();

        // Criando o objeto cliente1
        Cliente cliente1 = new Cliente(nome1, cpf1, end1);

        System.out.println("\n-----------------------------\n");

        // --- CADASTRO DO SEGUNDO CLIENTE ---
        System.out.println("Cadastro do Cliente 2:");
        System.out.print("Nome: ");
        String nome2 = ler.nextLine();

        System.out.print("CPF: ");
        String cpf2 = ler.nextLine();

        System.out.print("Endereco: ");
        String end2 = ler.nextLine();

        // Criando o objeto cliente2 (independente do primeiro)
        Cliente cliente2 = new Cliente(nome2, cpf2, end2);

        // --- EXIBIÇÃO ---
        System.out.println("\n### RELATÓRIO FINAL ###");
        cliente1.exibirDados();
        cliente2.exibirDados();

        ler.close();
    }
}