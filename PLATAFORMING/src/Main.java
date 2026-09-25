import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// ==========================================
// 1. INTERFACES
// ==========================================

/**
 * Interface que estabelece o contrato de combate para todos os participantes do jogo.
 */
interface Combatente {
    void atacar(Combatente alvo);
    void usarHabilidadeEspecial(Combatente alvo);
    void receberDano(int dano);
    boolean estaVivo();
    String getNome();
}

/**
 * Interface para itens que podem ser consumidos ou aplicados no herói.
 */
interface Usavel {
    void aplicarEfeito(Heroi heroi);
    String getNome();
}

// ==========================================
// 2. CLASSES ABSTRATAS E BASE
// ==========================================

/**
 * Classe Abstrata base para qualquer entidade do jogo.
 * Implementa a Abstração e Encapsulamento dos status essenciais.
 */
abstract class Personagem implements Combatente {
    protected String nome;
    protected int vidaMax;
    protected int vidaAtual;
    protected int ataqueBase;
    protected int energia;

    public Personagem(String nome, int vidaMax, int ataqueBase, int energia) {
        this.nome = nome;
        this.vidaMax = vidaMax;
        this.vidaAtual = vidaMax;
        this.ataqueBase = ataqueBase;
        this.energia = energia;
    }

    @Override
    public boolean estaVivo() {
        return this.vidaAtual > 0;
    }

    @Override
    public void receberDano(int dano) {
        this.vidaAtual -= dano;
        if (this.vidaAtual < 0) this.vidaAtual = 0;
        System.out.printf("💥 [%s] recebeu %d de dano! Vida atual: %d/%d\n",
                this.nome, dano, this.vidaAtual, this.vidaMax);
    }

    // Getters encapsulados
    public String getNome() { return nome; }
    public int getVidaAtual() { return vidaAtual; }
    public int getVidaMax() { return vidaMax; }
    public int getEnergia() { return energia; }

    public void recuperarEnergia(int qtd) {
        this.energia += qtd;
        System.out.printf("⚡ [%s] recuperou %d de Energia! (Atual: %d)\n", this.nome, qtd, this.energia);
    }
}

/**
 * Subclasse abstrata para Heróis, adicionando atributos como Anéis e Escudo.
 */
abstract class Heroi extends Personagem {
    protected int aneis;
    protected boolean temEscudo;

    public Heroi(String nome, int vida, int ataque, int energia) {
        super(nome, vida, ataque, energia);
        this.aneis = 10; // Começa com 10 anéis de proteção
        this.temEscudo = false;
    }

    public void coletarAneis(int qtd) {
        this.aneis += qtd;
        System.out.printf("💍 [%s] coletou %d Anéis! Total: %d\n", this.nome, qtd, this.aneis);
    }

    public void ativarEscudo() {
        this.temEscudo = true;
        System.out.printf("🛡️ [%s] ativou um Escudo de Proteção!\n", this.nome);
    }

    public int getAneis() { return aneis; }

    // Sobrescrita Polimórfica da regra de dano clássica dos jogos do Sonic
    @Override
    public void receberDano(int dano) {
        if (this.temEscudo) {
            this.temEscudo = false;
            System.out.printf("🛡️ O Escudo de [%s] absorveu todo o dano e se quebrou!\n", this.nome);
        } else if (this.aneis > 0) {
            System.out.printf("💍 [%s] foi atingido e PERDEU TODOS OS SEUS %d ANÉIS! Mas evitou o dano direto na vida.\n",
                    this.nome, this.aneis);
            this.aneis = 0;
        } else {
            super.receberDano(dano);
        }
    }
}

// ==========================================
// 3. HERÓIS CONCRETOS (HERANÇA E POLIMORFISMO)
// ==========================================

class Sonic extends Heroi {
    public Sonic() {
        super("Sonic the Hedgehog", 100, 25, 50);
    }

    @Override
    public void atacar(Combatente alvo) {
        System.out.println("🌀 Sonic avança com um Homing Attack superveloz!");
        alvo.receberDano(this.ataqueBase);
        this.recuperarEnergia(5);
    }

    @Override
    public void usarHabilidadeEspecial(Combatente alvo) {
        int custo = 20;
        if (this.energia >= custo) {
            this.energia -= custo;
            System.out.println("🔥 Sonic carrega o SPIN DASH MAXIMO e estraçalha o inimigo!");
            alvo.receberDano(this.ataqueBase + 30);
        } else {
            System.out.println("❌ Energia insuficiente para Spin Dash! Realizando ataque normal.");
            atacar(alvo);
        }
    }
}

class Tails extends Heroi {
    public Tails() {
        super("Miles 'Tails' Prower", 85, 20, 70);
    }

    @Override
    public void atacar(Combatente alvo) {
        System.out.println("🛸 Tails gira suas caldas e ataca voando!");
        alvo.receberDano(this.ataqueBase);
        this.recuperarEnergia(8);
    }

