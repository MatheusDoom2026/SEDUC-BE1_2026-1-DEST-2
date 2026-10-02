public class FuncionarioPJ extends Colaborador implements Acessivel, TrabalhavelRemoto {
    private String cnpj;
    private String senhaAcesso;

    public FuncionarioPJ(String nome, String cpf, String matricula, double valorContrato, String cnpj, String senhaAcesso) {
        super(nome, cpf, matricula, valorContrato);
        this.cnpj = cnpj;
        this.senhaAcesso = senhaAcesso;
    }

    @Override
    public double calcularRemuneracao() {
        return getRemuneracaoBase(); // Valor bruto fixo do contrato
    }

    @Override
    public void autenticar(String senha) {
        if (this.senhaAcesso.equals(senha)) {
            System.out.println(getNome() + " (PJ - " + cnpj + ") autenticado no sistema.");
        } else {
            System.out.println("Acesso negado para " + getNome());
        }
    }

    @Override
    public void acessarSistemaInterno() {
        System.out.println(getNome() + " acessando o ambiente de desenvolvimento PJ.");
    }

    @Override
    public void iniciarJornadaRemota() {
        System.out.println(getNome() + " iniciou suas entregas remotas prestadas via PJ.");
    }
}