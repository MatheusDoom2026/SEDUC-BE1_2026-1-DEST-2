public class Salas {

    private int id;
    private int capacidade;
    private String numAssento;
    private String tiposala;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getNumAssento() {
        return numAssento;
    }

    public void setNumAssento(String numAssento) {
        this.numAssento = numAssento;
    }

    public String getTiposala() {
        return tiposala;
    }

    public void setTiposala(String tiposala) {
        this.tiposala = tiposala;
    }

    public Salas() {
    }

    public Salas(int id, int capacidade, String numAssento, String tiposala) {
        this.id = id;
        this.capacidade = capacidade;
        this.numAssento = numAssento;
        this.tiposala = tiposala;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "id=" + id +
                ", capacidade=" + capacidade +
                ", numAssento='" + numAssento + '\'' +
                ", tiposala='" + tiposala + '\'' +
                '}';
    }
}