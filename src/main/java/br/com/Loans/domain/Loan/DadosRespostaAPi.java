package br.com.Loans.domain.Loan;

import java.util.List;

public record DadosRespostaAPi(String nome, List<DadosListLoans> listaEmprestimos) {

    public DadosRespostaAPi(String nome, List<DadosListLoans> listaEmprestimos) {
        this.nome = nome;
        this.listaEmprestimos = listaEmprestimos;
    }
}
