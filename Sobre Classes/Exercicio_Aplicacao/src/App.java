import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
        Retangulo ret = new Retangulo();

        System.out.println("Digite os valores de base do retangulo: ");
        ret.base = leia.nextDouble();
        System.out.println("Digite os valores de altura do retangulo: ");
        ret.altura = leia.nextDouble();
        System.out.println();

        System.out.println(ret);


        leia.close();

    }
}
