package cap5lab2;

public class Garagem {

    // Atributos do tipo Carro
    Carro carroPasseio;
    Carro carroUtilitario;

    public static void main(String[] args) {

        // Instanciando a Garagem
        Garagem g = new Garagem();

        // Instanciando os carros
        g.carroPasseio = new Carro();
        g.carroUtilitario = new Carro();

        // Configurando o carro de passeio
        g.carroPasseio.modelo = "Civic";
        g.carroPasseio.potenciaMotor = 155;
        g.carroPasseio.cor = "Prata";

        // Configurando o carro utilitário
        g.carroUtilitario.modelo = "Hilux";
        g.carroUtilitario.potenciaMotor = 204;
        g.carroUtilitario.cor = "Preta";

        // Imprimindo os dados do carro de passeio
        System.out.println("=== Carro de Passeio ===");
        System.out.println("Modelo: " + g.carroPasseio.modelo);
        System.out.println("Potência do motor: " + g.carroPasseio.potenciaMotor + " cv");
        System.out.println("Cor: " + g.carroPasseio.cor);

        System.out.println();

        // Imprimindo os dados do carro utilitário
        System.out.println("=== Carro Utilitário ===");
        System.out.println("Modelo: " + g.carroUtilitario.modelo);
        System.out.println("Potência do motor: " + g.carroUtilitario.potenciaMotor + " cv");
        System.out.println("Cor: " + g.carroUtilitario.cor);
    }
}
