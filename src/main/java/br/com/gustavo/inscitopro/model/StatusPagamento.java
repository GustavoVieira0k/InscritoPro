package br.com.gustavo.inscitopro.model;

public enum StatusPagamento {
    AGUARDANDO("Aguardando"),
    APROVADO("Aprovado"),
    CANCELADO("Cancelado");

    private final String descricao;

    StatusPagamento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}