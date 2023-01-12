public class Analista extends Empregado{
    private int qtd;
    private double valorPorProjeto[];

    public Analista(String nome, String matricula, double valorPorProjeto) {
        super(nome, matricula);
        this.valorPorProjeto = valorPorProjeto[(int) 800.0];
    }
    
    

    public int getQtd() {
        return qtd;
    }



    public void setQtd(int qtd) {
        this.qtd = qtd;
    }



    public double[] getValorPorProjeto() {
        return valorPorProjeto;
    }



    public void setValorPorProjeto(double[] valorPorProjeto) {
        this.valorPorProjeto = valorPorProjeto;
    }


    @Override
    public double calculaSalario(){
        double custo;

        custo = valorPorProjeto[800] *qtd;

        return custo;
    }




	



    
}
