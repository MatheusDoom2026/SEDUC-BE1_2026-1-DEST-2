void main() {

    IO.println("======= Cadastre a sua música =======");
            String nome = IO.readln("Nome: ");
            int duracao = Integer.parseInt(IO.readln("Duração: "));
            String autor = IO.readln("Cantor: ");

            Música musica = new Música(nome, duracao, autor);

            IO.println(musica);

}