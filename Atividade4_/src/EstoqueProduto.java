public class EstoqueProduto {
    public static void main(String[] args) {
        String produtos[] = new String[5];

        produtos[0] = "Arroz";
        produtos[1] = "Feijão";
        produtos[2] = "Macarrão";
        produtos[3] = "Açucar";
        produtos[4] = "Café";

        System.out.println("Lista de Produtos em estoque");

        for (String produto : produtos) {
            System.out.println("- " + produto);
        }


    }
}
