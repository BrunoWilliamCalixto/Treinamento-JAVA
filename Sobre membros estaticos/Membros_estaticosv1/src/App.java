import java.util.Locale;
import java.util.Scanner;

public class App {
    
                                             

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("Entre com o valor do raio: ");
        double raio = leia.nextDouble();

        double c = calc.circunferencia(raio);
        double v = calc.volume(raio);

        System.out.printf("Cincunferência: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.2f%n", calc.PI);

        leia.close();
    }

    
}
