import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Colaborador> colaboradores = new ArrayList<>();

        // Instanciando um colaborador de cada tipo (requisito)
        FuncionarioCLT clt = new FuncionarioCLT("Carlos Silva", "111.222.333-44", "CLT001", 5000.0, 800.0, "senha123");
        FuncionarioPJ pj = new FuncionarioPJ("Ana Souza", "555.666.777-88", "PJ001", 9000.0, "12.345.678/0001-90", "pjSenha");
        Estagiario estagiario = new Estagiario("Lucas Lima", "999.888.777-66", "EST001", 1500.0, 200.0, "estagio123");
        Aprendiz aprendiz = new Aprendiz("Beatriz Rocha", "444.333.222-11", "APR001", 12.50, 80);
        Consultor consultor = new Consultor("Roberto Costa", "000.111.222-33", "CNS001", 150.0, 40); // Desafio Extra

        colaboradores.add(clt);
        colaboradores.add(pj);
        colaboradores.add(estagiario);
        colaboradores.add(aprendiz);
        colaboradores.add(consultor);

        System.out.println("=== SISTEMA DE GERENCIAMENTO DE COLABORADORES ===");

        for (Colaborador c : colaboradores) {
            c.exibirInformacoes();

            // Verificação de capacidade: Acesso aos Sistemas
            if (c instanceof Acessivel) {
                Acessivel acessavel = (Acessivel) c;
                acessavel.autenticar("senha123");
                acessavel.acessarSistemaInterno();
            } else {
                System.out.println("-> " + c.getNome() + " NÃO possui acesso aos sistemas internos.");
            }

            // Verificação de capacidade: Trabalho Remoto
            if (c instanceof TrabalhavelRemoto) {
                TrabalhavelRemoto remoto = (TrabalhavelRemoto) c;
                remoto.iniciarJornadaRemota();
            } else {
                System.out.println("-> " + c.getNome() + " NÃO possui autorização para trabalho remoto.");
            }
        }
    }
}