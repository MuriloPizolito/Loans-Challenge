package br.com.Loans.infra.exception;

import org.springframework.validation.FieldError;

public record ErroValidacao(String campo , String mensagem) {

    public ErroValidacao(FieldError error) {
        this(error.getField(), error.getDefaultMessage());
    }

}
