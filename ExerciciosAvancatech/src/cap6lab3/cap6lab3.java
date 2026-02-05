package cap6lab3;

public class cap6lab3 {
    public static void main(String[] args) {

        // Primeiro aluno
        Aluno a1 = new Aluno();
        a1.setNome("João");
        a1.contadorDeAlunos++;
        a1.imprimeAluno();
        System.out.println("Contador pelo objeto: " + a1.contadorDeAlunos);
        System.out.println("Contador pela classe: " + Aluno.contadorDeAlunos);
        System.out.println();

        // Segundo aluno
        Aluno a2 = new Aluno();
        a2.setNome("Maria");
        a2.contadorDeAlunos++;
        a2.imprimeAluno();
        System.out.println("Contador pelo objeto: " + a2.contadorDeAlunos);
        System.out.println("Contador pela classe: " + Aluno.contadorDeAlunos);
        System.out.println();

        // Terceiro aluno
        Aluno a3 = new Aluno();
        a3.setNome("Marcos");
        a3.contadorDeAlunos++;
        a3.imprimeAluno();
        System.out.println("Contador pelo objeto: " + a3.contadorDeAlunos);
        System.out.println("Contador pela classe: " + Aluno.contadorDeAlunos);
    }
}
