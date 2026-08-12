public class Cartaz {

    public String titulo;
    public int classificacao;
    public int dtestreia;
    public double duracao;
    public String genero;

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public int getDtestreia() {
        return dtestreia;
    }

    public void setDtestreia(int dtestreia) {
        this.dtestreia = dtestreia;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Cartaz() {
    }

    public Cartaz(String titulo, int classificacao, int dtestreia, double duracao, String genero) {
        this.titulo = titulo;
        this.classificacao = classificacao;
        this.dtestreia = dtestreia;
        this.duracao = duracao;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Cartaz{" +
                "titulo='" + titulo + '\'' +
                ", classificacao=" + classificacao +
                ", dtestreia=" + dtestreia +
                ", duracao=" + duracao +
                ", genero='" + genero + '\'' +
                '}';
    }
}