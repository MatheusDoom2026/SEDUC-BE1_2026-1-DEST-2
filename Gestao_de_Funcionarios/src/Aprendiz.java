public class Aprendiz extends Colaborador {
    private int horasTrabalhadas;
    private double valorHora;

    public Aprendiz(String nome, String cpf, String matricula, double valorHora, int horasTrabalhadas) {
        super(nome, cpf, matricula, 0); // Remuneração base calculada dinamicamente
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularRemuneracao() {
        return valorHora * horasTrabalhadas;
    }
}