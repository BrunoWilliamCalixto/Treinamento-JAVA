package model;

import java.util.Date;

import utils.DataUtil;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(String agencia, String conta, int digito, double saldoInicial) {
        super(agencia, conta, digito, saldoInicial); //Super significa que o método construtor está passando a herança para a classe pai
        
    }

    @Override
    public void imprimirExtrato() {
        

        System.out.println("*************************");
        System.out.println("*****Exrato Bancário*****");
        System.out.println("*************************");
        System.out.println();

        System.out.println("Gerado em: " +DataUtil.converterDateParaDataeHora(new Date()));
        System.out.println();
        for (Movimentacao movimentacao : this.movimentacoes) {
            System.out.println(movimentacao);
            System.out.println();
            
        }

      
        System.out.println("*************************");
        System.out.println("*************************");

    }
}
