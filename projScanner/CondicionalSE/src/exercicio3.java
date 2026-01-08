import  java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args) {
        double valorCompra = 150.0;

        String desconto = valorCompra > 100 ? "Desconto de 10" : "Não tem desconto";
        System.out.println(desconto);
    }
}
