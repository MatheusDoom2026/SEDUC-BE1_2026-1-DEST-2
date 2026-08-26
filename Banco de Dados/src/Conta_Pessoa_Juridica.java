public abstract class Conta_Pessoa_Juridica {

    public Conta_Pessoa_Juridica(String numero, String agencia, String titular, double saldo) {

    }

    public abstract boolean sacar(double valor);

    public abstract double calcularTarifaMensal();

    public static class ContaPessoaJuridica extends Conta_Pessoa_Juridica {
        private static final double TAXA_SAQUE = 1.50;

        public ContaPessoaJuridica(String numero, String agencia, String titular, double saldo) {
            super(numero, agencia, titular, saldo);
        }

        @Override
        public boolean sacar(double valor) {
            double valorTotal = valor + TAXA_SAQUE;
            double saldo = 0;
            if (valor > 0 && saldo >= valorTotal) {
                saldo -= valorTotal;
                System.out.println("Saque PJ de R$ " + valor + " (Taxa: R$ " + TAXA_SAQUE + "). Novo saldo: R$ " + saldo);
                return true;
            } else {
                System.out.println("Saldo insuficiente para saque de R$ " + valor + " + taxa de R$ " + TAXA_SAQUE);
                return false;
            }
        }

        @Override
        public double calcularTarifaMensal() {
            return 20.00;
        }

        public void exibirSaldo() {
        }

        public void depositar(double v) {
        }
    }

}
