public abstract class Conta_Corrente {

    public Conta_Corrente(String numero, String agencia, String titular, double saldo) {

    }

    public abstract double calcularTarifaMensal();

    public static class ContaCorrente extends Conta_Corrente {

        public ContaCorrente(String numero, String agencia, String titular, double saldo) {
            super(numero, agencia, titular, saldo);
        }

        @Override
        public double calcularTarifaMensal() {
            return 12.00;
        }

        public void exibirSaldo() {
        }

        public void sacar(double v) {
        }

        public void depositar(double v) {
        }
    }
}
