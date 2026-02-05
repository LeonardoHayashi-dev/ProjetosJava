package cap6lab1;

public class cap6lab1 {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        // Chamadas às versões sobrecarregadas do método subtrair
        double r1 = calc.subtrair(10.5, 2.5);
        double r2 = calc.subtrair(10, 2.5);
        double r3 = calc.subtrair(10.5, 2);

        // Imprimindo os resultados
        System.out.println("Subtração (double, double): " + r1);
        System.out.println("Subtração (int, double): " + r2);
        System.out.println("Subtração (double, int): " + r3);
    }
}
