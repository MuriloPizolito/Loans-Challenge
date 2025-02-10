package br.com.Loans.domain.Cliente;

import br.com.Loans.domain.Loan.LoansType;

public class Cliente {

    private int idade;
    private String cpf;
    private String nome;
    private double renda;
    private String localizacao;
    private LoansType tipoEmprestimo;
    private int taxaDeJuros;

    public Cliente(DadosCadastroCliente dados) {
        this.idade = dados.idade();
        this.cpf = dados.cpf();
        this.nome = dados.nome();
        this.renda = dados.renda();
        this.localizacao = dados.localizacao();
    }


    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public double getRenda() {
        return renda;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public LoansType getTipoEmprestimo() {
        return tipoEmprestimo;
    }

    public int getTaxaDeJuros() {
        return taxaDeJuros;
    }

}
