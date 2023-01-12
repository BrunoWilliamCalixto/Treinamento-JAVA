import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // Operadores lógicos, && = E , || = ou, ! = NÃO

        double hora;

        System.out.println("Que horas são?");
        hora = sc.nextDouble();

            if(hora <= 11.59){
                System.out.println("Bom dia");
            }else if(hora >= 12 && hora <= 17.59){
                System.out.println("Boa tarde");
            }else{
                System.out.println("Boa noite");
            }

        
        int numero;

        System.out.println("Jogo do IMPAR ou PAR");
        System.out.println("Digite um número: ");
        numero = sc.nextInt();

            if(numero %2==0){
                System.out.println(numero + " é par!");
            }else{
                System.out.println(numero + " é impar!");
            }

        int a,b,r,q;

        System.out.println("Numeros multiplos**");

        System.out.println("Digite o primeiro numero: ");
        a = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        b = sc.nextInt();

        q = a/b;
        r = a%b;

        if (q != 0 && r == 0){
            System.out.println(b + " é divisor de " + a);
        }else{
            System.out.println(b + " não é divisor de " + a);
        }

        double hrI, hrF, duracao;

        System.out.println("Hora do jogo**");
        System.out.println("Digite a hora inicial do jogo: ");
        hrI = sc.nextDouble();
        

        System.out.println("Digite o horario final do jogo: ");
        hrF = sc.nextDouble();

        if (hrI < hrF){
            duracao = hrF - hrI;
        }else{
            duracao = 24 - hrI + hrF;
        }

        System.out.println("O jogo durou: " + duracao + "hr(s)");







    }
}
