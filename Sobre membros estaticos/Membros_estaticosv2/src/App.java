import java.util.Locale;
import java.util.Scanner;

public class App {
    //Não podemos chamar um método que não seja estático dentro de uma classe, para instanciar juntamente com uma classe estática
                                             

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
        

        System.out.println("Entre com o valor do raio: ");
        double raio = leia.nextDouble();

        double c = Calculadora.circunferencia(raio);
        double v = Calculadora.volume(raio);

        System.out.printf("Cincunferência: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.2f%n", Calculadora.PI);

        leia.close();
    }

    
}
