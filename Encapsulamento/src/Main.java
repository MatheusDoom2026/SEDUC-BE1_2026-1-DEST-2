public class Main {
    public static void main(String[] args) {
        System.out.println("=== TESTE DAS REGRAS DE NEGÓCIO ===");

        // Criando personagem
        Personagem heroi = new Personagem("Geralt");
        heroi.exibirFicha();

        // 1. Testando ataques sucessivos e esgotamento de energia
        System.out.println("\n--- Teste de Ataques e Energia ---");
        heroi.atacar(); // 80 energia
        heroi.atacar(); // 60 energia
        heroi.atacar(); // 40 energia
        heroi.atacar(); // 20 energia
        heroi.atacar(); // 0 energia
        heroi.atacar(); // Tentativa sem energia suficiente

        // 2. Testando descanso e limite máximo de energia (100)
        System.out.println("\n--- Teste de Descanso ---");
        heroi.descansar(); // 25 energia
        heroi.descansar(); // 50 energia
        heroi.descansar(); // 75 energia
        heroi.descansar(); // 100 energia
        heroi.descansar(); // Não deve passar de 100

        // 3. Testando danos recebidos e limite mínimo de vida (0)
        System.out.println("\n--- Teste de Dano e Limite de Vida ---");
        heroi.receberDano(40); // 60 vida
        heroi.receberDano(50); // 10 vida
        System.out.println("Status atual: " + heroi.getStatus()); // Deve imprimir "Vivo"

        heroi.receberDano(30); // Vida zerada (deve travar em 0)
        System.out.println("Status atual: " + heroi.getStatus()); // Deve imprimir "Derrotado"

        // 4. Testando ações após o personagem ser derrotado
        System.out.println("\n--- Teste de Ações após Derrota ---");
        heroi.atacar();
        heroi.descansar();
        heroi.receberDano(10);

        // Ficha final
        heroi.exibirFicha();
    }
}