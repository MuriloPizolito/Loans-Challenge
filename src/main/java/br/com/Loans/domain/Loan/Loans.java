package br.com.Loans.domain.Loan;

import br.com.Loans.domain.Cliente.DadosCadastroCliente;
import br.com.Loans.domain.Cliente.DadosVerificacaoCliente;

public class Loans {

    private String nome;
    private LoansType loansType;
    private int taxaDeJuros;

//    public Loans(DadosVerificacaoCliente dados) {
//        this.nome = dados.nome();
//        this.loansType = dados.loansType();
//        this.taxaDeJuros = dados.taxaDeJuros();
//    }

//    public void defineEmprestimo(DadosVerificacaoCliente dados) {
//
//        if (dados.loansType() == LoansType.PESSOAL) {
//            taxaDeJuros = 4;
////            System.out.println("TAXA DE JUROS = " + taxaDeJuros);
//        }
//        if (dados.loansType() == LoansType.CONSIGNADO) {
//            taxaDeJuros = 2;
////            System.out.println("TAXA DE JUROS = " + taxaDeJuros);
//        }
//        if (dados.loansType() == LoansType.GARANTIA) {
//            taxaDeJuros = 3;
////            System.out.println("TAXA DE JUROS = " + taxaDeJuros);
//        }
//
//    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LoansType getLoansType() {
        return loansType;
    }

    public void setLoansType(LoansType loansType) {
        this.loansType = loansType;
    }

    public int getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(int taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    @Override
    public String toString() {
        return "Loans{" +
                "nome='" + nome + '\'' +
                ", loansType=" + loansType +
                ", taxaDeJuros=" + taxaDeJuros +
                '}';
    }
}
