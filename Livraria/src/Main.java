public class Livro {

    public String nome;
    public String editora;
    public String autor;
    public String uso;

    public Livro(String nome, String Editora, String autor, String uso) {
        this.nome = nome;
        this.editora = editora;
        this.autor = autor;
        this.uso = this.uso;
    }
}

void main() {

    IO.println("======= Livraria =======");
    String nome = IO.readln("Nome do Livro: ");
    String editora = IO.readln("Editora: ");
    String autor = IO.readln("Autor: ");
    String uso = IO.readln("Uso: ");

    Livro livro = new Livro(nome, editora, autor, uso);

    IO.println();

}