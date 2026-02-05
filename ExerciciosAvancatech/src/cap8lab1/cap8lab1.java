package cap8lab1;

public class cap8lab1 {
    public static int maiorNumero(int[] numeros) {

        int maior = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        return maior;
    }

    public static void main(String[] args) {

        int[] numeros = { 5, 12, 3, 9, 25, 7 };

        int resultado = maiorNumero(numeros);

       System.out.println("O maior número do array é: " + resultado);
    }

}