    @Override
    public void usarHabilidadeEspecial(Combatente alvo) {
        int custo = 25;
        if (this.energia >= custo) {
            this.energia -= custo;
            System.out.println("🛠️ Tails dispara um Blaster Tecnológico e se repara!");
            alvo.receberDano(this.ataqueBase + 15);
            this.vidaAtual = Math.min(this.vidaMax, this.vidaAtual + 20);
            System.out.printf("💖 Tails curou 20 HP! Vida atual: %d/%d\n", this.vidaAtual, this.vidaMax);
        } else {
            System.out.println("❌ Energia insuficiente! Realizando ataque normal.");
            atacar(alvo);
        }
    }
}

class Knuckles extends Heroi {
    public Knuckles() {
        super("Knuckles the Echidna", 120, 30, 40);
    }

    @Override
    public void atacar(Combatente alvo) {
        System.out.println("👊 Knuckles acerta um soco devastador de direita!");
        alvo.receberDano(this.ataqueBase);
        this.recuperarEnergia(4);
    }

    @Override
    public void usarHabilidadeEspecial(Combatente alvo) {
        int custo = 20;
        if (this.energia >= custo) {
            this.energia -= custo;
            System.out.println("🌋 Knuckles causa um Tremor de Terra socando o chão!");
            alvo.receberDano(this.ataqueBase + 25);
        } else {
            System.out.println("❌ Energia insuficiente! Realizando ataque normal.");
            atacar(alvo);
        }
    }
}

// ==========================================
// 4. INIMIGOS E CHEFÃO
// ==========================================

abstract class Inimigo extends Personagem {
    public Inimigo(String nome, int vida, int ataque, int energia) {
        super(nome, vida, ataque, energia);
    }
}

class Motobug extends Inimigo {
    public Motobug() {
        super("Badnik Motobug", 40, 15, 10);
    }

    @Override
    public void atacar(Combatente alvo) {
        System.out.println("🤖 Motobug acelera suas rodas de ferro contra o herói!");
        alvo.receberDano(this.ataqueBase);
    }

    @Override
    public void usarHabilidadeEspecial(Combatente alvo) {
        System.out.println("🤖 Motobug solta uma fumaça tóxica!");
        alvo.receberDano(this.ataqueBase + 10);
    }
}

class DrEggman extends Inimigo {
    private boolean escudoNaveAtivo;

    public DrEggman() {
        super("Dr. Eggman (Egg Mobile Boss)", 150, 25, 100);
        this.escudoNaveAtivo = true;
    }

    @Override
    public void atacar(Combatente alvo) {
        System.out.println("🚀 Dr. Eggman dispara mísseis perseguidores de sua nave!");
        alvo.receberDano(this.ataqueBase);
    }

    @Override
    public void usarHabilidadeEspecial(Combatente alvo) {
        System.out.println("⚡ Dr. Eggman ativa o RAIO LASER DA DEATHEGG!");
        alvo.receberDano(this.ataqueBase + 20);
    }

    @Override
    public void receberDano(int dano) {
        if (this.escudoNaveAtivo && this.vidaAtual < 100) {
            this.escudoNaveAtivo = false;
            System.out.println("💥 O Escudo Primário da nave do Dr. Eggman FOI DESTRUÍDO!");
        }
        super.receberDano(dano);
    }
}

// ==========================================
// 5. ITENS E INVENTÁRIO (AGREGAÇÃO E COMPOSIÇÃO)
// ==========================================

class Anel implements Usavel {
    private int quantidade;

    public Anel(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public void aplicarEfeito(Heroi heroi) {
        heroi.coletarAneis(this.quantidade);
    }

    @Override
    public String getNome() {
        return "Caixa de " + quantidade + " Anéis";
    }
}

class EscudoProtecao implements Usavel {
    @Override
    public void aplicarEfeito(Heroi heroi) {
        heroi.ativarEscudo();
    }

    @Override
    public String getNome() {
        return "Escudo Elemental";
    }
}

/**
 * Classe que gerencia a coleção de itens do herói (Agregação).
 */
class Inventario {
    private List<Usavel> itens;

    public Inventario() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Usavel item) {
        itens.add(item);
        System.out.println("📦 Item adicionado ao inventário: " + item.getNome());
    }

    public void exibirItens() {
        if (itens.isEmpty()) {
            System.out.println("📦 Inventário está vazio.");
            return;
        }
        System.out.println("=== 🎒 INVENTÁRIO ===");
        for (int i = 0; i < itens.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + itens.get(i).getNome());
        }
    }

    public boolean usarItem(int indice, Heroi heroi) {
        if (indice >= 0 && indice < itens.size()) {
            Usavel item = itens.remove(indice);
            System.out.println("✨ Usando item: " + item.getNome());
            item.aplicarEfeito(heroi);
            return true;
        }
        System.out.println("❌ Opção de item inválida!");
        return false;
    }

    public boolean temItens() {
        return !itens.isEmpty();
    }
}

// ==========================================
// 6. ESTRUTURA E LOOP DAS FASES (GERENCIAMENTO)
// ==========================================

