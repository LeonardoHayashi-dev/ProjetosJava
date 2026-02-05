package cap8lab2;

public class cap8lab2 {
    public static void main(String[] args) {

        if (args.length > 0) {

            int soma = 0;

            for (int i = 0; i < args.length; i++) {
                soma += Integer.parseInt(args[i]);
            }

            double media = (double) soma / args.length;

            System.out.println("Média das idades: " + media);

        } else {
            System.out.println("Entre com valores válidos para as idades");
        }
    }
}
