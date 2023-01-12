import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        int n = leia.nextInt();
        int[][] mat = new int[n][n];

        // 2 for servem para percorrer uma matriz inteira
        for(int i=0; i<mat.length;i++){
            for(int j=0; j<mat[i].length; j++){
                mat[i][j] = leia.nextInt();
            }
        }

        System.out.println("Main Diagonal");
        for(int i=0;i<mat.length;i++){
            System.out.println(mat[i][i] + " ");
        }
        
        System.out.println();

        
        int count = 0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                if(mat[i][j]<0){
                    count++;
                }
            }
        }

        System.out.print("Negative numbers: " +count);
    }
}
