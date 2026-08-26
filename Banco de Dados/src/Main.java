void main (){

     abstract class Conta {
        private String numero;
        private String agencia;
        private String titular;
        protected double saldo;

        public Conta(String numero, String agencia, String titular, double saldo) {
            this.numero = numero;
            this.agencia = agencia;
            this.titular = titular;
            this.saldo = saldo;
        }

        public void depositar(double valor) {
            if (valor > 0) {
                saldo += valor;
                System.out.println("Depósito de R$ " + valor + " realizado. Novo saldo: R$ " + saldo);
            } else {
                System.out.println("Valor de depósito inválido.");
            }
        }

        public boolean sacar(double valor) {
            if (valor > 0 && saldo >= valor) {
                saldo -= valor;
                System.out.println("Saque de R$ " + valor + " realizado. Novo saldo: R$ " + saldo);
                return true;
            } else {
                System.out.println("Saldo insuficiente ou valor inválido para saque.");
                return false;
            }
        }

        public void exibirSaldo() {
            System.out.println("Titular: " + titular + " | Saldo Atual: R$ " + saldo);
        }

        public abstract double calcularTarifaMensal();

        public String getTitular() {
            return titular;
        }
    }

}