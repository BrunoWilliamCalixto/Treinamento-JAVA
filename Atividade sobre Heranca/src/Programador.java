public class Programador extends Empregado{

    public Programador(String nome, String matricula) {
        super(nome, matricula);
    }

    private double qtdHoras, valorHora;

    public void Programador(){

    }

    public Programador(String nome, String matricula, double qtdHoras, double valorHora) {
        super(nome, matricula);
        this.qtdHoras = qtdHoras;
        this.valorHora = valorHora;
    }
    
    
    public double getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(double qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public
    double calculaSalario(){

        double salario;
        salario = valorHora *qtdHoras;
        return salario;

    }



}
