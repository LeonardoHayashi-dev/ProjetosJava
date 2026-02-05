package cap5lab1;

public class cap5lab1 {

    public static void main(String[] args) {


        Funcionario func = new Funcionario();

        func.nome = "João";
        func.sobrenome = "Silva";
        func.cargo = "Desenvolvedor Back-End";
        func.salario = 3500.00;


        System.out.println("Nome: " + func.nome);
        System.out.println("Sobrenome: " + func.sobrenome);
        System.out.println("Cargo: " + func.cargo);
        System.out.println("Salário: R$ " + func.salario);
    }
}
