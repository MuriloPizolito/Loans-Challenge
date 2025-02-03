package br.com.Loans.domain;

public record DadosRespostaAPi(String nome, LoansType loansType, int taxaDeJuros) {

    public DadosRespostaAPi(DadosVerificacaoCliente dados) {
        this(dados.nome(), dados.loansType(), dados.taxaDeJuros());
    }



}
