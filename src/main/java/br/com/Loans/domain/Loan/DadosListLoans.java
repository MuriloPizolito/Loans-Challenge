package br.com.Loans.domain.Loan;

import br.com.Loans.domain.Cliente.Cliente;
import br.com.Loans.domain.Cliente.DadosVerificacaoCliente;

public record DadosListLoans(LoansType loansType, int taxaDeJuros) {

    public DadosListLoans(DadosVerificacaoCliente dados) {
        this(dados.loansType(), dados.taxaDeJuros());
    }
}
