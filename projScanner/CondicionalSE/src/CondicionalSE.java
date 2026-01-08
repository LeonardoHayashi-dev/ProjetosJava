import java.util.Scanner;
public class CondicionalSE {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x;
        System.out.println("Digite um valor inteiro"); // verificando se o valor é maior que 0
        x = Integer.parseInt((entrada.nextLine()));
        if (x>0) {
        System.out.println("O numero é positivo");
        }else  {
            System.out.println("O numero é Vasco");
        }

    }

}
