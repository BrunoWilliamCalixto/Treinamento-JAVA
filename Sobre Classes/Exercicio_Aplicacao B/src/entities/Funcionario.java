package entities;

public class Funcionario {
    public String nome;
    public double salarioB, taxa, liquidoTotal;
    public double porcentagem;
   


    public double salarioLiquidoTotal(){
        return salarioB - taxa;

    }

    public void acrescimoSalario(double porcentagem){
        salarioB += salarioB * porcentagem / 100.0;
    }

    public String toString(){

        return "Nome: " + nome + ", " + String.format("R$ %.2f", salarioLiquidoTotal()) ;
    }

    public void acrescimoSalario() {
    }

}


