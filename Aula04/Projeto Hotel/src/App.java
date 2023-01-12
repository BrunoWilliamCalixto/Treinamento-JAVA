import java.util.ArrayList;
import java.util.function.Predicate;

import model.Camareira;
import model.Cliente;
import model.EnumTipo;
import model.Recepcionista;
import model.Gerente;
import model.Quarto;

public class App {
    public static void main(String[] args) {

        System.out.println("Hotel Java");
        System.out.println();

        
       /*  Recepcionista recepcionista1 = new Recepcionista("Valeria", "65126851", "2114210101");

        recepcionista1.atenderTelefone();
        recepcionista1.falarIngles();

        Camareira camareira1 = new Camareira("Joana", "6218512315", "5841218412");

        camareira1.arrumarCama();
        camareira1.limparQuarto();

        //Atendente não pode trabalhar

        Gerente gerente1 = new Gerente("Fabricio", "5445616545","54324521520");

        gerente1.atenderTelefone();
        gerente1.falarIngles();

        Quarto quarto1 = new Quarto();

        quarto1.setNumero("260A");
        quarto1.setValor(100.00);
        quarto1.setTipo(EnumTipo.BASICO);

        Quarto quarto2 = new Quarto();

        quarto2.setNumero("360A");
        quarto2.setValor(300.00);
        quarto2.setTipo(EnumTipo.PRESIDENCIAL);

        System.out.println(quarto2.getTipo());
        System.out.println(quarto2.getTipo().getValor()); 
    }*/

        Cliente cliente1 = new Cliente("Manoel da Silva", "532184251", "546542165411",42);
        Cliente cliente2 = new Cliente("Joao da Silva", "532184251", "546542165411",21);
        Cliente cliente3 = new Cliente("Carol da Silva", "532184251", "546542165411",36);

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        
        //Retorna a quantidade de elementos presentes em uma stream(coleção)
        clientes.stream().count();
        
        clientes.stream().limit(2).forEach(c -> System.out.println(c.getNome()));

        clientes.stream().skip(2);

        //var resultado3 = clientes.stream().sorted();

        //clientes.stream().sorted(comparing(Cliente::getIdade));

        var resultado4 = clientes.stream().filter(c -> c.getIdade() > 25 );

        System.out.println(resultado4);


    }
}
