package br.com.Loans.domain;

public record DadosCadastroCliente(int idade, String cpf, String nome, double renda, String localizacao, LoansType loansType, int taxaDeJuros) {
}
