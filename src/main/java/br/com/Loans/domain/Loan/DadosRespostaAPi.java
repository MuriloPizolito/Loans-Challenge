package br.com.Loans.domain.Loan;

import br.com.Loans.domain.Cliente.Cliente;
import br.com.Loans.domain.Cliente.DadosVerificacaoCliente;

import java.util.List;

public record DadosRespostaAPi(String nome, List<DadosListLoans> dadosListLoans) {

    public DadosRespostaAPi(Cliente dados) {
        this(dados.getNome(), dados.getDadosListLoans());
    }



}
