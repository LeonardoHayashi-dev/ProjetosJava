public class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularBonus() {
        return salarioBase * 0.10; // 10% padrão
    }

    public void mostrarDados() {
        System.out.println("Funcionário: " + nome);
        System.out.println("Salário base: R$ " + salarioBase);
        System.out.println("Bônus: R$ " + calcularBonus());
        System.out.println("----------------------");
    }
}
