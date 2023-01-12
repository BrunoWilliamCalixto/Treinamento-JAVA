package entities;

public class Retangulo {
    public double base, altura;

    public double area(){

        return base * altura ;
    }

    public double Perimetro(){

        return (base + altura) * 2;
    }

    public double Diagonal(){

        double result = (base * base) + (altura *altura);

        return Math.sqrt(result);
    }

    public String toString(){

        return "AREA = " + String.format("%.2f", area())
        + "\nPERIMETRO = " + String.format("%.2f", Perimetro())
        + "\nDIAGONAL = " + String.format("%.2f", Diagonal());
    }
}
