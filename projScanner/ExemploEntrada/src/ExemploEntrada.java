import java.util.Scanner;

public class ExemploEntrada {
    public static void main(String[] args) {
        //1 declaração de variaveis

        char sexo; // armazena um caracter
        float Salario;
        int idade;
        String nome;

        //2 entrada de dados

        Scanner leia;// declaração da variavel leia para ser utilizada na classe do scanner

        leia = new Scanner(System.in);// inicializando a variavel leia para ser utilizada pelo scanner

        System.out.println("Digite o nome");// mostrando mensagem para que tipo de informação deve ser informada

        nome = leia.nextLine();

        System.out.println("Digite a idade");

        idade = leia.nextInt();

        System.out.println("Digite o salario");

        Salario = leia.nextFloat();

        System.out.println("Digite o sexo. M para masculino e F para feminino");

        sexo = leia.next().charAt(0);

        System.out.println("o nome digitado é: " + nome);
        System.out.println("a idade digitada é: " + idade);
        System.out.println("o salario digitado é: " + Salario);
        System.out.println("o sexo digitado é: " + sexo);
    }
}
