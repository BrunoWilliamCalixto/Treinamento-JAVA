import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
        int n;
        double mediaPorcentagem;

        System.out.println("Quantas pessoas serão digitadas? ");
        n = leia.nextInt();

        Pessoa[] pessoa = new Pessoa[n];
        System.out.println("Dados da pessoa: ");

        for(int i=0; i<pessoa.length;i++){
            leia.nextLine();

            System.out.print("Nome: ");
            String nome = leia.nextLine();

            System.out.print("\nIdade: ");
            int idade = leia.nextInt();

            leia.nextLine();
            System.out.print("\nAltura: ");
            double altura = leia.nextDouble();
            
            System.out.println("-------------------------------");
            pessoa[i] = new Pessoa(nome, idade, altura);
         
        }

        System.out.print("Altura média: ");

        double media = 0;

        for(int i=0; i<pessoa.length;i++){
            media += pessoa[i].getAltura();
        }

        media = media / pessoa.length;

        System.out.println("Resultado é " + media);
        
        System.out.print("Pessoas com menos de 16 anos: ");

        double nmenores = 0;

        for(int i=0; i<pessoa.length;i++){
            if(pessoa[i].getIdade()< 16 ){
               nmenores ++; 
            }
        }

        mediaPorcentagem = ((double)nmenores / n) *100.0;
        System.out.println(mediaPorcentagem + " %");
        
        for(int i=0; i<pessoa.length;i++){
            if(pessoa[i].getIdade()<16){
                System.out.println(pessoa[i].getNome());
            }
        }
    }
}
