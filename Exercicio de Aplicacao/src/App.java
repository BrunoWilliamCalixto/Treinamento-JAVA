import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int opcao;
        char resp = 'N';
        while (resp == 'N') {
            System.out.println("** \t\t\t Forma Geometrica** \n");
            System.out.println("1 - Retangulo");
            System.out.println("2 - Circunferência");
            System.out.println("3 -Triangulo");
            System.out.println("4 - Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    Retangulo ret = new Retangulo(0, 0);

                    System.out.println("Digite a base: ");
                    ret.setBase(leia.nextFloat());
                    System.out.println("Digite a altura: ");
                    ret.setAltura(leia.nextFloat());

                    ret.mostrar();

                    break;

                case 2:
                    Circunferencia circ = new Circunferencia(0);

                    System.out.println("Digite o raio do circulo: ");
                    circ.setRaio(leia.nextFloat());

                    circ.mostrar();

                    break;

                case 3:
                    Triangulo tri = new Triangulo(0.0f, 0.0f);
                    System.out.println("Digite a base: ");
                    tri.setBase(leia.nextFloat());
                    System.out.println("Digite a altura: ");
                    tri.setAltura(leia.nextFloat());

                    tri.mostrar();

                    break;

                case 4:
                    do {
                        System.out.print("Deseja realmente sair do programa? (S/N)");
                        resp = leia.next().toUpperCase().charAt(0);
                    } while (resp != 'N' && resp != 'S');
                    break;

                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        }
    }
}
