package ProjetoVeiculos;

public class CadastroVeiculos {
    public static void main(String[] args) {

        // Primeiro veículo
        Veiculos v1 = new Veiculos();
        v1.setMarca("Toyota");
        v1.setModelo("Corolla");
        v1.setAno(2020);

        // Segundo veículo
        Veiculos v2 = new Veiculos();
        v2.setMarca("Honda");
        v2.setModelo("Civic");
        v2.setAno(2022);

        // Exibindo os dados
        v1.mostrarVeiculo();
        v2.mostrarVeiculo();
    }
}
