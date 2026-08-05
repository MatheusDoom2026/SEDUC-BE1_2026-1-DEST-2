public class Música {

    public String nome;
    public int duração;
    public String compositor;
    public int volume;

    public Música(String nome, int duração, String compositor, int volume) {
        this.nome = nome;
        this.duração = duração;
        this.compositor = compositor;
        this.volume = volume;
    }
}

void main() {

    IO.println("======= Cadastre a sua música =======");
    String nome = IO.readln("Nome da Música" + ": ");
    int duracao = Integer.parseInt(IO.readln("Duração: "));
    String compositor = IO.readln("Compositor: ");
    int volume = Integer.parseInt(IO.readln("Volume: "));


    Música musica = new Música(nome, duracao, compositor, volume);

    IO.println(musica);

}