import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        int n ;

        System.out.print("Quantos numeros você vai digitar? ");
        n = leia.nextInt();

        int[] vect = new int[n];

        for(int i=0; i<vect.length; i++){
            leia.nextLine();
            
            System.out.println("Digite um numero: ");
            vect[i] = leia.nextInt();
        }

        System.out.println("VETORES NEGATIVOS: ");
        for(int i=0; i<vect.length;i++){
            if(vect[i] < 0){
                System.out.println(vect[i]);
            }
        }
    }
}
