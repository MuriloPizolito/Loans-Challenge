package br.com.Loans.domain.Cliente;

import br.com.Loans.domain.Loan.LoansType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroCliente(

        @NotNull
        int idade,

        @NotBlank
        String cpf,

        @NotBlank
        String nome,

        @NotNull
        double renda,

        @NotBlank
        String localizacao
        ) {
}
