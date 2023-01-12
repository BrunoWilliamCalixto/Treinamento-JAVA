import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        ContaBancaria conta;

        System.out.println("Entre com número de sua conta bancária: ");
        int number = leia.nextInt();

        System.out.println("Digite seu nome: ");
        leia.nextLine();
        String holder = leia.nextLine();

        System.out.println("Possui um valor inicial de depósito? y/n");
        char opcao = 'y';
        opcao = leia.next().charAt(0);
        if(opcao == 'y' || opcao =='Y'){
            System.out.println("Digite o valor de depósito Inicial:");
            double depositoInicial = leia.nextDouble();
            conta = new ContaBancaria(number, holder, depositoInicial);
        }
        else{
            conta = new ContaBancaria(number, holder);
        }

        System.out.println();
        System.out.println("Dados da conta:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Digite o valor para depósito: ");
        double valorDeposito = leia. nextDouble(); //variável temporária
        conta.deposito(valorDeposito); //variavél acessa o double quantia
        System.out.println("--------------------------------");
        System.out.println("Dados Atualizados:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Digite o valor de Saque: ");
        double valorSaque = leia. nextDouble();
        conta.sacar(valorSaque);


        System.out.println("--------------------------------");
        System.out.println("Dados Atualizados:");
        System.out.println(conta);



        leia.close();
    }
}
