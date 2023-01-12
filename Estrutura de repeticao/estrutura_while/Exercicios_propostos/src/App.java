import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        //Para que o while não entre em loopin infinito, temos que adicionar um método para que o mesmo possa solicitar o usuário uma nova informação
        System.out.println("Informe sua senha");
        int senha = leia.nextInt();

        while (senha != 2002){
            System.out.println("Acesso Negado");
            System.out.println("--------------------------------");
            System.out.println("tente novamente: ");
            senha = leia.nextInt();
        }

        System.out.println("Acesso Permitido");
        System.out.println("--------------------------------");

        int x, y;

        System.out.println("Digite a coordenada x: ");
        x = leia.nextInt();

        System.out.println("Digite a coordenada y: ");
        y = leia.nextInt();

        while(x != 0 && y != 0){
            if(x > 0 && y > 0){
                System.out.println("Primeiro");   
            }
            else if(x < 0 && y > 0){
                System.out.println("Segundo");
            }
            else if(x < 0 && y < 0){
                System.out.println("Terceiro");
            }
            else{
                System.out.println("Quarto");
            }
            
            System.out.println();
            System.out.println("Digite a coordenada x: ");
            x = leia.nextInt();

            System.out.println("Digite a coordenada y: ");
            y = leia.nextInt();
        }


        leia.close();
    }
}
