import java.util.Locale;
import java.util.Scanner;

public class App {

    /*
     Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
        o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
        considerando a primeira posição como 0 (zero). 
     */
    
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        int n, posMaior;
        double maior;
        
        System.out.println("Digite quantos numeros serão armazenados:");
        n = leia.nextInt();

        double[] vetor = new double[n];

        for(int i=0; i<vetor.length;i++){
            System.out.println("Digite um numero");
            vetor[i] = leia.nextDouble();
        }
        maior = 0;
        posMaior = 0;

        for(int i=0; i<vetor.length;i++){
            if(vetor[i]>maior){
                maior = vetor[i];
                posMaior = i;
            }
        }
        
        System.out.println("MAIOR VALOR " + maior);
        System.out.println("POSIÇÃO MAIOR VALOR: " + posMaior);
        
        


    }
}
