public class Circunferencia extends Forma{

    
    
    
    float raio;

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public Circunferencia(float r) {
        this.raio = r;
    }

    public float area(){

        float area = (float) (Math.PI * raio * raio);
        return area;
    }

    public float perimetro(){

        float perimetro = (float) (2 * Math.PI * raio);
        return perimetro;
    }

    @Override
    public void mostrar(){
        System.out.println("-----------------------------");
        System.out.printf("Valor de área é %.2f%n", area());
        System.out.printf("Valor do perimetro é %.2f%n", perimetro());
        System.out.println("-----------------------------");
    }

    
}
