import java.util.Locale;
import java.util.Scanner;

public class App {

    /* Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
        terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
        o vetor C gerado. 
 */

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        int numero;
        

        System.out.print("Quantos valores vai ter cada vetor? ");
        numero = leia.nextInt();
        
        int[]vetorA = new int[numero];
        int[]vetorB = new int[numero];
        int[] resultado = new int[numero];

        leia.nextLine();
        System.out.println("Digite os valores do vetor A");

        for(int i = 0; i<numero; i++){
            vetorA[i] = leia.nextInt();
        }

        leia.nextLine();
        System.out.println("Digite os valores do vetor B");

        for(int i = 0; i<numero; i++){
            vetorB[i] = leia.nextInt();
        }

        leia.nextLine();
        System.out.println("VETOR RESULTANTE: " );

        for(int i = 0; i<numero; i++){
            resultado[i] =  vetorA[i] + vetorB[i];

            System.out.println(resultado[i]);
        }
        
       
        
        
    }
}




