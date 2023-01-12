package model;

import interfaces.ICamareira;
import interfaces.IRecepcionista;

public class Gerente extends Pessoa implements ICamareira, IRecepcionista{

    public Gerente(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
        
    }

    @Override
    public void atenderTelefone() {
        System.out.println("Sei mais ou menos atender o telefone");
        System.out.println();
    }

    @Override
    public void falarIngles() {
        System.out.println("Sei muito bem falar inglês");
        System.out.println();
    }

    @Override
    public void arrumarCama() {
        System.out.println("Sei mais ou menos arrumar a cama");
        System.out.println();
    }

    @Override
    public void limparQuarto() {
        System.out.println("Sei mais ou menos limpar o quarto");
        System.out.println();
    }

    //Se a classe não cumpre com todas as obrigações do sistema, ela não pode instanciar o contrato
    
}
