package Service;

import Model.Filmes;
import java.util.ArrayList;
import java.util.Random;

public class FilmesService {

    private ArrayList<Filmes> filmes = new ArrayList<>();

    // Cadastro de filme
    public void cadastrarFilme(Filmes filme) {
        filmes.add(filme);
    }

    // Consulta de filmes
    public void listarFilmes() {
        for (Filmes f : filmes) {
            f.mostrarFilme();
        }
    }

    // Sorteio de filme
    public Filmes sortearFilme() {
        if (filmes.isEmpty()) {
            return null;
        }
        Random r = new Random();
        return filmes.get(r.nextInt(filmes.size()));
    }
}
