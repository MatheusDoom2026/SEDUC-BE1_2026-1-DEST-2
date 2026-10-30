package com.sedu2.site_de_games.Entity;

import com.sedu2.site_de_games.Avaliações;
import com.sedu2.site_de_games.Classificação_Indicativa;
import com.sedu2.site_de_games.Introdution;
import jakarta.persistence.*;

import java.time.LocalDate;

public class Something {

    @Entity
    @Table(name = "tb_jogos")
    public class Jogo {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false)
        private String titulo;

        @Enumerated(EnumType.STRING)
        @Column(nullable = false)
        private Introdution.Genero genero;

        private String desenvolvedora;

        @Enumerated(EnumType.STRING)
        private Classificação_Indicativa.ClassificacaoIndicativa classificacaoIndicativa;

        private LocalDate dataLancamento;

        private Double preco;

        private String plataforma;

        private Boolean multiplayer;

        @Enumerated(EnumType.STRING)
        private Avaliações.Avaliacao avaliacao;

        @Column(columnDefinition = "TEXT")
        private String descricao;

        public Jogo() {}

        public Jogo(Long id, String titulo, Introdution.Genero genero, String desenvolvedora,
                    Classificação_Indicativa.ClassificacaoIndicativa classificacaoIndicativa, LocalDate dataLancamento,
                    Double preco, String plataforma, Boolean multiplayer, Avaliações.Avaliacao avaliacao, String descricao) {
            this.id = id;
            this.titulo = titulo;
            this.genero = genero;
            this.desenvolvedora = desenvolvedora;
            this.classificacaoIndicativa = classificacaoIndicativa;
            this.dataLancamento = dataLancamento;
            this.preco = preco;
            this.plataforma = plataforma;
            this.multiplayer = multiplayer;
            this.avaliacao = avaliacao;
            this.descricao = descricao;
        }

        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }

        public String getTitulo() { return titulo; }
        public void setTitulo(String titulo) { this.titulo = titulo; }

        public Introdution.Genero getGenero() { return genero; }
        public void setGenero(Introdution.Genero genero) { this.genero = genero; }

        public String getDesenvolvedora() { return desenvolvedora; }
        public void setDesenvolvedora(String desenvolvedora) { this.desenvolvedora = desenvolvedora; }

        public Classificação_Indicativa.ClassificacaoIndicativa getClassificacaoIndicativa() { return classificacaoIndicativa; }
        public void setClassificacaoIndicativa(Classificação_Indicativa.ClassificacaoIndicativa classificacaoIndicativa) { this.classificacaoIndicativa = classificacaoIndicativa; }

        public LocalDate getDataLancamento() { return dataLancamento; }
        public void setDataLancamento(LocalDate dataLancamento) { this.dataLancamento = dataLancamento; }

        public Double getPreco() { return preco; }
        public void setPreco(Double preco) { this.preco = preco; }

        public String getPlataforma() { return plataforma; }
        public void setPlataforma(String plataforma) { this.plataforma = plataforma; }

        public Boolean getMultiplayer() { return multiplayer; }
        public void setMultiplayer(Boolean multiplayer) { this.multiplayer = multiplayer; }

        public Avaliações.Avaliacao getAvaliacao() { return avaliacao; }
        public void setAvaliacao(Avaliações.Avaliacao avaliacao) { this.avaliacao = avaliacao; }

        public String getDescricao() { return descricao; }
        public void setDescricao(String descricao) { this.descricao = descricao;
        }
    }

}
