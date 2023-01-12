import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
        
        int peca1, peca2;
        int  qtd1,qtd2;
        double preco1,preco2, total;
        
      
        

        System.out.println("Entre com o código da peça 1: ");
        peca1 = leia.nextInt();

        System.out.println("Entre com a quantidade de peças: ");
        qtd1 = leia.nextInt();

        System.out.println("Entre com o valor unitário: ");
        preco1 = leia.nextDouble();
        
        System.out.println("Entre com o código da peça 2: ");
        peca2 = leia.nextInt();

        System.out.println("Entre com a quantidade de peças: ");
        qtd2 = leia.nextInt();

        System.out.println("Entre com o valor unitário: ");
        preco2 = leia.nextDouble();

        total = preco1 * qtd1 + preco2 * qtd2;

        System.out.printf("VALOR A PAGAR: R$%.2f", total);

        leia.close();
      

    }
}