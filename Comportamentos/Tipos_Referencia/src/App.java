import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        int n = leia.nextInt();
        double[] vect = new double[n]; //Para se iniciar um vetor, devemos colocar a chave depois da declaração de variável, seguido por new (o tipo primitivo) fechando a chave e declarando a variável

        for(int i = 0; i<n; i++){
            vect[i] = leia.nextDouble();
        }

        double soma = 0.0;
        for(int i=0; i<n; i++){
            soma += vect[i];
        }

        double media = soma/n;

        System.out.printf("Soma Aritmética de %.2f", media);

        leia.close();
    }
}
