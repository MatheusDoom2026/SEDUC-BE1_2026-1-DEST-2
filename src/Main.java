public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Ana", 3000);
        funcionario.aumentarSalario(10); // Aumento de 10% (deve ir para R$ 3300.00)
        funcionario.exibirDados();
    }
}
