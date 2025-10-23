package objetos;

public class Musica {
    private String titulo;
    private int duracao;

    public Musica(String titulo, int duracao) {
        if (titulo == null || titulo.isEmpty()) {
            throw new IllegalArgumentException("O titulo nao pode ser vazio nem nulo");
        }
        if (duracao <= 0) {
            throw new IllegalArgumentException("A duracao nao pode ser negativa nem zero");
        }
        this.titulo = titulo;
        this.duracao = duracao;
    }
    public void ajustarMusica() {
        System.out.printf("Titulo: %s | Duracao: %d:%02d\n", titulo, duracao / 60, duracao % 60);
    }
    public int getDuracao() {
        return duracao;
    }
    public String getTitulo() {
        return titulo;
    }
}