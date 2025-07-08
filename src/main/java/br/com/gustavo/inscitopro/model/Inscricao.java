package br.com.gustavo.inscitopro.model;

import jakarta.persistence.*;

@Entity // Anotação que informa ao JPA que esta classe é uma entidade
public class Inscricao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera o ID automaticamente
    private Long id;

    private String nomeParticipante;
    private String email;
    private String telefone;

    @Enumerated(EnumType.STRING) // Grava o Enum como texto no banco
    private LoteInscricao loteInscricao;

    @Enumerated(EnumType.STRING) // Grava o Enum como texto no banco
    private StatusPagamento statusPagamento;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNomeParticipante() { return nomeParticipante; }
    public void setNomeParticipante(String nomeParticipante) { this.nomeParticipante = nomeParticipante; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public LoteInscricao getLoteInscricao() { return loteInscricao; }
    public void setLoteInscricao(LoteInscricao loteInscricao) { this.loteInscricao = loteInscricao; }
    public StatusPagamento getStatusPagamento() { return statusPagamento; }
    public void setStatusPagamento(StatusPagamento statusPagamento) { this.statusPagamento = statusPagamento; }
}