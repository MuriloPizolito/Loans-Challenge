package br.com.Loans.domain.Cliente;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import org.hibernate.validator.constraints.br.CPF;

public record DadosCadastroCliente(

        @NotNull(message = "Idade é obrigatória")
        @Min(value = 18, message = "Idade mínima de 18 anos")
        int idade,


        @NotBlank(message = "CPF é obrigatório")
        @CPF(message = "CPF inválido")
        String cpf,

        @NotBlank(message = "Nome é obrigatório")
        String nome,

        @NotNull(message = "Renda é obrigatória")
        @PositiveOrZero(message = "Renda não pode ser negativa")
        double renda,

        @NotBlank(message = "Localização é obrigatória")
        String localizacao
        ) {
}
