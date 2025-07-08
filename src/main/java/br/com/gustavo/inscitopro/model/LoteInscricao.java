package br.com.gustavo.inscitopro.model;

public enum LoteInscricao {
    PRIMEIRO_LOTE("1º Lote"),
    SEGUNDO_LOTE("2º Lote"),
    TERCEIRO_LOTE("3º Lote");

    private final String descricao;

    LoteInscricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}