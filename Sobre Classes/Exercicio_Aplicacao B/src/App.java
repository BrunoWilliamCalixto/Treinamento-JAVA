import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;



public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.println("Entre com seu nome: ");
        funcionario.nome = leia.nextLine();
        System.out.println("Digite seu salário bruto: ");
        funcionario.salarioB = leia.nextDouble();
        System.out.println("Digite a taxa a ser paga: ");
        funcionario.taxa = leia.nextDouble();

        System.out.print("Informações confirmadas: " + funcionario);
        
        System.out.println();
        System.out.println("Procentagem a ser acrescentada em seu salario: ");
        double porcentagem = leia.nextDouble();
        funcionario.acrescimoSalario(porcentagem);

        System.out.println();
        System.out.println("Valor atualizado");
        System.out.println(funcionario);
        

        leia.close();

    }
}
