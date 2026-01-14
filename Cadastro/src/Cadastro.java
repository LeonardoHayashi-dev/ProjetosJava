public class Cadastro {
    public static void main(String[] args) {
        Pessoa pessoas[] = new Pessoa[2]; // vai armazenar 2 elementos do tipo pessoa
        pessoas[0] = new Pessoa(); // cria uma instância para ocorrência 0
        pessoas[0].altura = 1.75;
        pessoas[0].peso = 75;

        pessoas[1] = new Pessoa(); // cria uma instância para ocorrência 1
        pessoas[1].altura = 1.58;
        pessoas[1].peso = 55;

        // impressão de dados
        System.out.println("Mostrando os dados da matriz pessoa posição 0");
        System.out.println("Altura : " + pessoas[0].altura);
        System.out.println("Peso : " + pessoas[0].peso);

        System.out.println("Mostrando os dados da matriz pessoa posição 1");
        System.out.println("Altura : " + pessoas[1].altura);
        System.out.println("Peso : " + pessoas[1].peso);

    }
}
