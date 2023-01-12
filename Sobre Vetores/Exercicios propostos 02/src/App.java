import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        int n;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = leia.nextInt();

        Valores[] valor = new Valores[n];

        for(int i=0; i<valor.length; i++){
            leia.nextLine();
            System.out.print("Digite um numero: ");
            int num = leia.nextInt();
            valor[i] = new Valores(num);
        }
        
        System.out.print("VALORES = ");
        for(int i=0; i<valor.length; i++){
            System.out.printf("%.1f,  ", valor[i].getNumero());
        }

        System.out.println();

        double soma = 0;
        System.out.print("SOMA = ");
        for(int i=0; i<valor.length; i++){
            soma += valor[i].getNumero(); 
        }
        System.out.printf("%.1f  ", soma);
        System.out.println();

        double media = soma / valor.length;

        System.out.printf("MEDIA = %.1f  ", media);
    }
}
