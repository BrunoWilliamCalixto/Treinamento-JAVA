import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
        
        /*
        Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
        devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
        da pessoa mais velha.

         */

        int numeroDigitado, idadeMaior, posicaoMaior;
        
        
        System.out.print("Quantas pessoas serao Digitadas? ");
        numeroDigitado = leia.nextInt();

        String[] nome = new String[numeroDigitado]; //nome e idade receberam um valor digitado
        int[] idade = new int[numeroDigitado];
        
        for(int i = 0; i<numeroDigitado; i++){
            leia.nextLine();
            System.out.println("Dados da " + (i + 1) + "° pessoa:");
            System.out.print("NOME: ");
            nome[i] = leia.nextLine();

            System.out.print("IDADE: ");
            idade[i] = leia.nextInt();

            System.out.println();
        }

        idadeMaior = idade[0];
        posicaoMaior = 0;

        for(int i = 0; i<numeroDigitado; i++){
            if(idade[i]>idadeMaior){
                idadeMaior = idade[i]; // para realizarmos a comparação de todos os vetores, colocamos uma condição comparando a uma variavel que receba um vetor
                posicaoMaior = i;
            }
        }
        System.out.printf("PESSOA MAIS VELHA: %s\n", nome[posicaoMaior]); // colocamos com concatenação, o vetor (nome) que recebe a posição de i, que se inicia com 0

         leia.close();
    }
}
