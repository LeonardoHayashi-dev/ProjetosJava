package Model;

public class Filmes {

    private String titulo;
    private String genero;
    private double notaMedia;

    // Construtor
    public Filmes(String titulo, String genero, double notaMedia) {
        this.titulo = titulo;
        this.genero = genero;
        this.notaMedia = notaMedia;
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public void mostrarFilme() {
        System.out.println("Título: " + titulo);
        System.out.println("Gênero: " + genero);
        System.out.println("Nota média: " + notaMedia);
        System.out.println("----------------------");
    }
}
