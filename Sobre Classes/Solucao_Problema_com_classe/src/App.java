import java.util.Locale;
import java.util.Scanner;
import entities.Triangulo;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        
        Triangulo x,y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Entre com os lados do triângulo X: ");
        x.a = leia.nextDouble();
        x.b = leia.nextDouble();
        x.c = leia.nextDouble();

        System.out.println("Entre com os lados do triângulo Y: ");
        y.a = leia.nextDouble();
        y.b = leia.nextDouble();
        y.c = leia.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Área do triângulo X: %.4f%n", areaX);
        System.out.printf("Área do triângulo Y: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Area X é maior");
        } else if (areaX == areaY) {
            System.out.println("As áreas são iguais");
        } else {
            System.out.println("Área Y é maior");
        }

        leia.close();
    }
}