import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        List <String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");
        list.add(2, "Marco");


        System.out.println(list.size());

        
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("-----------------");

        list.removeIf(x -> x.charAt(0) == 'M'); //Lista utilizada para remover um predicado, algo que possa se iniciar com alguma letra ou tipo
        
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-----------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));

        System.out.println("-----------------");

        List<String> result = list.stream().filter(x -> x.charAt(0)=='A').collect(Collectors.toList()); // para filtrar nomes com determinado caractere, primeiro convertemos pra stream, fazemos a operação desejada, e em seguida usamos collect (Coletores) para buscar na lista.

        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("-----------------");
        //comando para encontrar elementos
        String name = list.stream().filter(x -> x.charAt(0)=='A').findFirst().orElse(null);
        System.out.println(name);

        leia.close();
    }
}
