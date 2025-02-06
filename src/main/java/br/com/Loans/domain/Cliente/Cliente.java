package br.com.Loans.domain.Cliente;

import br.com.Loans.domain.Loan.DadosListLoans;
import br.com.Loans.domain.Loan.LoansType;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private int idade;
    private String cpf;
    private String nome;
    private double renda;
    private String localizacao;
    private LoansType loansType;
    private int taxaDeJuros;
    private List<DadosListLoans> dadosListLoans = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(DadosCadastroCliente dados) {
        this.idade = dados.idade();
        this.cpf = dados.cpf();
        this.nome = dados.nome();
        this.renda = dados.renda();
        this.localizacao = dados.localizacao();
    }

    public void dadosListLoans(DadosVerificacaoCliente dadosVerificacaoCliente) {
        if (renda < 3000) {
            dadosListLoans.add(new DadosListLoans(LoansType.PESSOAL, 4));
            dadosListLoans.add(new DadosListLoans(LoansType.GARANTIA, 3));
        }

        if (renda >= 3000 && renda <= 5000) {
            if (idade < 30 && localizacao.equalsIgnoreCase("SP")) {
                dadosListLoans.add(new DadosListLoans(LoansType.PESSOAL, 4));
                dadosListLoans.add(new DadosListLoans(LoansType.GARANTIA, 3));
            }
        }

        if (renda >= 5000) {
            dadosListLoans.add(new DadosListLoans(LoansType.CONSIGNADO, 2));
        }

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

    public LoansType getLoansType() {
        return loansType;
    }

    public int getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public List<DadosListLoans> getDadosListLoans() {
        return dadosListLoans;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idade=" + idade +
                ", cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", renda=" + renda +
                ", localizacao='" + localizacao + '\'' +
                '}';
    }
}
