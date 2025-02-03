package br.com.Loans.controller;

import br.com.Loans.domain.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer-loans")
public class LoansController {

    @PostMapping
    public ResponseEntity loanValidation(@RequestBody DadosCadastroCliente dados) {
        System.out.println(dados);

        Cliente cliente = new Cliente(dados);


        Loans loans = new Loans(dados);
        System.out.println(loans);
        loans.defineEmprestimo(new DadosVerificacaoCliente(cliente));
        System.out.println(loans);

        DadosVerificacaoCliente dadosVerificacaoCliente = new DadosVerificacaoCliente(cliente);
        DadosRespostaAPi dadosRespostaAPi = new DadosRespostaAPi(dadosVerificacaoCliente);
        System.out.println(dadosRespostaAPi);


        System.out.println(dadosVerificacaoCliente);
        cliente.verificaRenda(dadosVerificacaoCliente);
        System.out.println(cliente);

        var resposta = "a";

        return ResponseEntity.ok(dadosRespostaAPi); // tenho que devolver a lista com os tipos de emprestimo
    }



}
