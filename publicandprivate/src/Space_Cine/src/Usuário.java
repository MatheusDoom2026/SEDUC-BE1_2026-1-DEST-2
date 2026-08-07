import java.time.LocalDate;

public class Usuário {

    public int id;
    public String nome;
    public String cpf;
    public Gênero genero;
    public String nomeSocial;
    public LocalDate datNasc;
    public String email;
    public String telefone;
    public String senha;

    public Usuário(int id, String nome, String cpf, Gênero genero, String nomeSocial, LocalDate datNasc, String email, String telefone, String senha) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.genero = genero;
        this.nomeSocial = nomeSocial;
        this.datNasc = datNasc;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
    }
}
