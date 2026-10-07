import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// Classe Pessoa com os atributos solicitados
class Pessoa {
    private int id;
    private String nome;
    private int idade;

    public Pessoa(int id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + nome + " | Idade: " + idade;
    }
}

public class Main {
    private static final int TAMANHO_MAXIMO_CACHE = 10;

    public static void main(String[] args) {
        // 1. Banco de dados mockado (mínimo 5 registros)
        List<Pessoa> banco = new ArrayList<>();
        banco.add(new Pessoa(1, "Silvio Santos", 93));
        banco.add(new Pessoa(2, "Eduardo Dogão", 56));
        banco.add(new Pessoa(3, "Faustão", 76));
        banco.add(new Pessoa(4, "Rodrigo Faro ", 52));
        banco.add(new Pessoa(5, "Pernalonga", 87));
        banco.add(new Pessoa(6, "Pernacurta", 58));
        banco.add(new Pessoa(7, "Albolino", 175));
        banco.add(new Pessoa(8, "Doidolino", 145));
        banco.add(new Pessoa(9, "Tontolino", 110));
        banco.add(new Pessoa(10, "Patolino Sheldon", 88));
        banco.add(new Pessoa(11, "Zezinho", 67));

        // 2. Cache com suporte ao Desafio (Remoção do mais antigo quando atinge 10 itens)
        // Sobrescrevemos removeEldestEntry para que o limite de 10 seja mantido automaticamente
        Map<Integer, Pessoa> cache = new LinkedHashMap<Integer, Pessoa>(16, 0.75f, false) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Pessoa> eldest) {
                return size() > TAMANHO_MAXIMO_CACHE;
            }
        };

        Scanner scanner = new Scanner(System.in);
        String opcao;

        do {
            System.out.print("\nDigite o ID da pessoa que deseja buscar (ou 'sair' para encerrar): ");
            opcao = scanner.nextLine();

            if (opcao.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                int idBuscado = Integer.parseInt(opcao);

                // Verificação 1: Buscar na cache
                if (cache.containsKey(idBuscado)) {
                    Pessoa pessoaCache = cache.get(idBuscado);
                    System.out.println("Pessoa encontrada no cache: " + pessoaCache);
                } else {
                    // Verificação 2: Buscar no banco de dados
                    Pessoa pessoaBanco = buscarNoBanco(banco, idBuscado);

                    if (pessoaBanco != null) {
                        // Adiciona ao cache (se o cache tiver 10 itens, o mais antigo é removido automaticamente)
                        cache.put(pessoaBanco.getId(), pessoaBanco);
                        System.out.println("Pessoa buscada no banco e adicionada ao cache: " + pessoaBanco);
                    } else {
                        System.out.println("Pessoa com ID " + idBuscado + " não foi encontrada no banco de dados.");
                    }
                }

            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número de ID válido.");
            }

        } while (true);

        System.out.println("Programa encerrado.");
        scanner.close();
    }

    // Função auxiliar para procurar a pessoa na lista que representa o banco
    private static Pessoa buscarNoBanco(List<Pessoa> banco, int id) {
        for (Pessoa p : banco) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
}