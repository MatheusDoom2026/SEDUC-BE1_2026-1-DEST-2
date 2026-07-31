public class Música {

    public String nome;
    public int duração;
    public String autor;

    public Música(String nome, int duração, String autor) {
        this.nome = nome;
        this.duração = duração;
        this.autor = autor;
    }
}

void main() {

    IO.println("======= Cadastre a sua música =======");
    String nome = IO.readln("Nome: ");
    int duracao = Integer.parseInt(IO.readln("Duração: "));
    String autor = IO.readln("Cantor: ");

    Música musica = new Música(nome, duracao, autor);

    IO.println(musica);

}