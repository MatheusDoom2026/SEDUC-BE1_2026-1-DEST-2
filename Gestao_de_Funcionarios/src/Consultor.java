public class Consultor extends Colaborador implements TrabalhavelRemoto {
    private int horasConsultoria;
    private double valorHora;

    public Consultor(String nome, String cpf, String matricula, double valorHora, int horasConsultoria) {
        super(nome, cpf, matricula, 0);
        this.valorHora = valorHora;
        this.horasConsultoria = horasConsultoria;
    }

    @Override
    public double calcularRemuneracao() {
        return valorHora * horasConsultoria;
    }

    @Override
    public void iniciarJornadaRemota() {
        System.out.println(getNome() + " iniciou sessão de consultoria técnica remota.");
    }
}