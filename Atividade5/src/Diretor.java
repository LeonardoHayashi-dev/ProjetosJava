public class Diretor extends Funcionario {
    public Diretor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.40;
    }
}
