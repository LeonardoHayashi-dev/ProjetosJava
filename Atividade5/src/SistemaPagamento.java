public class SistemaPagamento {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Carlos", 3000);
        Funcionario f2 = new Gerente("Aline",4000);
        Funcionario f3 = new Diretor("Thaina",5000);

        f1.mostrarDados();
        f2.mostrarDados();
        f3.mostrarDados();


    }
}
