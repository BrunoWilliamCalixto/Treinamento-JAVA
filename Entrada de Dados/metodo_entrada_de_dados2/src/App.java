import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, s2, s3;

        s1 = sc.nextLine(); //NextLine é uma quebra de linha
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        //OBS: Se usarmos o nextInt, devemos preencher na linha debaixo com um nextLine, para que a absorção da linha possa acontecer, e assim não consumir os dados anteriores (limpar o buff de leitura)


        System.out.println("DADOS DIGITADOS:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        sc.close();
    }
}