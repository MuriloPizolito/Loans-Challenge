package br.com.Loans.service;

import br.com.Loans.domain.Cliente.DadosVerificacaoCliente;
import br.com.Loans.domain.Loan.DadosListLoans;
import br.com.Loans.domain.Loan.LoansType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoanService {

    public List<DadosListLoans> verificarTiposEmprestimos(DadosVerificacaoCliente dados) {
        List<DadosListLoans> listaEmprestimos = new ArrayList();

        if (dados.renda() < 3000) {
            listaEmprestimos.add(new DadosListLoans(LoansType.PESSOAL, 4));
            listaEmprestimos.add(new DadosListLoans(LoansType.GARANTIA, 3));
        }

        if (dados.renda() >= 3000 && dados.renda() <= 5000) {
            if (dados.idade() < 30 && dados.localizacao().equalsIgnoreCase("SP")) {
                listaEmprestimos.add(new DadosListLoans(LoansType.PESSOAL, 4));
                listaEmprestimos.add(new DadosListLoans(LoansType.GARANTIA, 3));
            }
        }

        if (dados.renda() >= 5000) {
            listaEmprestimos.add(new DadosListLoans(LoansType.CONSIGNADO, 2));
        }

        return listaEmprestimos;
    }

}
