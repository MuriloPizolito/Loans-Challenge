package br.com.Loans.domain.Cliente;

import br.com.Loans.domain.Loan.LoansType;

public record DadosVerificacaoCliente(String nome, int idade, double renda, String localizacao, LoansType loansType, int taxaDeJuros) {

    // esse é para verificar a renda

    public DadosVerificacaoCliente(Cliente cliente) {
        this(cliente.getNome() ,cliente.getIdade(), cliente.getRenda(), cliente.getLocalizacao(), cliente.getLoansType(), cliente.getTaxaDeJuros());
    }


    public DadosVerificacaoCliente {

        if (renda <= 3000){
            loansType = LoansType.PESSOAL;
//            loansType = LoansType.GARANTIA;
            taxaDeJuros = 4;
            System.out.println("a");
        }

        if (renda >= 3000 & renda <= 5000){
            if (idade < 30 && localizacao.equalsIgnoreCase("SP")){
                loansType = LoansType.GARANTIA;
//                loansType = LoansType.PESSOAL;
                taxaDeJuros = 3;
                System.out.println("b");
            }
        }

        if (renda >= 5000) {
            loansType = LoansType.CONSIGNADO;
            taxaDeJuros = 2;
            System.out.println("c");
        }

    }
}
