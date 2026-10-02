public class Estagiario extends Colaborador implements Acessivel {
    private double auxilioTransporte;
    private String senhaAcesso;

    public Estagiario(String nome, String cpf, String matricula, double bolsaAuxilio, double auxilioTransporte, String senhaAcesso) {
        super(nome, cpf, matricula, bolsaAuxilio);
        this.auxilioTransporte = auxilioTransporte;
        this.senhaAcesso = senhaAcesso;
    }

    @Override
    public double calcularRemuneracao() {
        return getRemuneracaoBase() + auxilioTransporte;
    }

    @Override
    public void autenticar(String senha) {
        if (this.senhaAcesso.equals(senha)) {
            System.out.println(getNome() + " (Estagiário) autenticado com sucesso.");
        } else {
            System.out.println("Senha incorreta para " + getNome());
        }
    }

    @Override
    public void acessarSistemaInterno() {
        System.out.println(getNome() + " acessando o sistema de treinamento e chamados.");
    }
}