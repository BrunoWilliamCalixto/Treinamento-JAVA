import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n1 = 10;
        int n2 = 10;
        int resultado = n1 + n2;

        System.out.println("Soma = " + resultado);

        double pi = 3.14159;
        double raio;
        double area;

        System.out.println("Digite o raio: ");
        raio = leia.nextDouble();
        area = pi * raio * raio;

        System.out.printf("Area = %.2f ", area);
        System.out.println();

        int A, B, C, D;
        int DIFERENCA;

        System.out.println("Digite o valor de A: ");
        A = leia.nextInt();
        System.out.println("Digite o valor de B: ");
        B = leia.nextInt();
        System.out.println("Digite o valor de C: ");
        C = leia.nextInt();
        System.out.println("Digite o valor de D: ");
        D = leia.nextInt();

        DIFERENCA = (A * B - C * D);

        System.out.println("A diferença é de: " + DIFERENCA);

        int fun, hr;
        double salario, valorTotal;

        System.out.println("Digite o número de funcionário: ");
        fun = leia.nextInt();
        leia.nextLine();

        System.out.println("Digite o número de horas trabalhadas: ");
        hr = leia.nextInt();
        leia.nextLine();

        System.out.println("Digite o salário base por hora: %2.f");
        salario = leia.nextDouble();

        valorTotal = salario * hr;

        System.out.println("NUMERO FUNCIONÁRIO: " + fun);
        System.out.printf("Salário total: R$: %.2f", valorTotal);

        leia.close();

    }
}
