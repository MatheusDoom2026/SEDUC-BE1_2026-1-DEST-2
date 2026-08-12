import java.sql.Blob;
import java.time.LocalDate;

public class Feedbacks {

    private int id;
    private String usuario;
    private double nota;
    private Blob feedbacks;
    private LocalDate dt;

    public String getUsuario(){
        return usuario;
    }

    public void setUsuario(String usuario){
        this.usuario = usuario;
    }

    public  Blob getAvaliacao(){
        return feedbacks;
    }

    public void setAvaliacao(Blob avaliacao){
        this.feedbacks = avaliacao;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDt() {
        return dt;
    }

    public void setDt(LocalDate dt) {
        this.dt = dt;
    }



    public Feedbacks() {
    }

    public Feedbacks(String usuario, double nota, Blob feedbacks, LocalDate dt) {
        this.usuario = usuario;
        this.nota = nota;
        this.feedbacks = feedbacks;
        this.dt = dt;
    }

    @Override
    public String toString() {
        return "Feedbacks{" +
                "Usuário='" + usuario + '\'' +
                ", Nota=" + nota +
                ", Feedbacks='" + feedbacks + '\'' +
                ", Data=" + dt +
                '}';
    }
}