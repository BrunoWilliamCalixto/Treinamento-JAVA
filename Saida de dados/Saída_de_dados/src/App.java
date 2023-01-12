import java.util.Locale;

public class App {
    
    
    public static void main(String[] args) throws Exception {

        System.out.print("Hello, World! ");
        System.out.println("Bom dia!");

        double x = 10.90394;
        String nome = "Maria da Silva";
        int idade = 25;
        double renda = 4000.0;

        //-------------------------------------------

        String product1 = "Computer";
        String product2 = "Office desk";
    
        int age = 30;
        int code = 5290;
        char gender = 'F';
    
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

         System.out.printf("%.2f", x); // número de formato delimitado à 2
        System.out.println();
        System.out.printf("%.4f", x); 
        System.out.println();
        Locale.setDefault(Locale.US); // Delimita que o programa será convertido para o sistema Americano
        System.out.printf("%.4f", x); 
        System.out.println();

        System.out.println("Resultadoo = " + x + " metros");
        System.out.printf("Resultado = %.2f metros%n", x );

        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda); // %s = NOME | %d = INTEIRO | %f = PONTO FLUTUANTE | %n = QUEBRA DE LINHA
        System.out.println();
        
        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f%n", product1, price1);
        System.out.printf("%s, which price is $ %.2f%n", product2, price2);
        System.out.println();
        System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
        System.out.println();
        System.out.printf("Measue with eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);
        System.out.println();

    }
}
