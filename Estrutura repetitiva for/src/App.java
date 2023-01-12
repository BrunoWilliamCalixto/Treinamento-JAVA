import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        /*Estruta for: possui a seguinte sintaxe || 
        
        for(início; condição; incremento ou decremento){
            comando 1
            comando 2....
        }
        */
       /* int n1 = leia.nextInt();
        int soma = 0 ;
        for(int i=0; i < n1; i++){
            int x = leia.nextInt();
            soma += x;

        }
        System.out.println(soma);

       int x1 = leia.nextInt();

       for(int i=1; i<=x1 ; i++){
        if(i%2 ==0){
            System.out.println(i);
        }
       } */ 

    /*  int n = leia.nextInt();

       int in = 0;
       int out = 0;

        for(int i = 0; i<n; i++){
            int x = leia.nextInt();
            if(x >= 10 && x <= 20){
            in = in + 1;
            }
            else{
            out = out + 1;
            }
        }
    

        System.out.println(in + " in");
        System.out.println(out + " out");*/ 

    /*  int n = leia.nextInt();

        for(int i=0; i<n;i++){
            double a = leia.nextDouble();
            double b = leia.nextDouble();
            double c = leia.nextDouble();

            double media = (a *2.0 + b*3.0 + c*5.0)/10;
            System.out.printf("%.1f%n", media);

        }
*/ 
        int n = leia.nextInt();
        
        for(int i=1; i<n; i++){
            
            int primeiro = i;
            int segundo = i*i;
            int terceiro = i*i*i;

            System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
        }

        
        
    }
}
