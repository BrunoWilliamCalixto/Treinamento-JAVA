import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        int n;
        

        System.out.println("Entre com um número de cadastro de produtos: ");
        n = leia.nextInt();

        // Para definir um objeto como vetor, devemos declarar toda a instância em []

        
        Produto[] vect = new Produto[n];
        
        for(int i=0; i<vect.length; i++){
            leia.nextLine();
            System.out.println("Digite o nome do Produto:");
            String name = leia.nextLine();

            System.out.println("Digite o preço: ");
            double price = leia.nextDouble();
            vect[i] = new Produto(name, price);

        }

        double soma = 0;
        for(int i=0; i<vect.length; i++){
            soma += vect[i].getPreco();
        }

        double media = soma / vect.length;

        System.out.printf("Valor da média é igual a R$ %.2f", media);
        
    }
}
