import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        int num = leia.nextInt();
        int soma = 0;   //para ser retornado um devido valor na instância de while, devemos atribuir uma inicialização a ela para que a variável possa processar o armazenamento, onde utilizamos o numero 0;

        //condição while, é uma estrutura que repete o ciclo verdadeiro e re-checa a condição, até que uma condição dê false.
        
        while (num != 0){
            soma += num;
            num = leia.nextInt();
        }

        System.out.println(soma);
    }
}
