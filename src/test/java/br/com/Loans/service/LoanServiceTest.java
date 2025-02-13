package br.com.Loans.service;

import br.com.Loans.domain.Cliente.Cliente;
import br.com.Loans.domain.Cliente.DadosCadastroCliente;
import br.com.Loans.domain.Cliente.DadosVerificacaoCliente;
import br.com.Loans.domain.Loan.DadosListLoans;
import br.com.Loans.domain.Loan.LoansType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LoanServiceTest {

    private LoanService loanService;

    @BeforeEach
    void setUp() {
        loanService = new LoanService();
    }

    @Test
    @DisplayName("Deve retornar empréstimo Pessoal e Garantia para jovens de SP com renda menor que 3000")
    void rendaBaixa() {
        DadosCadastroCliente dadosCadastroCliente = new DadosCadastroCliente(26, "275.484.389-23", "Murilo", 2000, "SP");
        Cliente cliente = new Cliente(dadosCadastroCliente);

        List<DadosListLoans> emprestimos = loanService.verificarTiposEmprestimos(new DadosVerificacaoCliente(cliente));

        assertEquals(2, emprestimos.size());
        assertEquals(new DadosListLoans(LoansType.PESSOAL, 4), emprestimos.get(0));
        assertEquals(new DadosListLoans(LoansType.GARANTIA, 3), emprestimos.get(1));
    }


    @Test
    @DisplayName("Deve retornar empréstimo Pessoal e Garantia para jovens de SP com renda média entre 3.000 e 4.000")
    void rendaMedia() {
        DadosCadastroCliente dadosCadastroCliente = new DadosCadastroCliente(26, "275.484.389-23", "Murilo", 4000, "SP");
        Cliente cliente = new Cliente(dadosCadastroCliente);

        List<DadosListLoans> emprestimos = loanService.verificarTiposEmprestimos(new DadosVerificacaoCliente(cliente));

        assertEquals(2, emprestimos.size());
        assertEquals(new DadosListLoans(LoansType.PESSOAL, 4), emprestimos.get(0));
        assertEquals(new DadosListLoans(LoansType.GARANTIA, 3), emprestimos.get(1));
    }

    @Test
    @DisplayName("Deve retornar empréstimo Pessoal, Garantia e Consignado para jovens de SP com renda maior ou igual a 5.000")
    void rendaAlta() {
        DadosCadastroCliente dadosCadastroCliente = new DadosCadastroCliente(26, "275.484.389-23", "Murilo", 5000, "SP");
        Cliente cliente = new Cliente(dadosCadastroCliente);

        List<DadosListLoans> emprestimos = loanService.verificarTiposEmprestimos(new DadosVerificacaoCliente(cliente));



        assertEquals(3, emprestimos.size());
        assertEquals(new DadosListLoans(LoansType.PESSOAL, 4), emprestimos.get(0));
        assertEquals(new DadosListLoans(LoansType.GARANTIA, 3), emprestimos.get(1));
        assertEquals(new DadosListLoans(LoansType.CONSIGNADO, 2), emprestimos.get(2));
    }

    @Test
    @DisplayName("Deve retornar empréstimo Consignado para outro estado e idade maior que 30 anos com renda maior ou igual a 5.000")
    void rendaAltaForaDeSp() {
        DadosCadastroCliente dadosCadastroCliente = new DadosCadastroCliente(31, "275.484.389-23", "Murilo", 5000, "RJ");
        Cliente cliente = new Cliente(dadosCadastroCliente);

        List<DadosListLoans> emprestimos = loanService.verificarTiposEmprestimos(new DadosVerificacaoCliente(cliente));

        assertEquals(1, emprestimos.size());
        assertEquals(new DadosListLoans(LoansType.CONSIGNADO, 2), emprestimos.get(0));
    }

    @Test
    @DisplayName("Não deve retornar empréstimos para renda média fora de SP")
    void rendaMediaForaDeSp() {
        DadosCadastroCliente dadosCadastroCliente = new DadosCadastroCliente(28, "275.484.389-23", "Murilo", 4000, "RJ");
        Cliente cliente = new Cliente(dadosCadastroCliente);

        List<DadosListLoans> emprestimos = loanService.verificarTiposEmprestimos(new DadosVerificacaoCliente(cliente));

        assertTrue(emprestimos.isEmpty());
    }

}