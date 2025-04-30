package com.evento.evento.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private Double preco;

    @ManyToMany(mappedBy = "atividades")
    private List<Participante> participantes = new ArrayList<>();

    @ManyToOne
    private Categoria categoria;

    @OneToMany
    private List<Bloco> blocos = new ArrayList<>();

    public Atividade() {}

    public Atividade(Long id, String nome, String descricao, Double preco, Categoria categoria, List<Bloco> blocos) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
        this.blocos = blocos;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public Double getPreco() { return preco; }
    public void setPreco(Double preco) { this.preco = preco; }

    public List<Participante> getParticipantes() { return participantes; }
    public void setParticipantes(List<Participante> participantes) { this.participantes = participantes; }

    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }

    public List<Bloco> getBlocos() { return blocos; }
    public void setBlocos(List<Bloco> blocos) { this.blocos = blocos; }
}
