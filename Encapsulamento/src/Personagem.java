public class Personagem {
    private String nome;
    private int vida;
    private int energia;
    private int nivel;

    // Construtor
    public Personagem(String nome) {
        this.nome = nome;
        this.vida = 100;
        this.energia = 100;
        this.nivel = 1;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getEnergia() {
        return energia;
    }

    public int getNivel() {
        return nivel;
    }

    // Status calculado automaticamente
    public String getStatus() {
        if (this.vida <= 0) {
            return "Derrotado";
        }
        return "Vivo";
    }

    // Regra de negócio: Diminuir vida ao receber dano (limite mínimo: 0)
    public void receberDano(int dano) {
        if (this.vida <= 0) {
            System.out.println(this.nome + " já está derrotado e não pode receber mais dano.");
            return;
        }

        this.vida -= dano;

        if (this.vida < 0) {
            this.vida = 0;
        }

        System.out.println(this.nome + " recebeu " + dano + " de dano. Vida atual: " + this.vida);

        if (this.vida == 0) {
            System.out.println(this.nome + " foi derrotado!");
        }
    }

    // Regra de negócio: Consumir energia ao atacar
    public void atacar() {
        if (this.vida <= 0) {
            System.out.println(this.nome + " está derrotado e não pode atacar.");
            return;
        }

        int custoEnergia = 20;

        if (this.energia >= custoEnergia) {
            this.energia -= custoEnergia;
            System.out.println(this.nome + " realizou um ataque! Energia restante: " + this.energia);
        } else {
            System.out.println(this.nome + " não tem energia suficiente para atacar! (Energia atual: " + this.energia + ")");
        }
    }

    // Regra de negócio: Recuperar energia ao descansar (limite máximo: 100)
    public void descansar() {
        if (this.vida <= 0) {
            System.out.println(this.nome + " está derrotado e não pode descansar.");
            return;
        }

        int quantidadeRecuperada = 25;
        this.energia += quantidadeRecuperada;

        if (this.energia > 100) {
            this.energia = 100;
        }

        System.out.println(this.nome + " descansou e recuperou energia. Energia atual: " + this.energia);
    }

    // Método auxiliar para exibir a ficha do personagem
    public void exibirFicha() {
        System.out.println("------------------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Nível: " + this.nivel);
        System.out.println("Vida: " + this.vida + "/100");
        System.out.println("Energia: " + this.energia + "/100");
        System.out.println("Status: " + getStatus());
        System.out.println("------------------------------------");
    }
}