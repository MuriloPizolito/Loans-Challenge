package br.com.Loans.domain.Loan;

import br.com.Loans.domain.Cliente.DadosVerificacaoCliente;

public record DadosListLoans(LoansType tipoEmprestimo, int taxaDeJuros) {

    public DadosListLoans(DadosVerificacaoCliente dados) {
        this(dados.tipoEmprestimo(), dados.taxaDeJuros());
    }
}
