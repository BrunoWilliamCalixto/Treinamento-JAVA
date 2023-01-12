public class Triangulo extends Forma {

   protected float base, altura;

        public float getBase() {
    return base;
    }

    public void setBase(float base) {
    this.base = base;
    }

    public float getAltura() {
    return altura;
}

    public void setAltura(float altura) {
    this.altura = altura;
    }

    public void Tiangulo(){

    }

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public float area() {

        float area;

        area = base * altura /2;

        return area;
    }

    @Override
    public void mostrar() {
        System.out.println("-----------------------------");
        System.out.printf("Valor de área é %.2f%n", area());
        System.out.println("-----------------------------");
    }

    
}
