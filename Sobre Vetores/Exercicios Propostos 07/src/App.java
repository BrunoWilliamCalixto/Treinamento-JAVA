import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /* 
         * Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
        aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
        digitado, mostrar a mensagem "NENHUM NUMERO PAR" 

         */


        // Quando vamos converter numeros inteiros para pares, devemos declarar as variáveis primeiramente

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        int numeroDigitado, somaPares = 0, numerosPares = 0;
        double mediaPares;
        
        System.out.print("Quantos Elementos vai ter o Vetor? ");
        numeroDigitado = leia.nextInt();
        
        int[] vetorArmazenado = new int[numeroDigitado];
        

        for(int i = 0; i<numeroDigitado; i++){
            leia.nextLine();
            System.out.print("Digite um numero: ");
            vetorArmazenado[i] = leia.nextInt(); //vetor[i] armaneza os numeros nos vetores
        }

        
        for(int i = 0; i<numeroDigitado; i++){
            if(vetorArmazenado[i] %2==0){
                somaPares += vetorArmazenado[i];
                numerosPares++; // Incremento de números pares que foram digitados, ele irá armazenar todos os valores pares
            }
        }

        if(numerosPares == 0){
            System.out.println("NENHUM NUMERO PAR!");
        }else{
            mediaPares =  (double)somaPares / numerosPares; // (double)somaPares = realizar a conversão de inteiros para numeros reais

            System.out.printf("MEDIA DOS PARES = %.1f\n", mediaPares);
        }
        
    
        leia.close();
    }

}
