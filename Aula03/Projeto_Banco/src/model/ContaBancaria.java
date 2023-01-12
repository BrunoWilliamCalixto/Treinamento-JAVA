package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;

//abstract significa que essa conta servirá apenas como modelo, não poderá ser instanciada, servirá apenas como base
public abstract class ContaBancaria {

    //#region Atributos
    protected String agencia;
    protected String conta;
    protected int digito;
    protected double saldo;
    protected Date dataAbertura;
    protected ArrayList<Movimentacao> movimentacoes;
    protected Double VALOR_MINIMO_DEPOSITO = 10.0; //Double com D maiusculo é uma constante, que se separa por "_".
    
    //#endregion

    //#region Construtores
     public ContaBancaria(String agencia, String conta, int digito, double saldoInicial) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.saldo = saldoInicial;
        this.dataAbertura = new Date();
        this.movimentacoes = new ArrayList<Movimentacao>();
      
        Movimentacao movimentacao = new Movimentacao("Abertura de conta", saldoInicial);
        //Aqui estou salvando a movimentação dentro do Array de movimentações.
        
        //Aqui estou inciando meu extrato bancario.
        this.movimentacoes.add(movimentacao);

    }
    //#endregion

    //#region Getters e Setters
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getConta() {
        return conta;
    }
    public void setConta(String conta) {
        this.conta = conta;
    }
    public int getDigito() {
        return digito;
    }
    public void setDigito(int digito) {
        this.digito = digito;
    }


    public double getSaldo() {
        return saldo;
    }
    public Date getDataAbertura() {
        return dataAbertura;
    }

  
     //#endregion

    

    //#region Métodos - São recursos dentro de uma classe ou objeto que geram comportamentos
    public void depositar(Double valor){
        // Verifica se o valor de depósito é menor que o valor mínimo, se for, não pode acontecer o depósito
        if(valor < VALOR_MINIMO_DEPOSITO){
            throw new InputMismatchException("O valor mínimo de depósito é R$: " + VALOR_MINIMO_DEPOSITO);
        }
        //Efetua o depósito somando o valor ao saldo
        this.saldo += valor;

        //Aqui faço uma movimentação no extrato

        Movimentacao movimentacao = new Movimentacao("Depósito", valor);
        this.movimentacoes.add(movimentacao);
    }

    public Double sacar(double valor){
        // Verifica se o valor de depósito é maior que o saldo da conta, se for, manda mensagem de saldo insuficiente.
        if(valor > this.saldo){
            throw new InputMismatchException("Saldo é insuficiente!!!");
        }
        //retorna o valor de saque do saldo atual.
        this.saldo -= valor;
        //retorna o valor subtraído do saldo do usuário.

        
        Movimentacao movimentacao = new Movimentacao("Retirada de valor", valor);
        this.movimentacoes.add(movimentacao);

        return valor;
    }
     
    public void tranferencia (double valor, ContaBancaria contaDestino){

        //Efetua um saque na conta atual
        this.sacar(valor);

        //Efetua um deposito para a conta atual
        contaDestino.depositar(valor);
    }
    //#endregion

    public abstract void imprimirExtrato();
    

    

}
   
    
    

