package app;

import Model.Filmes;
import Service.FilmesService;

public class Main {

    public static void main(String[] args) {

        FilmesService service = new FilmesService();

        // Cadastro de filmes
        service.cadastrarFilme(new Filmes("Interestelar", "Ficção", 8.6));
        service.cadastrarFilme(new Filmes("Clube da Luta", "Drama", 8.8));
        service.cadastrarFilme(new Filmes("Matrix", "Ação", 8.7));

        // Consulta
        System.out.println("=== Filmes Cadastrados ===");
        service.listarFilmes();

        // Sorteio
        System.out.println("=== Filme Sorteado ===");
        Filmes sorteado = service.sortearFilme();
        if (sorteado != null) {
            sorteado.mostrarFilme();
        }
    }
}
