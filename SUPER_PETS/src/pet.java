public class Super_Pets{

    private Object nivel_de_felicidade = null;
    public String nome;
    public String poderes;
    public String espécie;

    public Super_Pets (String nome, String nivel_de_felicidade , String poderes, String espécie) {
        this.nome = nome;
        this.nome = nome;
        this.nome = nome;
        this.poderes = poderes;
        this.espécie = espécie;
        this.nivel_de_felicidade = nivel_de_felicidade;

    }
}

void main() {

    IO.println("======= SUPER PET SHOP =======");
    String nome = IO.readln("Nome do Pet: ");
    nome = IO.readln("Nome do Pet: ");
    nome = IO.readln("Nome do Pet: ");
    String poderes = IO.readln("Poderes: ");
    String nivel_de_felicidade = IO.readln("Nivel de Felicidade: ");
    String espécie = IO.readln("Espécie: ");

    Super_Pets superPets = new Super_Pets(nome, poderes, nivel_de_felicidade, espécie );

    IO.println();

}

