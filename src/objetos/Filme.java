package objetos;

public class Filme {
        private String titulo;
        private double avaliacao;

        public Filme(String titulo, double avaliacao) {
            setTitulo(titulo);
            setAvaliacao(avaliacao);
        }

        public Filme() {}

        public void setTitulo(String titulo) {
            if (titulo != null && !titulo.equals("")) {
                this.titulo = titulo;
            }
        }

        public void setAvaliacao(double avaliacao) {
            if (avaliacao >= 0 && avaliacao <= 5) {
                this.avaliacao = avaliacao;
            }
        }

        public void exibir() {
            System.out.println("Filme: " + titulo + " | Avaliação: " + avaliacao + " estrelas");
        }
    }

