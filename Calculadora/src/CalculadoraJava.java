import java.util.Scanner; // Importa o Scanner para ler a entrada do usuário

public class CalculadoraJava {

    // Método principal onde a execução do programa começa
    public static void main(String[] args) {

// Cria o objeto Scanner para ler a entrada do teclado (System.in)
        Scanner scan = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println(" CALCULADORA JAVA SIMPLES ");
        System.out.println("=====================================");
        int opcao = -1; // Variável de controle para o menu

        // Loop principal: O programa roda até que o usuário escolha a opção 0 (Sair)
        do {
            System.out.println("\n--- MENU DE OPERAÇÕES ---");
            System.out.println("1. Adição (+);");
            System.out.println("2. Subtração (-)");
            System.out.println("3. Multiplicação (*)");
            System.out.println("4. Divisão (/)");
            System.out.println("0. Sair");
            System.out.print("Escolha a operação (1-4) ou 0 para sair: ");

// Tenta ler a opção
            if (scan.hasNextInt()) {
                opcao = scan.nextInt();
            } else {
                System.out.println("❌ Entrada inválida. Por favor, digite um número.");
                scan.next(); // Limpa a entrada inválida do buffer do Scanner
                continue; // Volta para o início do loop
            }
            // Se a opção for Sair, termina o loop
            if (opcao == 0) {
                break;
            }

// Se a opção for de 1 a 4, pede os números
            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o primeiro número: ");
// Usa nextDouble() para permitir números com casas decimais (double)
                double num1 = scan.nextDouble();

                System.out.print("Digite o segundo número: ");
                double num2 = scan.nextDouble();

                double resultado = 0; // Variável para armazenar o resultado final

                // Estrutura SWITCH: Executa o código específico baseado na &#39;opcao&#39;
                switch (opcao) {
                    case 1:
                        resultado = num1 + num2; // Operador Aritmético (+)
                        System.out.println("Resultado da Adição: " + resultado);
                        break;
                    case 2:
                        resultado = num1 - num2; // Operador Aritmético (-)
                        System.out.println("Resultado da Subtração: " + resultado);
                        break;
                    case 3:
                        resultado = num1 * num2; // Operador Aritmético (*)
                        System.out.println("Resultado da Multiplicação: " + resultado);
                        break;
                    case 4:
// Verificação de erro: Divisão por zero (Operador Relacional !=)
                        if (num2 != 0) {
                            resultado = num1 / num2; // Operador Aritmético (/)
                            System.out.println("Resultado da Divisão: " + resultado);
                        } else {
                            System.out.println("⚠️ Erro: Divisão por zero não é permitida.");
                        }
                        break;
                    default:
// Não deve acontecer, mas é uma segurança extra
                        System.out.println("❌ Opção inválida.");
                }
            } else {
                System.out.println("❌ Opção fora do intervalo. Escolha entre 0 e 4.");
            }

        } while (opcao != 0); // Repete enquanto a opção for diferente de 0

        System.out.println("\nCalculadora encerrada. Até mais!");
        scan.close(); // Boa prática: Fecha o Scanner ao finalizar o programa
    }
}