import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); //Método de entrada de dados

        

        String a = sc.nextLine();
        int b = sc.nextInt();
        double c = sc.nextDouble();


        String x = sc.nextLine(); //next irá ler apenas a primeira string
        int y = sc.nextInt(); //Leitura de um número inteiro
        double x1 = sc.nextDouble(); //Leitura de um ponto flutuante
        char x2 = sc.next().charAt(0); //Leitura de apenas um caractere
        
        System.out.println("Digite um nome: ");
        
        System.out.println(x);

        System.out.println("Digite um numero: ");
        System.out.println("Você digitou: " + y);

        System.out.println("Digite um numero tipo double: ");
        System.out.printf("Você digitou: %.2f%n", x1);

        System.out.println("Agora digite um char: ");
        System.out.println("Voce digitou: " + x2);

        System.out.println("Digite um compilado de nome, numero e double:");
        System.out.println("Dados digitados:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);



        sc.close();
    }
}
