public class Retangulo extends Triangulo  {


    public Retangulo(float base, float altura) {
        super(base, altura);
        
    }

    @Override
    public float area() {
        float area;
        area = base * altura;
    
        return area;
    }

    @Override
    public void mostrar() {

        System.out.println("-----------------------------");
        System.out.println("Valor base " +getBase());
        System.out.println("Valor altura " +getAltura());
        System.out.println("Valor Area " +area());
        System.out.println("Valor perimetro " +perimetro());
        System.out.println("-----------------------------");
    }

    public float perimetro(){

        float perimetro = (base * altura) *2;

        return perimetro;
    }

}