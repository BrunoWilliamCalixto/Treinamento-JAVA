import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner (System.in);
        Locale.setDefault(Locale.US);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Entre com os lados do triângulo X: ");
        xA = leia.nextDouble();
        xB = leia.nextDouble();
        xC = leia.nextDouble();

        System.out.println("Entre com os lados do triângulo Y: ");
        yA = leia.nextDouble();
        yB = leia.nextDouble();
        yC = leia.nextDouble();

        double p = (xA + xB + xC) /2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) *(p - xC));

        p = (yA + yB + yC) /2.0;
        double areaY = Math.sqrt(p * (p - xA) * (p - xB) *(p - xC));

        System.out.printf("Área do triângulo X: %.4f%n", areaX);
        System.out.printf("Área do triângulo Y: %.4f%n", areaY);

        if(areaX > areaY){
            System.out.println("Area X é maior");
        }else if(areaX == areaY){
            System.out.println("As áreas são iguais");
        }else{
            System.out.println("Área Y é maior");
        }
    
        

        leia.close();
    }
}
