import java.util.Scanner;
public class DesafioDois {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int categoria;
        System.out.println("Digite o numero referente a categoria");
        categoria = Integer.parseInt(entrada.nextLine());

        switch (categoria) {
            case 1:
                System.out.println("Alimentos Pereciveis: Corredor A");
                break;
            case 2:
                System.out.println("Limpeza: Corredor B");
                break;
            case 3:
                System.out.println("Eletrônico: Corredor C");
                break;
            case 4:
                System.out.println("Vestuário: Corredor D");
                break;
            case 5:
                System.out.println("Móveis: Corredor E");
                break;
            default:
                System.out.println("Categoria Desconhecida: Entrada de triagem");
        }
    }
}
