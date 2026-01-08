import java.util.Scanner;
public class ExercicioTernario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero");
        int numero = 10;
        numero = Integer.parseInt(entrada.nextLine());
        String tipo = (numero%2 == 0)? "par": "impar";
        System.out.println("O numero é " + tipo);



    }
}
