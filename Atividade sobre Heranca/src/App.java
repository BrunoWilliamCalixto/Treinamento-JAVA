import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        int opcao;
        Programador programador = new Programador(null, null);
        Analista analista = new Analista(null, null, 800.0);
        
        System.out.println("Por favor, selecione a opção desejada: ");

        System.out.println("1 - Programador");
        System.out.println("2 - Analista;");
        System.out.println("3 - Sair");

        opcao = leia.nextInt();
        if(opcao == 1){
            System.out.println("Selecionado: Programador!");
            System.out.println();
            System.out.println("Entre com seu nome: ");
            programador.setNome(leia.nextLine());
            System.out.println("Entre com sua matricula: ");
            programador.setMatricula(leia.nextLine());
            System.out.println("--------------------------------------");

            System.out.println("Digite seu salário base p/hr: ");
            programador.setValorHora(leia.nextDouble());

            System.out.println("Digite a quantidade de horas trabalhadas (mês): ");
            programador.setQtdHoras(leia.nextDouble());


            programador.calculaSalario();   
        }
        else if (opcao == 2){
            System.out.println("Selecionado: Programador!");
            System.out.println();
            System.out.println("Entre com seu nome: ");
            analista.setNome(leia.nextLine());
            System.out.println("Entre com sua matricula: ");
            analista.setMatricula(leia.nextLine());
            System.out.println("--------------------------------------");

            System.out.println("Digite a quantidade de projetos exercidos: ");
            analista.calculaSalario();
            
            
            
        }else if(opcao == 3){
            System.out.println("Obrigado!");
        }
    }
}
