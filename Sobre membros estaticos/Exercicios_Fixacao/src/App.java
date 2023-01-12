import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
       

        System.out.println("Entre com a cotação atual do dólar:");
        double cot = leia.nextDouble();

        System.out.println("Quantos dólares você deseja comprar?");
        double dol = leia.nextDouble();

        double total = CotacaoDolar.conversaoDolar(cot, dol);
        

        System.out.printf("Cotação Dólar: R$%.2f", cot);
        System.out.printf("%nDólares a comprar: R$%.2f", dol);
        System.out.printf("%nVocê precisará de R$%.2f" + " Para realizar a conversão" , total );




        leia.close();
    }
}
