import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        System.out.println("Exercício Proposto, digite a quantidade de linhas e de colunas ");
        System.out.println("Número de linhas: ");
        int m = leia.nextInt();
        leia.nextLine();
        System.out.println("Número de colunas: ");
        int n = leia.nextInt();
        leia.nextLine();

        int[][] mat = new int[m][n];

        System.out.println("Digite os números de sua preferência: ");

        for(int i=0; i<mat.length; i++){
            System.out.println("Matriz do " + (i+1)+ "° quadrante");
            for(int j=0; j< mat[i].length; j++){
                mat[i][j] = leia.nextInt();
            }
        }

        System.out.print("Digite o valor para verificação da matriz: ");
        int x = leia.nextInt();


        // verificar as posições de acordo com as matrizes
        for(int i=0; i<mat.length; i++){
            for(int j=0; j< mat[i].length; j++){
                if(mat[i][j] == x){
                    System.out.println("Position: " + i + ", " + j + ":"); // Matriz da posição I e J são iguais ao número digitado

                    if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]); // Se a posição J for maior que zero, ele pega a posição de i e j e subtrai uma posição, ficando à esquerda
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]); // faz a verificação de i, caso seja maior que a posição zero, ele subtrai e sobe de posição
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]); // se J for menor que o número da quantidade da matriz -1, acrescenta a matriz da coluna, +1
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]); // se I for menor que o número da quantidade da matriz -1, acrescenta a matriz da linha, +1
					}
                }
            }
        }

        
    }
}
