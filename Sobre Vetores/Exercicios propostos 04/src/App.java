import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        int n;
        System.out.println("Quantos numeros você vai digitar?");
        n = leia.nextInt();

        int[] numero = new int[n];

        for(int i=0; i<numero.length; i++){
            leia.nextLine();
            System.out.println("Digite um numero: ");
            numero[i] = leia.nextInt();
        }

        System.out.println("NUMEROS PARES:");
        for(int i=0; i<numero.length; i++){
            if(numero[i]%2==0){
                System.out.println(numero[i]);
            }
        }

        int adicao = 0;
        System.out.println("QUANTIDADES DE PARES: ");
        for(int i=0; i<numero.length; i++){
            if(numero[i]%2==0){
                adicao += 1;
            }
        }
        System.out.println(adicao);
        

        leia.close();
    }
}
