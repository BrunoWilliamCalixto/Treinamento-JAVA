import java.util.Locale;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        Locale.setDefault(Locale.US);  

        char resp;

        do{
            System.out.print("Digite a temperatura em Celcius: ");
            double c = leia.nextInt();
            double f = 9.0* c / 5.0 + 32;

            System.out.printf("Equivalecia para Fahrenheit: %.1f%n", f);
            System.out.println("Deseja repetir (s/n)? ");
            resp = leia.next().charAt(0);
        }while(resp != 'n');




        leia.close();

        
    }
}
