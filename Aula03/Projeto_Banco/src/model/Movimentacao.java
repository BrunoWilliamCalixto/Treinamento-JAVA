package model;

import java.util.Date;
import utils.DataUtil;

public class Movimentacao {

    private String descricao;
    private Date data;
    private double valor;


    public Movimentacao(String descricao, double valor) {
        this.descricao = descricao;
        this.data = new Date();
        this.valor = valor;

    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Date getData() {
        return data;
    }
    public double getValor() {
        return valor;
    }
    
    @Override // Estou sobre escrevendo
    public String toString(){

        String dataFormatada = DataUtil.converterDateParaDataeHora(this.getData());
        return this.getDescricao() + " \n " + dataFormatada + " - R$ " + this.valor;
        
    }

    
    
}
