import enums.Gênero;

import java.time.LocalDate;

public class Filme {
    public int id;
    public String nome;
    public String duração;
    public Gênero Gênero_do_Filme;
    public String idioma;
    public LocalDate Data_de_Lancamento;
   

//Constructor without arguments

public Filme (){

}



//Constructor with arguments

    public Filme(int id, String nome, String duração, Gênero gênero_do_Filme, String idioma, LocalDate datNasc, String email, String telefone, String senha) {
        this.id = id;
        this.nome = nome;
        this.duração = duração;
        Gênero_do_Filme = gênero_do_Filme;
        this.idioma = idioma;
        this.Data_de_Lancamento = datNasc;
       
    }

    public void getDtestreia() {
    }

    public void setDuracao(int i) {
    }

    public void setData_de_Lancamento(LocalDate of) {
    }

    public Object getData_de_Lançamento() {
        return null;
    }
}
