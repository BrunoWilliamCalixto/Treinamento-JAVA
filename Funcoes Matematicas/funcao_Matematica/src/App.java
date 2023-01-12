public class App {
    public static void main(String[] args) {
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x); //Recebe o resultado em raiz quadrada
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        
        System.out.println("Raiz quadrada de " + x + " = " + A); //Recebe o resultado em raiz quadrada
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0); // recebe o valor elevado
        C = Math.pow(5.0, 2.0);

        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado ao quadrado = " + B); //recebe os valores elevados ao quadrado
        System.out.println("5 elevado ao quadrado = " + C);

        A = Math.abs(y); //Recebe os valores absolutos, ou seja, tirar o valor negativo da operação
        B = Math.abs(z);
        System.out.println("Valor absoluto de " + y + " = " + A); //Recebe os valores absolutos
        System.out.println("Valor absoluto de " + z + " = " + B);
    }
}
