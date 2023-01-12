import model.ContaBancaria;
import model.ContaCorrente;
import model.ContaPoupanca;
import model.Movimentacao;
import utils.DataUtil;

public class App {
    public static void main(String[] args) {

        System.out.println("Criando nosso Banco Digital");
        System.out.println();

        ContaCorrente conta = new ContaCorrente("0001","21588", 1, 100);
        System.out.println(conta.getAgencia());
        System.out.println(conta.getConta());
        System.out.println(conta.getDigito());
        System.out.println("Saldo atual de R$ " + conta.getSaldo());
        System.out.println();

        conta.depositar(350.0);
        System.out.println("Saldo atual é de R$ " + conta.getSaldo());
        System.out.println();

        var saque = conta.sacar(125.00);
        System.out.println("Saldo atual é de R$ " + conta.getSaldo());
        System.out.println();

        ContaPoupanca conta2 = new ContaPoupanca("0001", "264813", 3 , 300.0);

        conta2.tranferencia(100.0, conta);
        System.out.println("Saldo conta destino de R$ " + conta2.getSaldo());
        System.out.println();

        System.out.println("Saldo conta atual de R$ " + conta.getSaldo());

        System.out.println(conta2.getDataAbertura());

        String data = DataUtil.converterDateParaDataeHora(conta2.getDataAbertura());
        System.out.println(data);
        System.out.println();


        //Extrato bancario é composto por movimentações bancárias.
        //ter algo que possa ser a movimentação
        //ter uma lista de movimentações
        

        conta.imprimirExtrato();

        conta2.imprimirExtrato();
        

        
    }
}

