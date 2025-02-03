package br.com.Loans.domain;

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
        }

        if (renda >= 3000 & renda <= 5000){
            if (idade < 30 && localizacao.equals("SP")){
                loansType = LoansType.GARANTIA;
//                loansType = LoansType.PESSOAL;
                taxaDeJuros = 3;
            }
        }

        if (renda >= 7000) {
            loansType = LoansType.CONSIGNADO;
            taxaDeJuros = 2;
        }


    }
}
