public abstract class Conta_Poupança {

    public Conta_Poupança(String numero, String agencia, String titular, double saldo) {

    }

    public abstract double calcularTarifaMensal();

    public static class ContaPoupanca extends Conta_Poupança {

        public ContaPoupanca(String numero, String agencia, String titular, double saldo) {
            super(numero, agencia, titular, saldo);
        }

        @Override
        public double calcularTarifaMensal() {
            return 0.0;
        }

        public void exibirSaldo() {
        }

        public void depositar(double v) {
        }

        public void sacar(double v) {
        }
    }

}
