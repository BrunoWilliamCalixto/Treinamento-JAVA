public class Calculadora {
    public static final double PI = 3.14159; // final existe para falar que a variável é uma constante, uma vez atribuído, ele não irá mudar mais

    public static double circunferencia(double raio) {
        return 2.0 * PI * raio;
    }

    public static double volume(double raio) {
        return 4.0 * PI * raio * raio * raio / 3;
    }
}
