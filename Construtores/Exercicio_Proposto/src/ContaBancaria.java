public class ContaBancaria {
    
    private String numeroConta, nome;
    private double saldoInicial;
    private double valorDeposito;
    private double valorSaque;
    private double valorAtualizado;

    

    
    public ContaBancaria() {
    }

    public ContaBancaria(String numeroConta, String nome, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldoInicial = saldoInicial;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorDeposito() {
        return valorDeposito;
    }

    public void setValorDeposito(double valorDeposito) {
        this.valorDeposito = valorDeposito;
    }

    public double getValorSaque() {
        return valorSaque;
    }

    public void setValorSaque(double valorSaque) {
        this.valorSaque = valorSaque;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public double deposito(double valorDeposito){
        valorAtualizado = valorDeposito + getSaldoInicial();

        return valorAtualizado;
    }

    public double sacar(double valorSaque){
        valorAtualizado = valorAtualizado - valorSaque - 5;

        return valorAtualizado;

    }

    public void imprimir(){
        System.out.println("\nDados da conta:");
        System.out.printf("Conta: " +getNumeroConta() + " Titular: " + getNome() + "%nSaldo: R$ %.2f%n " ,getSaldoInicial());
    }

    public void imprimeAtualizacao(){
        System.out.println("\nAtualização dos dados da conta:");
        System.out.println();
        System.out.printf("Conta: " +getNumeroConta() + "\nTitular: " + getNome() + "%nSaldo: R$%.2f", valorAtualizado);
    }

   

}
