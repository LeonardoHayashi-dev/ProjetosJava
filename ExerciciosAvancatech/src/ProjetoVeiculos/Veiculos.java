package ProjetoVeiculos;

public class Veiculos {

    // Atributos privados (encapsulamento)
    private String modelo;
    private String marca;
    private int ano;

    // Getter e Setter do modelo
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo; // uso do this
    }

    // Getter e Setter da marca
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca; // uso do this
    }

    // Getter e Setter do ano
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano; // uso do this
    }

    // Método para exibir os dados do veículo
    public void mostrarVeiculo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("--------------------");
    }
}

