import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //Para instruções switch case, devemos obrigatóriamente declarar uma variável que vá receber dentro do parentese switch, com um comando de leitura, onde declaramos a variável opção;

        //Em seguida, devemos sempre no final do programa, executar uma saída de dados para que ele imprima fora o bloco case


        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o dia da semana:");
        int opcao = leia.nextInt();
        String dia;

        switch(opcao){
        

            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça"; 
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Inválido";
                break;
        }

        System.out.println("Dia da semana é " + dia);
    }
}
