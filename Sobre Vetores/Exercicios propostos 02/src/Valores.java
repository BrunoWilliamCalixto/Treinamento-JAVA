public class Valores {
    private double numero;
    double resul;

    public Valores(double numero) {
        this.numero = numero;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double soma(){
        resul += numero;
        return resul;
    }
}


