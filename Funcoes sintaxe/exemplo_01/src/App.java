import java.util.Scanner;

public class App {

    //Instanciando funções 

    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        System.out.println("Entre com 3 números: ");
        int a = leia.nextInt();
        int b = leia.nextInt();
        int c = leia.nextInt();

        int higher = max(a, b, c);

        showResult(higher);
        
    }

    public static int max(int x, int y, int z){
        int aux;
        if(x > y && x > z){
            aux = x;
        }
        else if(y > z){
            aux = y;
        }else{
            aux = z;
        }
        return aux;
    }

    public static void showResult(int valor){
        System.out.println("Maior = " + valor);
    }

    
}
