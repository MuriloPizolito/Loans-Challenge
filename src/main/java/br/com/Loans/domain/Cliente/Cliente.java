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

    public void dadosListLoans (DadosVerificacaoCliente dadosVerificacaoCliente) {
        this.loansType = dadosVerificacaoCliente.loansType();
        this.taxaDeJuros = dadosVerificacaoCliente.taxaDeJuros();
        dadosListLoans.add(new DadosListLoans(loansType, taxaDeJuros));

//        for (DadosListLoans dadosListLoans1 : dadosListLoans){
//            System.out.println("lista: "+ dadosListLoans1);
//        }

    }

    public void verificaRenda(DadosVerificacaoCliente dados) {

        if (dados.renda() <= 3000) {
            System.out.println("Empréstimo pessoal");
            System.out.println("Empréstimo com garantia");
        }
        if (dados.renda() >= 3000 && dados.renda() <= 5000) {
            if (dados.idade() < 30 && dados.localizacao().equals("SP")) {
                System.out.println("Empréstimo pessoal");
                System.out.println("Empréstimo com garantia");
            }
        }

        if (dados.renda() >= 5000) {
            System.out.println("Empréstimo consignado");
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
