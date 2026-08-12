public class Lanches {

    private int id;
    private String itens;
    private String tamanho;
    private double preco;
    private String brinde;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getBrinde() {
        return brinde;
    }

    public void setBrinde(String brinde) {
        this.brinde = brinde;
    }

    public String getItens() {
        return itens;
    }

    public void setItens(String itens) {
        this.itens = itens;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Lanches() {
    }

    public Lanches(String itens, String tamanho, double preco, String brinde) {
        this.itens = itens;
        this.tamanho = tamanho;
        this.preco = preco;
        this.brinde = brinde;
    }

    @Override
    public String toString() {
        return "Combo{" +
                "itens='" + itens + '\'' +
                ", tamanho='" + tamanho + '\'' +
                ", preco=" + preco +
                ", brinde='" + brinde + '\'' +
                '}';
    }
}