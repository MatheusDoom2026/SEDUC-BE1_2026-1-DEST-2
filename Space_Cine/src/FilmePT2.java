import enums.Gênero_do_Filme;

import java.time.LocalDate;

public class FilmePT2 {



    public class Filme {

        private int id;
        private String titulo;
        private Gênero_do_Filme gênero_do_Filme;
        private double duracao;
        private String idioma;
        private String sinopse;
        private LocalDate dtestreia;

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public double getDuracao() {
            return duracao;
        }

        public void setDuracao(double duracao) {
            if (duracao < 0) {
                IO.println("A duração não pode ser negativa");
            } else {
                this.duracao = duracao;
            }
        }

        public LocalDate getDtestreia() {
            return dtestreia;
        }

        public void setDtestreia(LocalDate dtestreia) {
            this.dtestreia = dtestreia;
        }

        public Filme() {
        }

        public Filme(int id, String titulo, Gênero_do_Filme gênero_do_Filme, double duracao, String idioma, String sinopse, LocalDate dtestreia) {
            this.id = id;
            this.titulo = titulo;
            this.gênero_do_Filme = gênero_do_Filme;
            this.duracao = duracao;
            this.idioma = idioma;
            this.sinopse = sinopse;
            this.dtestreia = dtestreia;
        }

    }
}
