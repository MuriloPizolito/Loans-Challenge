package br.com.Loans.controller;

import br.com.Loans.domain.DadosCadastroLoans;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loans")
public class LoansController {

    @GetMapping
    public void cadastrar(@RequestBody DadosCadastroLoans dados) {

        System.out.println(dados);

    }

}