class Fase {
    private String nomeFase;
    private Inimigo inimigo;

    public Fase(String nomeFase, Inimigo inimigo) {
        this.nomeFase = nomeFase;
        this.inimigo = inimigo;
    }

    public boolean executarFase(Heroi heroi, Inventario inventario, Scanner scanner) {
        System.out.println("\n==========================================");
        System.out.println("🌐 ENTANDO NA FASE: " + nomeFase.toUpperCase());
        System.out.println("==========================================");

        while (heroi.estaVivo() && inimigo.estaVivo()) {
            System.out.println("\n------------------------------------------");
            System.out.printf("👤 HERÓI: %s | HP: %d/%d | Anéis: %d | Energia: %d\n",
                    heroi.getNome(), heroi.getVidaAtual(), heroi.getVidaMax(), heroi.getAneis(), heroi.getEnergia());
            System.out.printf("👾 INIMIGO: %s | HP: %d/%d\n",
                    inimigo.getNome(), inimigo.getVidaAtual(), inimigo.getVidaMax());
            System.out.println("------------------------------------------");
            System.out.println("Escolha sua Ação:");
            System.out.println("[1] Ataque Básico");
            System.out.println("[2] Habilidade Especial");
            System.out.println("[3] Abrir Inventário de Itens");
            System.out.print("> ");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    heroi.atacar(inimigo);
                    break;
                case 2:
                    heroi.usarHabilidadeEspecial(inimigo);
                    break;
                case 3:
                    if (inventario.temItens()) {
                        inventario.exibirItens();
                        System.out.print("Escolha o número do item para usar: ");
                        int itemChoice = scanner.nextInt() - 1;
                        if (!inventario.usarItem(itemChoice, heroi)) {
                            continue; // Não perde o turno se digitar item inválido
                        }
                    } else {
                        System.out.println("⚠️ Você não tem itens no inventário!");
                        continue;
                    }
                    break;
                default:
                    System.out.println("❌ Opção inválida! Perdeu o turno.");
            }

            // Turno do Inimigo (se ainda estiver vivo)
            if (inimigo.estaVivo()) {
                System.out.println("\n--- 🤖 Turno do Inimigo ---");
                if (Math.random() > 0.7) {
                    inimigo.usarHabilidadeEspecial(heroi);
                } else {
                    inimigo.atacar(heroi);
                }
            }
        }

        if (heroi.estaVivo()) {
            System.out.println("\n🎉 VITORIA! Você superou a fase " + nomeFase + "!");
            return true;
        } else {
            System.out.println("\n☠️ GAME OVER! " + heroi.getNome() + " foi derrotado.");
            return false;
        }
    }
}

// ==========================================
// 7. EXECUÇÃO PRINCIPAL (MAIN)
// ==========================================

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("**************************************************");
        System.out.println("   🌀 SONIC: CHAOS EMERALD CHRONICLES (POO) 🌀    ");
        System.out.println("**************************************************");
        System.out.println("Selecione seu Herói:");
        System.out.println("[1] Sonic the Hedgehog (Rápido / Ataque Equilibrado)");
        System.out.println("[2] Miles 'Tails' Prower (Especialista / Cura & Suporte)");
        System.out.println("[3] Knuckles the Echidna (Tanque / Alta Vida & Dano)");
        System.out.print("> ");

        int escolhaHeroi = scanner.nextInt();
        Heroi heroi;

        switch (escolhaHeroi) {
            case 2:
                heroi = new Tails();
                break;
            case 3:
                heroi = new Knuckles();
                break;
            default:
                heroi = new Sonic();
                break;
        }

        System.out.println("\n✨ Você escolheu: " + heroi.getNome() + "!");

        // Inicializa Inventário e adiciona itens iniciais
        Inventario inventario = new Inventario();
        inventario.adicionarItem(new Anel(15));
        inventario.adicionarItem(new EscudoProtecao());

        // Criando a sequência de fases do jogo
        List<Fase> fases = new ArrayList<>();
        fases.add(new Fase("Green Hill Zone", new Motobug()));
        fases.add(new Fase("Death Egg Base (Boss Final)", new DrEggman()));

        boolean jogoCompleto = true;

        // Loop de progresso de Fases
        for (Fase fase : fases) {
            boolean venceu = fase.executarFase(heroi, inventario, scanner);
            if (!venceu) {
                jogoCompleto = false;
                break;
            }
            // Recompensa entre fases
            System.out.println("\n🎁 Recompensa de fase: Você encontrou mais Anéis no caminho!");
            heroi.coletarAneis(10);
        }

        System.out.println("\n==========================================");
        if (jogoCompleto) {
            System.out.println("🏆 PARABÉNS! VOCÊ DERROTOU DR. EGGMAN E SALVOU O MUNDO!");
            System.out.println("💎 Todas as Esmeraldas do Caos foram recuperadas com sucesso!");
        } else {
            System.out.println("💥 O Dr. Eggman conquistou o mundo... Tente novamente!");
        }
        System.out.println("==========================================");

        scanner.close();
    }
}