import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        System.out.println("Entre com número de sua conta bancária: ");
        conta.setNumeroConta(leia.nextLine());

        System.out.println("Digite seu nome: ");
        conta.setNome(leia.nextLine());

        System.out.println("Possui um valor inicial de depósito? y/n");
        char opcao = 'y';
        opcao = leia.next().charAt(0);

        if(opcao == 'y' || opcao =='Y'){
            System.out.println("Digite o valor de depósito:");
            conta.setSaldoInicial(leia.nextDouble());
            conta.imprimir();
        }
        else{
            conta.imprimir();
        }

        System.out.println("\nDigite o valor a ser depositado: ");
        conta.deposito(leia.nextDouble());

        conta.imprimeAtualizacao();


        System.out.println("\nDigite o valor a ser sacado: ");
        conta.sacar(leia.nextDouble());

        conta.imprimeAtualizacao();
        
        leia.close();
    }

    
}
