public class ContaBancaria {
    
    //Meta = entender o por que de dois contrutores, e como atrelar o this com os calculos

    private int numero;
    private String nome;
    private double saldo;

    public ContaBancaria(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public ContaBancaria(int numero, String nome, double depositoInicial) {
        this.numero = numero;
        this.nome = nome;
        deposito(depositoInicial); //Chamamos a operação depósito, para passar o deposito inicial como argumento
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double quantia){
        saldo += quantia;
    }

    public void sacar(double quantia){
        saldo -= quantia + 5.0;
    }


    
    public String toString(){
        return "Conta: " + numero +
        ", Cliente: " + nome +
        ", Saldo: R$ " + String.format("%.2f", saldo);
    }

    
}
