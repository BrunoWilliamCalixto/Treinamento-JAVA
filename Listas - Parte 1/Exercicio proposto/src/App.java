import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
        List<Funcionario>list = new ArrayList<>(); 

        System.out.print("Quantos funcionários serão registrados? ");
        Integer numeroDigitado = leia.nextInt();

        //Repetição de acordo com o número digitado;
        for(int i=0; i<numeroDigitado; i++){
            System.out.println("----------------------------");
            System.out.print("Funcionário n° " + (i+1));
            System.out.println();
            System.out.print("ID: ");
            Integer id = leia.nextInt();

            //Função de verificação de duplicidade
            while(hasId(list, id)){
                System.out.println("Esse ID já existe");
                System.out.print("ID: ");
                id = leia.nextInt();
            }

            leia.nextLine();
            

            System.out.print("Nome: ");
            String name = leia.nextLine();

            System.out.print("Salário inicial: ");
            Double salary = leia.nextDouble();

            // Instanciar um objeto Employee;
            Funcionario employee = new Funcionario(id, name, salary);

            //Adição de um objeto na lista;
            list.add(employee);
        }

        System.out.println("Entre com o ID para acréscimo de porcentagem: ");
        int idSalary = leia.nextInt();
        Funcionario fun = list.stream().filter(x->x.getId() == idSalary).findFirst().orElse(null);
        //Integer pos = position(list, idSalary); //Aqui estou procurando a posicao do acréscimo por id através da lista armazenada
        if(fun == null){
            System.out.println("----------------------------");
            System.out.println("Id não encontrado!");
        }else{
            System.out.println("----------------------------");
            System.out.print("Entre com a porcentagem: ");
            Double percent = leia.nextDouble();
            // Acessar na lista, a pos para aumentar o salário com método aumentoSalary
            fun.aumentoSalary(percent);
        }

        System.out.println();
        System.out.println("----------------------------");
        System.out.println("Lista de Funcionários: " );
        
        
        //para cada funcionario

        for(Funcionario f : list){
            System.out.println(f);
            System.out.println("----------------------------");
        }
    }


    //método que retorna a posição do id da lista
    public static Integer position(List<Funcionario>list, int id){
        for(int i=0; i<list.size();i++){
            if(list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Funcionario>list, int id){
        Funcionario fun = list.stream().filter(x->x.getId() == id).findFirst().orElse(null);
        return fun != null;
    }
}

/*  CORREÇÃO DE EXERCICIOS EM LIVE
 * list.get pega um elemento da posição
 * getId pega o Id instânciado na lista
 * 
 * 
 *  public Integer position(List<Employee> list, int id){
 *      for(int i=0; list.size();i++){
 *          if(list.get(i).getID() == id){
 *              return i;
 *          }
 *      }
 *      return null;
 *  }
 */
