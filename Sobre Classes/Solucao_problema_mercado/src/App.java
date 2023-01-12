import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        Produto p = new Produto();

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        p.nome = leia.nextLine();
        System.out.println("price: ");
        p.preco = leia.nextDouble();
        System.out.println("quantity in stock: ");
        p.qtd = leia.nextInt();

        System.out.println();
        System.out.println("Product data: " + p);
        System.out.println();

        System.out.print("Enter the number of products to be added in stock: ");
        int qtd = leia.nextInt();
        p.addProduto(qtd);
        System.out.println();
        
        System.out.println("Updated data: " + p);
        System.out.println();

        System.out.print("Enter the number of products to be removed in stock: ");
        qtd = leia.nextInt();
        p.removerProduto(qtd);

        System.out.println("Updated data: " + p);
        System.out.println();

        leia.close();

    }
}
