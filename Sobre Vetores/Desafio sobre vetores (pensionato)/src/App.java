import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * A dona de um pensionato possui dez quartos para alugar para estudantes, sendo esses quartos identificados pelos números 0 a 9.
         * Fazer um programa que inicie com todos os dez quartos vazios, e depois uma quantidade N representando o número de estudantes que vão alugar 
         * quartos(N pode ser de 1 a 10). Em seguida, registre o alugel dos N estudantes. Para cada registro de aluguel, informar o nomeAluno e email do estudante
         * bem como qual dos quartos ele escolheu(0 a 9). Suponha que seja escolhido um quarto vago. Ao final, seu programa deve imprimir um relatório de todas ocupações do
         * pensionato, por ordem de quarto, conforme o exemplo.
         */

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        RegistroClientes[] vetor = new RegistroClientes[10];
        int numeroDigitado;

        System.out.print("Quantos quartos serão Registrados? ");
        numeroDigitado = leia.nextInt();

        for(int i=0; i<numeroDigitado; i++){
            leia.nextLine();
            System.out.println("Aluguel #" + (i+1));
            System.out.print("NomeAluno: ");
            String nomeAluno = leia.nextLine(); // Criação de variáveis temporárias

            System.out.print("Email: ");
            String email = leia.next();
            System.out.print("Quarto: ");
            int quarto = leia.nextInt();
            System.out.println();
    
            vetor[quarto] = new RegistroClientes(nomeAluno, email); // para alocar um quadro no vetor, passamos o vetor na primeira instância, seguido pela variável que recebe o nome da Classe em questão.
        }

        System.out.println("Quartos Alocados: ");

        for(int i=1; i<10; i++){
            if(vetor[i]!=null){ // condição que verifica vetor em ordem crescente e checa a condição verdadeira
                System.out.println(i + ": " + vetor[i]); //imprime na ordem por cada vetor alocado
            }
        }
            
        // para imprimirmos uma lista, não precisamos alocar dentro de uma classe, assim o código fica mais limpo e sujeito a alterações mais básicas
            
        
    }
}
