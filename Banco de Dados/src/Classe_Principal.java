class main {
    public static void main(String[] args) {
        Conta_Corrente.ContaCorrente cc = new Conta_Corrente.ContaCorrente("1001", "0001", "Maria Silva", 1000.0);
        Conta_Poupança.ContaPoupanca cp = new Conta_Poupança.ContaPoupanca("2001", "0001", "João Souza", 500.0);
        Conta_Pessoa_Juridica.ContaPessoaJuridica pj = new Conta_Pessoa_Juridica.ContaPessoaJuridica("3001", "0001", "Empresa XYZ Ltda", 5000.0);

        System.out.println("--- OPERAÇÕES CONTA CORRENTE ---");
        cc.exibirSaldo();
        cc.depositar(200.0);
        cc.sacar(150.0);
        System.out.println("Tarifa Mensal: R$ " + cc.calcularTarifaMensal());

        System.out.println("\n--- OPERAÇÕES CONTA POUPANÇA ---");
        cp.exibirSaldo();
        cp.depositar(100.0);
        cp.sacar(50.0);
        System.out.println("Tarifa Mensal: R$ " + cp.calcularTarifaMensal());

        System.out.println("\n--- OPERAÇÕES CONTA PJ ---");
        pj.exibirSaldo();
        pj.depositar(1000.0);
        pj.sacar(200.0); // Desconta R$ 200,00 + R$ 1,50 de taxa
        System.out.println("Tarifa Mensal: R$ " + pj.calcularTarifaMensal());
    }
}