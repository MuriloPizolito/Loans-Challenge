package br.com.Loans.domain.Cliente;

import br.com.Loans.domain.Loan.LoansType;

public record DadosVerificacaoCliente(String nome, int idade, double renda, String localizacao, LoansType loansType, int taxaDeJuros) {

    // esse é para verificar a renda

    public DadosVerificacaoCliente(Cliente cliente) {
        this(cliente.getNome() ,cliente.getIdade(), cliente.getRenda(), cliente.getLocalizacao(), cliente.getLoansType(), cliente.getTaxaDeJuros());
    }
}
