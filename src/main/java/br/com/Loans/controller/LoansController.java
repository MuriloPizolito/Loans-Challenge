package br.com.Loans.controller;

import br.com.Loans.domain.Cliente.Cliente;
import br.com.Loans.domain.Cliente.DadosCadastroCliente;
import br.com.Loans.domain.Cliente.DadosVerificacaoCliente;
import br.com.Loans.domain.Loan.DadosRespostaAPi;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer-loans")
public class LoansController {

    @PostMapping
    public ResponseEntity loanValidation(@RequestBody @Valid DadosCadastroCliente dados) {
        Cliente cliente = new Cliente(dados);

        DadosVerificacaoCliente dadosVerificacaoCliente = new DadosVerificacaoCliente(cliente);
        cliente.dadosListLoans(dadosVerificacaoCliente);

        return ResponseEntity.ok(new DadosRespostaAPi(cliente));
    }


}
