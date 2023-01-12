import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Locale.setDefault(Locale.US);
       Scanner leia = new Scanner(System.in);

        /*
         * Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa 
        que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número 
        de homens. 
         */

        int numeroDigitado, qtdMasculino, qtdMulheres = 0;
        double menorAltura, maiorAltura, mediaAlturaMulheres = 0;

        System.out.print("Quantas pessoas serao Digitadas? ");
        numeroDigitado = leia.nextInt();

        int[] vetor = new int[numeroDigitado];
        double[] altura = new double[numeroDigitado];
        char[] genero = new char[numeroDigitado];

        for(int i=0; i<vetor.length;i++){
            leia.nextLine();
            System.out.print("Altura da " + (i+1) + "° pessoa: ");
            altura[i] = leia.nextDouble();
            System.out.print("Genero da " + (i+1) + "° pessoa: ");
            genero[i] = leia.next().charAt(0);
            System.out.println();
        }

        menorAltura = altura[0];

        for(int i=0; i<vetor.length;i++){
            if(altura[i]<menorAltura){
                menorAltura = altura[i];
            }
        }

        maiorAltura = altura[0];

        for(int i=0; i<vetor.length;i++){
            if(altura[i]>maiorAltura){
                maiorAltura = altura[i];
            }
        }

        qtdMasculino = 0;

        for(int i=0; i<vetor.length; i++){
            if(genero[i] == 'M' || genero[i]=='m'){
                qtdMasculino++;
            }else if(genero[i] == 'F' || genero[i]=='f'){
                mediaAlturaMulheres += altura[i];
                qtdMulheres++;
            }else{
                System.out.println("COMANDO INVÁLIDO");
                leia.close();
            }
        }
            mediaAlturaMulheres = mediaAlturaMulheres / qtdMulheres;

        System.out.println("Menor altura = " + menorAltura);
        System.out.println("Maior altura = " + maiorAltura);
        System.out.printf("Média das mulheres = %.2f%n" , mediaAlturaMulheres);
        System.out.println("Número de homens =  " +qtdMasculino);

        

        leia.close();
    }
}
