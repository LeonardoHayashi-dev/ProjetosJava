public class OperadorMatematicos {
    public static void main(String[] args) {

        int  valor1 = 51;

        int  valor2 = 17;

        // Operador de soma
        System.out.println("Somando os dois valores :" + (valor1 + valor2));

        // Operador de subtração
        System.out.println("Subtraindo os dois valores :" + (valor1 - valor2));

        // Operador de multiplicação
        System.out.println("Multiplicando os dois valores :" + (valor1 * valor2));

        // Operador de divisão
        System.out.println("Dividindo os dois valores :" + (valor1 / valor2));

        // Operador de módulo da divisão
        System.out.println("Módulo dos valores :" + (valor1 % valor2));


        int nota1 = 8;
        int nota2 = 7;
        int nota3 = 9;
        int media = (nota1 + nota2 + nota3) / 3;

        System.out.println(media);

        double c = 30;
        double F = c * 1.8 + 32;

        System.out.println(F);

        int num1 = 17, num2 = 5;

        System.out.println("Módulo dos valores : " + (num1 % num2));
    }
}
