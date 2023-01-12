import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        double conta = 50;

        System.out.println("Digite o tempo de uso da internet: ");
        int minutos = leia.nextInt();

        if(minutos > 100){
            conta += (minutos - 100) * 2;
        }

        System.out.println("Valor a pagar é de: R$ " +conta);


        leia.close();

    }
}
