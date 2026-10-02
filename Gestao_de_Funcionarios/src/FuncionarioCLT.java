public class FuncionarioCLT extends Colaborador implements Acessivel, TrabalhavelRemoto {
    private double valorBeneficios;
    private String senhaAcesso;

    public FuncionarioCLT(String nome, String cpf, String matricula, double salarioBase, double valorBeneficios, String senhaAcesso) {
        super(nome, cpf, matricula, salarioBase);
        this.valorBeneficios = valorBeneficios;
        this.senhaAcesso = senhaAcesso;
    }

    @Override
    public double calcularRemuneracao() {
        return getRemuneracaoBase() + valorBeneficios;
    }

    @Override
    public void autenticar(String senha) {
        if (this.senhaAcesso.equals(senha)) {
            System.out.println(getNome() + " autenticado com sucesso no sistema.");
        } else {
            System.out.println("Falha na autenticação para " + getNome() + ": Senha incorreta.");
        }
    }

    @Override
    public void acessarSistemaInterno() {
        System.out.println(getNome() + " está acessando o sistema ERP da empresa.");
    }

    @Override
    public void iniciarJornadaRemota() {
        System.out.println(getNome() + " iniciou a jornada de trabalho via Home Office (CLT).");
    }
}