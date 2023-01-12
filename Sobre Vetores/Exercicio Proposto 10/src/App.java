import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
        
        /*
         * azer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram 
        no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir 
        os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou 
        igual a 6.0 (seis). 
         */

         
        int numeroDigitado, posicaoAluno;
        double media;

        System.out.print("Quantos alunos serão digitados? ");
        numeroDigitado = leia.nextInt();

         int[] vetor = new int[numeroDigitado];
         String[] aluno = new String[numeroDigitado];
         double[]nota1 = new double[numeroDigitado];
         double[]nota2 = new double[numeroDigitado];

         for(int i=0; i<vetor.length;i++){
            leia.nextLine();
            System.out.println("Digite o nome, primeira e segunda nota do " + (i+1) + "° aluno: ");
            aluno[i] = leia.nextLine();
            nota1[i] = leia.nextDouble();
            nota2[i] = leia.nextDouble();
            System.out.println();
         }
            media = 0;
            posicaoAluno = 0;

        System.out.println("Alunos Aprovados: ");
        for(int i=0; i<vetor.length;i++){
            media = (nota1[i] + nota2[i])/2;

            if(media>=6){
                posicaoAluno = i;
                System.out.println(aluno[posicaoAluno]);
            }
        }

        System.out.println();
        
        System.out.println("Alunos Reprovados: ");
        for(int i=0; i<vetor.length;i++){
            media = (nota1[i] + nota2[i])/2;

            if(media<6){
                posicaoAluno = i;
                System.out.println(aluno[posicaoAluno]);
            }
        }
        

    }
}
