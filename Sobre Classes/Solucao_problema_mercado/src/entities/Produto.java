package entities;

public class Produto {
    public String nome;
    public double preco;
    public int qtd;

    public double totalValorEstoque(){
        return preco * qtd;
    }
    
    public void addProduto(int qtd){ //Aqui referenciamos o atributo da classe, como uma auto referencia, estamos especificando que queremos acessar o parâmetro da classe, e não o atributo que chegou (int qtd)
        this.qtd += qtd; //estamos somando a qtd do argumento + a qtd da classe
    }

    public void removerProduto(int qtd){
        this.qtd -= qtd;
    }

    public String toString(){
        return nome
            + ", "
            + "$ " + String.format("%.2f", preco) // Formata dentro da to String duas casas decimais
            + ", " + qtd
            + " units, " + "Total: $ "
            + String.format("%.2f", totalValorEstoque());



    }
}
