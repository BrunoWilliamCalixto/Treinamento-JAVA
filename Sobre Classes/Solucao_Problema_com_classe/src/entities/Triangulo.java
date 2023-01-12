package entities;

public class Triangulo {
    public double a, b, c;

    // implementação de métodos = cálculo
    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}